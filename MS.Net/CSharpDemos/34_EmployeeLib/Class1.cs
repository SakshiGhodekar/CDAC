using _33_CustomAttribute2;
using System.ComponentModel.DataAnnotations.Schema;

namespace _34_EmployeeLib
{
    [MyTable(Name ="Employee")]
    public class Emp
    {
        [MyColoumn(DataType = "int", Name = "EId")]
        public int Id { get; set; }

        [MyColoumn(DataType = "int", Name = "EName")]
        public string Name { get; set; }

        [MyColoumn(DataType = "int", Name = "EmpId")]
        public int EmpId { get; set; }
    }
}
