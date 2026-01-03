namespace _47_ExceptionHandling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("enter 1st number");
                int n1=Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("enter 2nd number");
                int n2=Convert.ToInt32(Console.ReadLine());

                if (n2 == 0)
                {
                    throw new MyCostomException("number cannot be 0");
                }

                int result = n1 / n2;
                Console.WriteLine($"result is:{result}");
            }
            catch (MyCostomException obj)
            {
                Console.WriteLine(obj.MyMessage);

            }
            catch (DivideByZeroException exe)
            {
                Console.WriteLine(exe.Message);
            }
            catch(Exception ex) 
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Console.WriteLine("Finally block");
            }
        }
    }
    public class MyCostomException : Exception
    {
        public string MyMessage {  get; set; }
        public MyCostomException(string msg) { 
        MyMessage = msg;
        }
    }
}
