namespace _03DemoDataTypes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = 10;
            int y = 100;
            string str = "hello";
            double d = 3.145;
            Console.WriteLine("x={0},y={1},d={2}", x, y, d);
            Object obj=new object();
            //boxing
            obj = x;
            Console.WriteLine(obj);
            Console.WriteLine(str);
            str = Convert.ToString(x);
            Console.WriteLine(str);
        }
    }
}
