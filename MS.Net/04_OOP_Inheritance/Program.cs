namespace _04_OOP_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 c = new Class1();
            c.method1();
            c.method2();
            Class2 class2 = new Class2();
            class2.method1();
            class2.method2();
            Class1 c1 = new Class2();
            c1.method1();
            c1.method2();
        }
    }
}
