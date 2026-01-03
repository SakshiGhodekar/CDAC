namespace _41_Demo_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region LINQ to collection
            int[] arr = { 1, 2, 3, 5, 7, 4, 9, 11 };

            var result = from element in arr
                         orderby element descending
                         select element;

            foreach (var item in result)
            {
                Console.WriteLine(item);
            }
            #endregion
            #region Lazy Loading 

            //string? city = Console.ReadLine().ToLower();
            //var result = from emp in emps
            //             where emp.Address.ToLower().StartsWith(city)
            //             select emp;
            //emps.Add(new Emp() { Id = 20, Name = "SAKSHI", Address = "PUNE" });
            //foreach (var emp in result)
            //{
            //    emp.GetDetails();
            //}
            #endregion
            List<Emp> emps = new List<Emp>() {
                new Emp(){ Id=11, Name="Ganesh",Address="Pune"},
                new Emp(){ Id=12, Name="Suresh",Address="Mumbai"},
                new Emp(){ Id=13, Name="Mitesh",Address="Pune"},
                new Emp(){ Id=14, Name="Rupesh",Address="Patna"},
                new Emp(){ Id=15, Name="Jignesh",Address="Pune"},
                new Emp(){ Id=16, Name="Jayesh",Address="Pune"},
                new Emp(){ Id=17, Name="Gukesh",Address="Mumbai"},
                new Emp(){ Id=18, Name="Prathamesh",Address="Puri"},
                new Emp(){ Id=19, Name="Mukesh",Address="Nashik"},

            };

        }
    }
    public class Emp
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }

        public void GetDetails()
        {
            Console.WriteLine($"Id: {this.Id}, Name: {this.Name}, Address: {this.Address} ");
        }
    }

}
