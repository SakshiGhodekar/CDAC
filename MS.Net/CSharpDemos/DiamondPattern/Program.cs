namespace DiamondPattern
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = 3;
            for(int i = 0; i < n; i++)
            {
                for (int j = 0; j < n - i; j++)
                    Console.Write(" ");
                Console.Write("*");
                if (i > 0)
                {
                    for(int j=0;j<(2*i-1);j++)
                        Console.Write(" ");
                    Console.Write("*");
                }
                Console.WriteLine();
            }
           for(int i = n - 2; i >= 0; i--)
            {
                for (int j = 0; j < n - i; j++)
                    Console.Write(" ");
                Console.Write("*");
                if (i > 0)
                {
                    for (int j = 0; j <(2*i-1); j++)
                        Console.Write(" ");
                    Console.Write("*");
                }
                Console.WriteLine();

            }
            
        }
    }
}
