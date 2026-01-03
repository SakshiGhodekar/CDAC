namespace _38_Demo_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Predicate delegate

            //Predicate<int> _Even = x => x % 2 == 0;
            //Predicate<int> _Odd = x => x % 2 != 0;

            //Console.WriteLine("Enter a number");
            //int no = Convert.ToInt32(Console.ReadLine());

            //var evenResult = _Even(no);
            //var oddResult = _Odd(no);
            //Console.WriteLine($"For Nunmber = {no} --> Even: {evenResult}, Odd: {oddResult}");

            #endregion

            #region ACTION delegate
            //Action del = () => Console.WriteLine("hello");
            //del();
            #endregion

            #region func delegate
            //Func<int, bool> del1 = new Func<int, bool>(delegate (int x)
            //{
            //    return x % 2 == 0;
            //});
            //bool result=del1(20);
            //Console.WriteLine(result);

            //Predicate<int> _predicate1 = x => x % 2 == 0;
           
            //bool output = _predicate1(13);
            //Console.WriteLine(output);

            //Func<int, bool> op = new Func<int, bool>(_predicate1);
            //bool result = op(13);
            //Console.WriteLine(result);
            #endregion

            #region inbuilt where and MyWhere Extension methood

            int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 6, 7 };
            Predicate<int> _predicate = x => x == 5;
            Func<int, bool> funcDel = new Func<int, bool>(_predicate);

            var result1 = arr.Where(funcDel);
            foreach (var no in result1)
            {
                Console.WriteLine(no);
            }

            #endregion
            #region in-build Select() Extension Method
            Func<int, int> func3 = new Func<int, int>(no => no * 2);
            var doubleArr = arr.Select(no => no * 2);

            foreach (int ele in doubleArr)
            {
                Console.WriteLine(ele);
            }
            #endregion
        }
    }

    public static class MyClass
    {
        public static List<T> MySelect<T>(this IEnumerable<T> source)
        {
            var list = new List<T>();
            foreach(var item in source)
            {
                list.Add(item);
            }
            return list;
        }
        public static IEnumerable<int> MyWhere<T>(this IEnumerable<int> source, Func<int, bool> predicate)
        {
            List<int> result = new List<int>();
            foreach (int no in source)
            {
               
                if (predicate(no))
                {
                    result.Add(no);
                }
            }
            return result;
        }
    }
}
