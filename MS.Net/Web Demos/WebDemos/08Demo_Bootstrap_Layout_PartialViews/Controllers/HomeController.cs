using Microsoft.AspNetCore.Mvc;
using _08Demo_Bootstrap_Layout_PartialViews.Models;
namespace _08Demo_Bootstrap_Layout_PartialViews.Controllers
{
    public class HomeController : Controller
    {
        List<Emp> elist = new List<Emp>()
        {
             new Emp(){ Id= 11, Name= "Tony Stark", Address="LA"},
            new Emp(){ Id= 12, Name= "Walter Bishop", Address="New Jersey"},
            new Emp(){ Id= 13, Name= "Thor", Address="Asgard"},
            new Emp(){ Id= 14, Name= "Peter Bishop", Address="Parallel Universe"},
        };
        List<Product> plist = new List<Product>()
        {
              new Product(){ Id = 1, Name = "Laptop", Price = 75000, Description = "Asus 16GB RAM", Image="~/Images/laptop1.jfif"},
                new Product(){ Id = 2, Name = "HDD", Price = 5000, Description = "Sandisk 1TB", Image="~/Images/laptop2.jfif"},
                new Product(){ Id = 3, Name = "Mobile", Price = 175000, Description = "Nokia, Windows OS", Image="~/Images/laptop3.jfif"},
        };
        public IActionResult Index()
        {
            ViewData["title"] = "Index";
            return View(elist);
        }

        public IActionResult About()
        {
            ViewData["title"] = "About";
            return View();
        }
        public IActionResult GetAllProducts()
        {
            ViewData["title"] = "GetAllProducts";
            return View(plist);
        }
        public IActionResult PData(int id)
        {
            Product product = plist.Find(p => p.Id == id);
            List<Product> lst = new List<Product>() { product };
            return View(lst);
        }
    }
}
