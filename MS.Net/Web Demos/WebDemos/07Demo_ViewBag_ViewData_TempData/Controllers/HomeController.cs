using _07Demo_ViewBag_ViewData_TempData.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace _07Demo_ViewBag_ViewData_TempData.Controllers
{
    public class HomeController : Controller
    {

        List<Emp> empList = new List<Emp>()
        {

                new Emp(){ Id= 101, Name= "Pooja", Address="Pune"},
                new Emp(){ Id= 102, Name= "Neha", Address="Nagpur"},
                new Emp(){ Id= 103, Name= "Tina", Address="Thane"},
                new Emp(){ Id= 104, Name= "Pinky", Address="Puri"},
                new Emp(){ Id= 105, Name= "Jaspreet", Address="Jamnagar"},

        };

        List<Customer> customerList = new List<Customer>() {
         new Customer(){CId= 1, CName="Bob", BillNo= 1234 },
         new Customer(){CId= 2, CName="Rob", BillNo= 5678 },
         new Customer(){CId= 3, CName="Tom", BillNo= 2468 },
        };

        public IActionResult Index()
        {
            //string name = "sakshi";
            //return View("Index",name);

            long phone = 33542354;
            return View(phone);
        }
        public IActionResult GetEmp()
        {
            return View(empList);
        }
        public IActionResult getAllRecord()
        {
            AllEmpAndCust data = new AllEmpAndCust()
            {
                allEmps = empList,
                allCust = customerList,
            };
            return View(data);
        }
        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
