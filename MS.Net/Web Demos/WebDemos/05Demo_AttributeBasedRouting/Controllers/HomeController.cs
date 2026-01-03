using Microsoft.AspNetCore.Mvc;

namespace _05Demo_AttributeBasedRouting.Controllers
{
    public class HomeController : Controller
    {
        [Route("/")]
        public IActionResult Home()
        {
            return View();
        }
        [Route("/About")]
        public IActionResult About()
        {
            return View();
        }
    }
}
