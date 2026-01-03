namespace _21_Oberver_Pattern
{
    public delegate void NotifyHandler(string msg);
    internal class Program
    {
        static void Main(string[] args)
        {
            Publisher p=new Publisher();
            Subscriber s=new Subscriber();
            p.Notify += new NotifyHandler(s.sms);
            p.Notify += new NotifyHandler(s.email);
            p.NotiyfySubsriber("Congratualation u have got a subscription");
            p.Notify -= new NotifyHandler(s.sms);
            p.NotiyfySubsriber("sorry");
          
        }
    }

    public class Subscriber
    {
        public void sms(string msg)
        {
            Console.WriteLine($"sms={msg}");
        }
        public void email(string msg)
        {
            Console.WriteLine($"email={msg}");
        }
    }
    public class Publisher
    {
        public event NotifyHandler Notify;

        public void NotiyfySubsriber(string msg)
        {
            Notify?.Invoke(msg);
        }
    }
}
