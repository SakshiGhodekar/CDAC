namespace _05_Demo_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DerivedClass d = new DerivedClass();
            Console.WriteLine(d.add(2, 5));
            Console.WriteLine(d.sub(10, 5));
            Console.WriteLine(d.mult(10, 5));
           
           
        }
    }
}
