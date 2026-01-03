namespace _31_CustomAttribute
{
    [AttributeUsage: AttributeTargets.Class]
    public class MyCustomAttribute : Attribute
    {
        private int _AttrId;
        private string _AttrName;

        public int AttrId
        {
            get { return _AttrId; }
            set { _AttrId = value; }
        }

        public string AttrName
        {
            get { return _AttrName; }
            set { _AttrName = value; }
        }

    }
}
