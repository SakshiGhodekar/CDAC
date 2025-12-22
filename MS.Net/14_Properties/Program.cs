using System.Diagnostics.CodeAnalysis;

namespace _14_Properties
{

    public class Employee
    {
        private int _id;
        private String _name;

        public int id
        {
            private get
            {
                return _id;
            }
            set
            {
                _id = value;
            }
        }

        public String name
        {
            get
            {
                return _name;
            }
            set
            {
                this._name = value;
            }
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();
            emp.name = "samarth";
            emp.id = 10;
            Console.WriteLine(emp.name);
        }
    }
}
