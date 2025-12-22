using System.Security.Cryptography.X509Certificates;

namespace _19_Multicaste_Delegate
{
    internal class Program
    {
        public delegate void Mydelegate(String S);
        static void Main(string[] args)
        {
            MyClass cq = new MyClass(); ;
            cq.deligate += meth1;
            cq.deligate += meth2;

            cq.invoke("first", "second");
        }

        public static void meth1(String s)
        {
            Console.WriteLine("meth1 of 1111111111    "+s);
        }

        public static void meth2(String s)
        {
            Console.WriteLine("meth2 of 222222222     " + s);
        }

        class MyClass
        {
            public event Mydelegate deligate;
            
            public void invoke(params String[] s)
            {
                Delegate[] arr = deligate.GetInvocationList();
                for (int i = 0; i < arr.Length; i++)
                {
                    arr[0].DynamicInvoke(s[i]);
                }
            }
        }
    }
}
