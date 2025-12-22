using System.Runtime.Serialization.Formatters.Binary;

namespace _27_Demo_Binary_Serialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Emp emp = new Emp();
            emp.Id = 1;
            emp.Name = "sakshi";
            emp.Address = "pune";
            string filepath = @"C:\Users\IET\Desktop\Sakshi_Ghodekar_250845920068\.net\CSharpDemos\26_Demo_FileIO\Files\data1.txt";
            #region Binary Formatter:serialize

            //FileStream fs = null;
            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //BinaryFormatter formatter = new BinaryFormatter();
            //formatter.Serialize(fs, emp);
            //fs.Close();
            //Console.WriteLine("done");
            #endregion
            #region BinaryFormatter : Deserialize

            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //BinaryFormatter bf = new BinaryFormatter();
            //Emp empData = bf.Deserialize(fs) as Emp;
            //fs.Close();

            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");

            #endregion

        }

        [Serializable]
        class Emp
        {
            private int _Id;
            private string _Name;
            private string _Address;

            public string Address
            {
                get { return _Address; }
                set { _Address = value; }
            }

            public string Name
            {
                get { return _Name; }
                set { _Name = value; }
            }

            public int Id
            {
                set
                {
                    _Id = value;
                }
                get
                {
                    return _Id;
                }
            }
        }
    }

}