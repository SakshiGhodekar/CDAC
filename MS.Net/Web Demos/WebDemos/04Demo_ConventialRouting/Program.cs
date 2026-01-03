using Microsoft.AspNetCore.Mvc;

namespace _04Demo_ConventialRouting
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            //app.MapDefaultControllerRoute();
            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Demo}/{action=Index}"
                );
            app.MapControllerRoute(
                name: "sakshi",
                pattern: "{ Controller = Home}/{ Action=userCredentials}/{uname}/{pass}"
                );
            app.MapControllerRoute(
                name: "abc",
                pattern: "{Controller=Admin}/{action=Index}/{nm}"
                );
            app.Run();
        }
    }
}
