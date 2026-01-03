using Microsoft.AspNetCore.Mvc;

namespace _05Demo_AttributeBasedRouting.Controllers
{
    [Route("[Controller]")]
    public class DashboardController : Controller
    {
        [Route("[action]")]
        public int GetNumber()
        {
            return 100;
        }
        [Route("[action]/{id?}/{name?}")]
        public string GetSomething(int id,string name)
        {
            return $"id={id}, name={name}";
        }
    }
}
