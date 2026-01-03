using Microsoft.AspNetCore.Mvc;

namespace _05Demo_AttributeBasedRouting.Controllers
{
    [Route("/Demo")]
    public class DemoController : Controller
    {
       
        public IActionResult Index()
        {
            return View();
        }
        [Route("demo")]
        public IActionResult Demo()
        {
            return View("~/Views/Demo/Demo.cshtml");
        }
        [Route("Greet")]
        public string Greet(string msg)
        {
            return "hii";
        }
    }
}
