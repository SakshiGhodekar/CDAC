namespace _19_EventsandDeligates
{

    public delegate void MyDelegate();

    internal class Program
    {
        
        static void Main(string[] args)
        {
            
            MyClass c1 = new MyClass();
            c1._MyEvent += new MyDelegate(greet);
            c1.invokeEvent();
        }

        public static void greet()
        {
            Console.WriteLine("hello world");
        }

        public class MyClass
        {
            public event MyDelegate _MyEvent;

            public void invokeEvent()
            {
                _MyEvent.Invoke();
            }
        }
    }
}
