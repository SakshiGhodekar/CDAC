using System.Xml.Serialization;

namespace _28_Demo_Serialization
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Emp emp = new Emp();
            emp.Id = 1;
            emp.Name = "Test";
            emp.Address = "pune";

            string filepath = @"C:\Users\IET\Desktop\Sakshi_Ghodekar_250845920068\MS.Net\CSharpDemos\28_Demo_Serialization\Files\data1.xml";
            string filepath1 = @"C:\Users\IET\Desktop\Sakshi_Ghodekar_250845920068\MS.Net\CSharpDemos\28_Demo_Serialization\Files\data2.json";
            #region Serialization :XmlSerialization
            //FileStream fs = null;
            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);
            //}
            //XmlSerializer xs = new XmlSerializer(typeof(Emp));
            //xs.Serialize(fs, emp);
            //fs.Close();
            //Console.WriteLine("done");
            #endregion

            #region XML DeSerialization
            //FileStream fs = null;

            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //Emp empData = xr.Deserialize(fs) as Emp;
            //fs.Close();
            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");
            #endregion

            #region JSON Serialization 

            //FileStream fs = null;

            //if (File.Exists(filePath1))
            //{
            //    fs = new FileStream(filePath1, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath1, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //JsonSerializer.Serialize<Emp>(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done"); 
            #endregion

            #region JSON DeSerialization
            //FileStream fs = null;

            //if (File.Exists(filePath1))
            //{
            //    fs = new FileStream(filePath1, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //Emp empData = JsonSerializer.Deserialize<Emp>(fs);
            //fs.Close();
            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");
            #endregion


        }
    }
        public class Emp
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

