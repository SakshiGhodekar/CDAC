using _43_conArch.Model;
using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _43_conArch.DAL
{
    public class DbContext
    {
        private string conString;
        public DbContext(string conString) { 
            this.conString= conString;
        }

        internal int UpdateEmployee(Employee empToBeUpdates)
        {
            SqlConnection con = new SqlConnection(conString);
            SqlCommand com = new SqlCommand($"update employee set Name='{empToBeUpdates.name}' , address= '{empToBeUpdates.address}' where id={empToBeUpdates.id}", con);
            con.Open();
            int result = com.ExecuteNonQuery();
            con.Close();
            return result;
        }

        internal  List<Employee> findAllEmloyees()
        {
            SqlConnection con = new SqlConnection(conString);
            SqlCommand com = new SqlCommand("SELECT * FROM EMPLOYEE" , con);
            con.Open();
            SqlDataReader reader = com.ExecuteReader();
            List<Employee> AllEmps = new List<Employee>();
            while (reader.Read())
            {
                int Eid = Convert.ToInt32(reader["Id"]);
                string Ename = reader["Name"].ToString();
                string Eaddress = reader["Address"].ToString();
                AllEmps.Add(new Employee() { id = Eid, name = Ename, address = Eaddress });
            }
            con.Close();
            return AllEmps;
        }

        internal Employee findEmpById(int id)
        {
            SqlConnection con = new SqlConnection(conString);
            SqlCommand com = new SqlCommand($"SELECT * FROM EMPLOYEE WHERE id = {id}", con);
            con.Open();
            SqlDataReader reader = com.ExecuteReader();
            List<Employee> AllEmps = new List<Employee>();
            while (reader.Read())
            {
                int Eid = Convert.ToInt32(reader["Id"]);
                string Ename = reader["Name"].ToString();
                string Eaddress = reader["Address"].ToString();
                AllEmps.Add(new Employee() { id = Eid, name = Ename, address = Eaddress });
            }
            con.Close();
            return AllEmps.FirstOrDefault();
        }

        internal int InsertEmployee(Employee empToBeInsert)
        {
            SqlConnection con = new SqlConnection(conString);
            SqlCommand com = new SqlCommand($"insert into employee (Name , address) values ('{empToBeInsert.name}' , '{empToBeInsert.address}')", con);
            con.Open();
            int result = com.ExecuteNonQuery();
            con.Close();
            return result;
        }

        internal int DeleteEmployee(int idToBeDeleted)
        {
            SqlConnection con = new SqlConnection(conString);
            SqlCommand com = new SqlCommand($"delete employee where id={idToBeDeleted}", con);
            con.Open();
            int result = com.ExecuteNonQuery();
            con.Close();
            return result;
        }
    }
}
