using _31_CustomAttribute;
using System.Linq;
using System.Reflection;

namespace _32_MyApplication
{
    internal class Program
    {

        static void Main(string[] args)
        {
            Employee emp = new Employee();
            emp.Id = 1;
            emp.Name = "Samarth";

            MyCustomAttribute attrArr = typeof(Employee).GetCustomAttributes(typeof(MyCustomAttribute), false)[0] as MyCustomAttribute;
            Console.WriteLine(attrArr.AttrId);
            Console.WriteLine(attrArr.AttrName);

            MethodInfo[] mArr = typeof(Employee).GetMethods();
            foreach (MethodInfo m in mArr)
            {
                Console.WriteLine(m.Name);
                ParameterInfo[] pArr = m.GetParameters();
                foreach (ParameterInfo p in pArr)
                {
                    Console.WriteLine(p.Name);
                }
                Console.WriteLine();
            }
            Console.WriteLine($"Employee detail: empId={emp.Id}  , empName={emp.Name}");
        }
    }

    [MyCustom (AttrId = 1 , AttrName ="CustomId1")]
    public class Employee
    {
        private int _Id;
        private string _Name;


        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }

        public String Name
        {
            get { return _Name; }
            set { _Name=value; }
        }

    }
 }
