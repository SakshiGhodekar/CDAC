using System.Diagnostics;
using LoginPage.Models;
using Microsoft.AspNetCore.Mvc;

namespace LoginPage.Controllers
{
    public class HomeController : Controller
    {
        //private readonly ILogger<HomeController> _logger;

        //public HomeController(ILogger<HomeController> logger)
        //{
        //    _logger = logger;
        //}

        private readonly IETDbContext _context;

           public HomeController(IETDbContext context)
        {
            _context = context;
        }
        [HttpGet]
        public IActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public IActionResult SignIn(User user)
        {

            
                
                var validUser = _context.users.FirstOrDefault(u => u.UName == user.UName && u.Password == user.Password);

                if (validUser != null)
                {
                    //HttpContext.Session.SetString("user", user.UName);
                    return View("SignIn");
                }
                else
                {
                   
                    ViewBag.message = "Invalid user";
                    return View("Index");
                }
            
        }

        private IActionResult view(string v)
        {
            throw new NotImplementedException();
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
