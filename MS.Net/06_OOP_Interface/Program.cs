namespace _06_OOP_Interface
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Intrface1


            //IDrink I1 = new ColdDrink();
            //I1.GetDrink();
            //IDrink I2=new HotDrink();
            //I2.GetDrink();
            #endregion
            #region Interface_Using_switchcase


            int choice; 
            do
            {

                Console.WriteLine("1.cold drink 2. hot drink ");
                Console.WriteLine("enter choice");
                choice =Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {

                    case 1:
                        IDrink c = new ColdDrink();
                        c.GetDrink();
                        break;
                    case 2:
                        IDrink c1 = new HotDrink();
                        c1.GetDrink();
                        break;
                    default:
                        Console.WriteLine("invalid choice");
                        break;
                }
            } while (choice!=3);
          
            #endregion



        }
    }
}
