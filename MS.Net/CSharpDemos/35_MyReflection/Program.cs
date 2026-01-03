using _33_CustomAttribute2;
using System.Reflection;

namespace _35_MyReflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String filePath = @"C:\Users\IET\Desktop\Sakshi_Ghodekar_250845920068\MS.Net\CSharpDemos\34_EmployeeLib\bin\Debug\net8.0\34_EmployeeLib.dll";
            Assembly assm = Assembly.LoadFile(filePath);
            Type[] typeArr= assm.GetTypes();

            for(int i=0; i<typeArr.Length; i++)
            {
                Type t = typeArr[i];
                String query = "CREATE TABLE ";
                Attribute[] tarr = t.GetCustomAttributes().ToArray();
                for (int j = 0; j < tarr.Length; j++)
                {
                    Attribute a = tarr[j];
                    if (a is MyTableAttribute)
                    {
                        MyTableAttribute c= a as MyTableAttribute;
                        query += $"{c.Name} (";
                    }
                }
                PropertyInfo[] pArr = t.GetProperties();
                for(int j =0; j<pArr.Length; j++)
                {
                    Attribute[] PropAttr = pArr[j].GetCustomAttributes().ToArray();
                    for(int k=0; k<PropAttr.Length; k++)
                    {
                        Attribute a= PropAttr[k];
                        if(a is MyColoumnAttribute)
                        {
                            MyColoumnAttribute c = a as MyColoumnAttribute;
                            query += $"{c.Name} {c.DataType} ,";
                        }
                    }
                }
                query = query.TrimEnd(',') + ");";
                Console.WriteLine(query);
            }
        }
    }
}
