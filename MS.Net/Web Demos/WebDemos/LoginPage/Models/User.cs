using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace LoginPage.Models
{
    [Table("User")]
    public class User
    {
        [Key]
        [Column("Name",TypeName="varchar")]
        public string UName { get; set; }

        [Column("Password", TypeName = "varchar")]
        public string Password { get; set; }
    }
}
