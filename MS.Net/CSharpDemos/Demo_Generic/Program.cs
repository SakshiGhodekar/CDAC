namespace Demo_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Number n = new Number();
            int x = 2;
            int y=3;
            Console.WriteLine("before swap");
            Console.WriteLine($"X={x} Y={y}");
            Console.WriteLine("after swap");

            n.swap(ref x,ref y);
            Console.WriteLine($"X={x} Y={y}");
        }
    }
    public class Number
    {
        public void swap(ref int x, ref int y)
        {
            int temp = x;
            x = y;
            y = temp;
           
        }
    }
}
