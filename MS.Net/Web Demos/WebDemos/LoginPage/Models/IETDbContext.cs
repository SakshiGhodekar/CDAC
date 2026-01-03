using Microsoft.EntityFrameworkCore;

namespace LoginPage.Models
{
    public class IETDbContext:DbContext
    {
        public DbSet<User> users{ get; set; }   

        public IETDbContext(DbContextOptions options) : base(options) { 
        
        
        }
    }
}
