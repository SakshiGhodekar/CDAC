using Microsoft.AspNetCore.Mvc;

namespace _04Demo_ConventialRouting.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public ActionResult<string> userCredentials(string uname, string pass)
        {
            return $"uname:{uname},password:{pass}";
        }
    }
}