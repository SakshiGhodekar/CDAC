using Microsoft.Data.SqlClient;

namespace _42_Demo_ConnectedAdoNet
{
    internal class Program
    {
        static void Main(string[] args)
        { 

            string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True";

            #region select query

            //SqlConnection conn =new SqlConnection(connectionString);
            //string selectQuery = "select * from Emp";
            //SqlCommand cmd = new SqlCommand(selectQuery, conn);

            //cmd.CommandType=System.Data.CommandType.Text;
            //cmd.CommandText=selectQuery;
            //cmd.Connection = conn;

            //conn.Open();

            //SqlDataReader reader=cmd.ExecuteReader();
            //while (reader.Read())
            //{
            //    int id=Convert.ToInt32(reader["id"]);
            //    String? nm = reader["Name"].ToString();
            //    String? Adr = reader["Address"].ToString();
            //    Console.WriteLine($"id={id},name={nm},address={Adr}");
            //}
            //conn.Close();

            //SqlConnection con = new SqlConnection(connectionString);

            //string selectQuery = "SELECT * FROM Emp";

            //SqlCommand cmd = new SqlCommand();
            //cmd.CommandType = System.Data.CommandType.Text;
            //cmd.CommandText = selectQuery;
            //cmd.Connection = con;

            //con.Open();

            //SqlDataReader reader = cmd.ExecuteReader();
            //while (reader.Read())
            //{
            //    int id = Convert.ToInt32(reader["Id"]);
            //    string? nm = reader["Name"].ToString();
            //    string? address = reader["Address"].ToString();
            //    Console.WriteLine($"Id:{id}, Name: {nm}, Address: {address}");
            //}

            //con.Close();
            #endregion

            #region insert query
            SqlConnection conn=new SqlConnection(connectionString);
            Console.WriteLine("enter name of employee");
            string? nm=Console.ReadLine();
            Console.WriteLine("enter Address of employee");
            string? adrr = Console.ReadLine();

            string insertquery = "insert into Emp (Name,Address) values('{nm}','{adrr}')";

            SqlCommand cmd = new SqlCommand();
            cmd.CommandType=System.Data.CommandType.Text;
            cmd.CommandText=insertquery;
            cmd.Connection = conn;

            conn.Open();

           int rowAffected=cmd.ExecuteNonQuery();
            if (rowAffected> 0)
            {
                Console.WriteLine("record inserted successfully");
            }
            else
            {
                Console.WriteLine("not inserted");
            }
            #endregion

            #region UPDATE QUERY
            //SqlConnection con = new SqlConnection(connectionString);

            //Console.WriteLine("Enter Id for Emp to be updated");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Name to be updated:");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter Address to be updated");
            //string add = Console.ReadLine();

            //string updateQuery = $"UPDATE Emp SET NAME='{nm}', ADDRESS='{add}' WHERE ID = {id}";

            //SqlCommand cmd = new SqlCommand(updateQuery, con);

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record updated successfully!!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion

            #region DELETE QUERY
            //SqlConnection con = new SqlConnection(connectionString);

            //Console.WriteLine("Enter Id for Emp to be deleted");
            //int id = Convert.ToInt32(Console.ReadLine());

            //string deleteQuery = $"DELETE FROM Emp WHERE ID={id}";

            //SqlCommand cmd = new SqlCommand(deleteQuery, con);

            //con.Open();

            //int noOfRowsAffected = cmd.ExecuteNonQuery();
            //if (noOfRowsAffected > 0)
            //{
            //    Console.WriteLine("Record deleted successfully!!");
            //}
            //else
            //{
            //    Console.WriteLine("Error");
            //}

            //con.Close(); 
            #endregion
        }
    }
}
