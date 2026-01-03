namespace _18_deliates
{
    internal class Program
    {

        public delegate void MyDeligate();
        static void Main(string[] args)
        {
            MyDeligate deligate = new MyDeligate(greet);
            deligate.

        }

        static public void greet()
        {
            Console.WriteLine("hello world");
        }
    }
}
