using Microsoft.AspNetCore.Mvc;
using _07Demo_ViewBag_ViewData_TempData.Models;
namespace _07Demo_ViewBag_ViewData_TempData.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            ViewBag.message = "welcome";

            Emp emp = new Emp()
            {
                Id=1,
                Name="SAKSHI",
                Address="PUNE"
            };
            ViewBag.empInfo = emp;
            ViewData["number"] = 1234;

            Emp emp1 = new Emp()
            {
                Id = 2,
                Name = "abc",
                Address = "PUNE"
            };
            ViewData["emp1"] = emp1;
            TempData["Pin"] = 413142;
            return View();
        }
        public IActionResult Contact()
        {
            return View();
        }
        public IActionResult About()
        {
            return View();
        }
    }
}
