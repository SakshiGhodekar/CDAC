using _43_conArch.DAL;
using _43_conArch.Model;

namespace _43_conArch
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DbContext context = new DbContext("Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True");
            while (true)
            {
                Console.WriteLine("1.Select Employee in Database");
                Console.WriteLine("2.Select Employee By Id in Database");
                Console.WriteLine("3.Insert Employee in Database");
                Console.WriteLine("4.Update Employee in Database");
                Console.WriteLine("5.Delete Employee in Database");

                Console.WriteLine("Enter your choice.");
                int opChoice = Convert.ToInt32(Console.ReadLine());

                switch (opChoice)
                {
                    case 1:
                        List<Employee> allEmployee = context.findAllEmloyees();
                        if (allEmployee.Count == 0)
                        {
                            Console.WriteLine("No Employee Present");
                        }
                        else
                        {
                            foreach (var item in allEmployee)
                            {
                                Console.WriteLine($" id : {item.id}  , name:{item.name} , address :{item.address}");
                            }
                        }
                            break;


                    case 2:
                        Console.WriteLine("Enter Employee id to search Employee");
                        int idToBeSearched = Convert.ToInt32(Console.ReadLine());
                        Employee emp = context.findEmpById(idToBeSearched);
                        if (emp != null)
                        {
                            Console.WriteLine($" id : {emp.id}  , name:{emp.name} , address :{emp.address}");
                        }
                        else
                        {
                            Console.WriteLine("Error! Can't find Employee");
                        }
                            break;


                    case 3:
                        Console.WriteLine("Enter employee name");
                        string nameToBeInsert = Console.ReadLine();
                        Console.WriteLine("Enter EmployeeAddress");
                        string addressToBEInsert = Console.ReadLine();

                        Employee empToBeInsert = new Employee() { name = nameToBeInsert, address = addressToBEInsert };
                        int InsertCount = context.InsertEmployee(empToBeInsert);

                        if (InsertCount > 0)
                        {
                            Console.WriteLine("Empoyee inserted successfully");
                        }
                        else
                        {
                            Console.WriteLine("Error occues during insertion of employee.");
                        }
                            break;


                    case 4:
                        Console.WriteLine("Enter Employee id to search Employee");
                        int idToBeUpdates = Convert.ToInt32(Console.ReadLine());
                        Console.WriteLine("Enter employee name");
                        string nameToBeUpdates = Console.ReadLine();
                        Console.WriteLine("Enter EmployeeAddress");
                        string addressToUpdates = Console.ReadLine();

                        Employee empToBeUpdates = new Employee() {id = idToBeUpdates ,  name = nameToBeUpdates, address = addressToUpdates };
                        int UpdateCount = context.UpdateEmployee(empToBeUpdates);

                        if (UpdateCount > 0)
                        {
                            Console.WriteLine("Empoyee updates successfully");
                        }
                        else
                        {
                            Console.WriteLine("Error occues during insertion of employee.");
                        }
                        break;


                    case 5:
                        Console.WriteLine("Enter Employee id to search Employee");
                        int idToBeDeleted = Convert.ToInt32(Console.ReadLine());

                       int DeleteCount = context.DeleteEmployee(idToBeDeleted);

                        if (DeleteCount > 0)
                        {
                            Console.WriteLine("Empoyee deleted successfully");
                        }
                        else
                        {
                            Console.WriteLine("Error occues during insertion of employee.");
                        }
                        break;
                    default:
                        Console.WriteLine("Invalid Choice.");
                        break;
                }

                Console.WriteLine("Do you want to continue? (y/n)");
                string ynChoice = Console.ReadLine();
                if (ynChoice == "n")
                {
                    Console.WriteLine("Thank you for visiting......");
                    break;
                }
                
            }
        }
    }
}
