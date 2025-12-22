using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05_Demo_Inheritance
{
    internal class DerivedClass:BaseClass
    {
       
        public new int add(int x, int y)
        {
            return x + y*100;
        }
        public int sub(int x, int y)
        {
            return x - y;
        }
        public int mult(int x, int y)
        {
            return x * y*100;
        }
    }
}
