namespace _26_Demo_FileIO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filepath = @"C:\Users\IET\Desktop\Sakshi_Ghodekar_250845920068\.net\CSharpDemos\26_Demo_FileIO\Files\data1.txt";

            #region streamWriter
            //FileStream fs = null; 


            //if (File.Exists(filepath)) {
            //   fs= new FileStream(filepath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs=new FileStream(filepath, FileMode.OpenOrCreate, FileAccess.Write);

            //}
            //StreamWriter writer = new StreamWriter(fs);
            //writer.WriteLine("abc");
            //writer.WriteLine("pqr");
            //writer.Flush();
            //fs.Close();
            //Console.WriteLine("done");

            #endregion

            #region streamReader
            //FileStream fs = null;
            //if (File.Exists(filepath))
            //{
            //    fs = new FileStream(filepath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File not existes");
            //}
            //StreamReader reader = new StreamReader(fs);
            //string content= reader.ReadToEnd();
            //reader.Close();
            //fs.Close();
            //Console.WriteLine(content);
            #endregion

            #region StreamWriter
            Emp emp = new Emp();
            emp.Id= 1;
            emp.Name = "sakshi";
            emp.Address = "pune";

            FileStream fs = null;
            if (File.Exists(filepath)) { 

               fs=new FileStream(filepath,FileMode.Append,FileAccess.Write);
            }
            else
            {
               fs=new FileStream(filepath,FileMode.OpenOrCreate,FileAccess.Write);
            }
            StreamWriter writter= new StreamWriter(fs);
            writter.Write(emp);
            writter.Flush();
            fs.Close();
            Console.WriteLine("done");
            #endregion
        }
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
