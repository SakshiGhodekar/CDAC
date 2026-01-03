using System.Collections;
using System.Security.Cryptography.X509Certificates;

namespace _37_CSharpFeatures
{
    internal class Program
    {

        public delegate bool MyDelegate(int x);
        static void Main(string[] args)
        {
            //Console.WriteLine("enter no");
            //int no=Convert.ToInt32(Console.ReadLine());

            #region Check Method using MyDelegate :
            //MyDelegate del = new MyDelegate(Check);
            //var result = del(no);
            //if (result)
            //{
            //    Console.WriteLine($"No : {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No : {no} is NOT greater than 10");
            //}
            #endregion

            #region Anonymous method

            //MyDelegate del = new MyDelegate(delegate (int num)
            //{
            //    return num > 10;
            //});

            //MyDelegate del1 = delegate (int num)
            //{
            //    return num > 10;
            //};
            //var result=del1(no);
            //if (result)
            //{
            //    Console.WriteLine("gerater then 10");
            //}
            //else
            //{
            //    Console.WriteLine("not gerater then 10");
            //}
            #endregion

            #region lambda expression
            //MyDelegate del3 = num => num > 10;
            //if (del3(no))
            //{
            //    Console.WriteLine("greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine(" not greater than 10");
            //}
            #endregion

            #region Predicate
            //Predicate<int> p1 = num => num > 10;
            //if (p1(no)) {
            //    Console.WriteLine("greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine(" not greater than 10");
            //}

            #endregion
            #region inbuilt sum extension method
            //int[] arr=new int[] {1,2,3,4,5,6,7};
            //int result = arr.Sum();
            //Console.WriteLine($"sum is{result}");

            //string[] str = new string[]{ "hello", "abc" };
            ////var result1 = str.Sum();
            //Console.WriteLine($"sum is{result1}");

            //Console.WriteLine("enetr email ");
            //string? email = Console.ReadLine();
            //if (email != null)
            //{
            //    if (CheckValidity(email))
            //    {
            //        Console.WriteLine("valid mail");
            //    }
            //    else
            //    {
            //        Console.WriteLine("not valid");
            //    }
            //}
            #endregion

            #region array convertToList
            //int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
            //string[] days = { "sunday", "monday", "tuesday" };
            //List<int> ts = arr.ConvertTolist(100);
            //List<int> output = ts;
            //foreach (var items in output)
            //{
            //    Console.WriteLine(items);
            //}
            //foreach (var day in days)
            //{
            //    Console.WriteLine(day);
            //}

            #endregion
            #region collection
            MyCollection collection = new MyCollection();
            foreach (string names in collection)
            {
                Console.WriteLine(names);
            }
            #endregion
        }
    }
    public static class MyClass
    {
        public static bool CheckValidity(this string mail)
        {
            return mail.Contains("@gmail.com");
        }

        public static List<T> ConvertTolist<T>(this IEnumerable<T> source, int nonsenseParameter)
        {
            List<T> list = new List<T>();
            foreach (var item in source) {
               list.Add(item);
            }
            return list;
        }
    }

    public class MyCollection : IEnumerable
    {
        string[] names = new string[] { "abc","pqr","ahg"};
        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < names.Length; i++)
            {
                string day = names[i];
                yield return day;
            }
        }
    }
}
