namespace _33_CustomAttribute2
{
    [AttributeUsage(AttributeTargets.Class)]
    public class MyTableAttribute :Attribute
    {
        private string _Name;

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

    }

    [AttributeUsage (AttributeTargets.Property)]
    public class MyColoumnAttribute : Attribute
    {
        private string _DataType;
        private string _Name;

        public string DataType
        {
            get { return _DataType; }
            set { _DataType = value; }
        }

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

    }
}
