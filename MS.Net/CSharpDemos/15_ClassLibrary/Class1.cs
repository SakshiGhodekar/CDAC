using System.Runtime.CompilerServices;

namespace _15_ClassLibrary
{
  

    public class Cmath
    {
        public int add(int x , int y)
        {
            return x + y;
        }

        protected int subtract(int x , int y)  
        {
            return x - y;
        }

        protected internal int multiply(int x, int y)
        {
            return x * y;
        }

        internal int square(int x)
        {
            return x * x;
        }
    }
}
