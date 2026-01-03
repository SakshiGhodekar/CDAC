using Microsoft.Data.SqlClient;
using System.ComponentModel.Design.Serialization;

namespace _44_ConnectedArchStoredProcedure
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String conString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True";
            int res=insertDepartment(conString, "IT");
            Console.WriteLine(res);
        }

        public static int insertDepartment(string conString ,string deptName)
        {
            SqlConnection con = new SqlConnection(conString);
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = con;
            cmd.CommandText = "InsertDepartment";
            cmd.CommandType = System.Data.CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue("@DepartmentName", deptName);
            con.Open();
            int res=cmd.ExecuteNonQuery();
            con.Close();
            return res;
        }
    }
}
