namespace _22_DemoCollection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region arr demo
            //int[] arr = new int[5];
            //arr[0] = 1;
            //arr[2] = 3;
            //arr[3] = 4;
            //arr[4] = 5;
            //arr[1] = 2;

            //for (int i = 0; i < arr.Length ; i++)
            //{
            //    Console.WriteLine(arr[i]);


            #endregion


            //Student[] arr = new Student[3];
            //arr[0] = new Student(1, "samarth", "satara");
            //arr[1] = new Student(2, "ram", "abc");
            //arr[2] = new Student(3, "sham", "kolhapur");

            //foreach(Student s in arr)
            //{
            //    Console.WriteLine(s);
            //}

            #region string
            //    string[] names=new string[3];
            //    names[0] = "abc";
            //    names[1] = "pdsh";
            //    names[2] = "ass";
            //    for(int i=0; i<names.Length; i++)
            //    {
            //        Console.WriteLine(names[i]);

            //    }

            //}

            #endregion
            #region boxin/unboxing
            Emp emp1 = new Emp();
            emp1.Id = 1;
            emp1.Name = "sakshi";
            emp1.Address = "avabs";

            Emp emp2 = new Emp();
            emp2.Id = 2;
            emp2.Name = "fdhsfgs";
            emp2.Address = "avabs";

            Emp emp3 = new Emp();
            emp3.Id = 3;
            emp3.Name = "jhgfsdf";
            emp3.Address = "avabs";

            Emp[] emp = new Emp[3];
            emp[0] = emp1;
            emp[1] = emp2;
            emp[2] = emp3;

            for (int i = 0; i < emp.Length; i++)
            {
                Console.WriteLine($"id={emp[i].Id} ,name={emp[i].Name} ,address={emp[i].Address}");
            }

            Object[] obj = new object[4];
            obj[0] = 1;
            obj[1] = "sakshi";
            obj[2] = emp1;
            obj[3] = 22.22;

            for (int i = 0; i < obj.Length; i++)
            {
                Object element = obj[i];
                if (element is int)
                {

                    int n = Convert.ToInt32(element);

                    Console.WriteLine($"value={n} Type={element.GetType()}");
                }
                if(element is String)
                {
                    String s = Convert.ToString(element);
                    Console.WriteLine($"value={s} Type={element.GetType()}");

                }
                if (element is double)
                {
                    double d = Convert.ToDouble(element);
                    Console.WriteLine($"value={d} Type={element.GetType()}");

                }
                if (element is Object)
                {
                    Object o = element;
                    Console.WriteLine($"value={o} Type={element.GetType()}");

                }
            }
            #endregion
        }
        public class Student
        {
            private int _Id;
            private String _Name;
            private String _Address;
            private String _abc;

            public String abc
            {
                get { return _abc; }
                set { _abc = value; }
            }




            public Student(int id, string name, string address)
            {
                Id = id;
                Name = name;
                Address = address;

            }

            public String Address
            {
                get { return _Address; }
                set { _Address = value; }
            }


            public String Name
            {
                get { return _Name; }
                set { _Name = value; }
            }


            public int Id
            {
                get { return _Id; }
                set { _Id = value; }
            }

            public override string ToString()
            {
                return $"id  : {_Id} , name: {_Name} , address: {_Address}";
            }

        }
        public class Emp
        {
            private int _Id;
            private String _Name;
            private String _Address;

            public String Address
            {
                get { return _Address; }
                set { _Address = value; }
            }

            public String Name
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
            public override string ToString()
            {
                return $"Id={_Id} Name={_Name} Address={_Address}";
            }
        }
    }
}
