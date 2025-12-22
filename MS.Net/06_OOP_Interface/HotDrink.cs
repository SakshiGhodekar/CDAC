using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06_OOP_Interface
{
    internal class HotDrink : IDrink
    {
        public void GetDrink()
        {
            Console.WriteLine("hot drink");
        }
    }
}
