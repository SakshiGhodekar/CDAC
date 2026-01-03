namespace _02Demo_EmptyTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();

            //app.MapGet("/", () => "GET:Hello World!");
            ////app.MapGet("/", () =>" sakshi");
            //app.MapPost("/", () => "POST:emp data");
            //app.MapPut("/", () => "Put: Hello World!");
            //app.MapDelete("/", () => "DELETE:delete");

         

            app.Use(async(context, next) =>
            {
                await context.Response.WriteAsync("welcome");
                next(context);
            });
            app.Run(async (context) => {
                await context.Response.WriteAsync("hello1");
                await context.Response.WriteAsync("\nsakshi1");
            });

            app.Use(async (context,next) => {
                await context.Response.WriteAsync("hello");
                next(context);
                await context.Response.WriteAsync("\nsakshi");

            });

           
            app.Run();
        }
    }
}
