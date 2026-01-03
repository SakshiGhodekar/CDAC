namespace _08Demo_Bootstrap_Layout_PartialViews
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();
            app.UseStaticFiles();
            app.MapDefaultControllerRoute();

           

            app.Run();
        }
    }
}
