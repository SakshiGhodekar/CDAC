using Microsoft.Data.SqlClient;

namespace _42_connArch
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string conString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True";

            #region Insert Query
            //SqlConnection con = new SqlConnection(conString);
            //Console.WriteLine("Enter Employee Id :");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Employee name:");
            //string name = Console.ReadLine();
            //Console.WriteLine("Enter Employee Address :");
            //string address = Console.ReadLine();

            //SqlCommand com = new SqlCommand($"INSERT INTO EMPLOYEE VALUES (" +
            //                                $"{id} , '{name}' , '{address}')" , con);
            //con.Open();
            //int i = com.ExecuteNonQuery();
            //if (i > 0)
            //{
            //    Console.WriteLine("Record inserted successfully");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}
            // con.Close()

            #endregion


            #region select query
            //SqlConnection con = new SqlConnection(conString);
            //SqlCommand cmd = new SqlCommand("SELECT * FROM EMPLOYEE", con);
            //con.Open();
            //SqlDataReader reader = cmd.ExecuteReader();
            //while (reader.Read())
            //{
            //    int id = Convert.ToInt32(reader["Id"]);
            //    string name = reader["Name"].ToString();
            //    string Address = reader["Address"].ToString();
            //    Console.WriteLine($"id : {id} , name : {name} , Address :{Address} ");
            //}
            //con.Close();
            #endregion

            #region update  query

            //SqlConnection con = new SqlConnection(conString);
            //Console.WriteLine("Enter Employee Id :");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Employee name:");
            //string name = Console.ReadLine();
            //Console.WriteLine("Enter Employee Address :");
            //string address = Console.ReadLine();

            //SqlCommand com = new SqlCommand($"UPDATE EMPLOYEE SET Name='{name}' , Address='{address}' where Id ={id}" , con);
            //con.Open();
            //int i = com.ExecuteNonQuery();
            //if (i > 0)
            //{
            //    Console.WriteLine("Record inserted successfully");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}
            //con.Close();

            #endregion

            #region delete query

            SqlConnection con = new SqlConnection(conString);
            Console.WriteLine("Enter Employee Id :");
            int id = Convert.ToInt32(Console.ReadLine());

            SqlCommand com = new SqlCommand($"DELETE FROM EMPLOYEE WHERE Id ={id}", con);
            con.Open();
            int i = com.ExecuteNonQuery();
            if (i > 0)
            {
                Console.WriteLine("Record inserted successfully");
            }
            else
            {
                Console.WriteLine("Error");
            }
            con.Close();

            #endregion
        }
    }
}
