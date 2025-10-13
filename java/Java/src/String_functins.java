
public class String_functins {

	public static void main(String[] args) {
	  String s1="sakshi";
	  String s2="sakshi";
	  String s3=s1;
	  String s4=new String("sakshi");
	  s1="we-lc-ome";
      System.out.println(s1.indexOf("h"));
      System.out.println(s1.contains("z"));
      
      String s6="xxx,yyy,zzz-rrr"; 
      
      String [] arr1= s6.split(",");
      System.out.println(arr1);
	}

}
