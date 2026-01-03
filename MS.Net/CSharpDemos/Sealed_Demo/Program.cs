using System.Security.Cryptography.X509Certificates;

namespace Sealed_Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {

            #region sealeddemo1

            //Demo d =new Demo();
            //Console.WriteLine(d.Add(2, 2));

            #endregion
            Print p = new Print();
            p.show();
            p.show1();
            Print p1 = new Print1();
            p1.show();
            p1.show1();
            Print p2 = new Print2();
            p2.show();
            p2.show1();
        }
        
           
        //public class Demo
        //{
        //    public int Add(int x, int y)
        //    {
        //        return x + y;
        //    }
           
        //}
        public class Print
        {

            public virtual void show()
            {
                Console.WriteLine("in show method");
            }
            public virtual void show1()
            {
                Console.WriteLine("in show1 method");
            }

        }
        public class Print1:Print
        {

            public sealed override void show()
            {
                Console.WriteLine("in print1 show method");
            }
            public override void show1()
            {
                Console.WriteLine("in print1 show1 method");
            }

        }
        public class Print2 : Print1
        {

            public void show()
            {
                Console.WriteLine("in print2 show method");
            }
            public override void show1()
            {
                Console.WriteLine("in print2 show1 method");
            }

        }
    }
}
