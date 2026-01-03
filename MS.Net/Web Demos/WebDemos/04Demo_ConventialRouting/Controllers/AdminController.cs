using Microsoft.AspNetCore.Mvc;

namespace _04Demo_ConventialRouting.Controllers
{
    public class AdminController : Controller
    {
        public string Index(string nm)
        {
            return nm;
        }
    }
}
