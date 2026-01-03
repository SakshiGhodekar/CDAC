namespace Custom_Attributes
{
    [AttributeUsage:AttributeTargets.Class]
    public class CognizantAttribute:Attribute
    {
        private int _CompanyName;
        public int CompanyName
        {
            get { return _CompanyName; }
            set { _CompanyName = value; }
        }
    }
}
