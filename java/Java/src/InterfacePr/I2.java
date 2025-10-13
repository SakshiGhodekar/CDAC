package InterfacePr;

public interface I2 {
	public default void fun1(){
		
		System.out.println("in i2 fun1 ");
	} 
	  //abstract method
	    void fun2();
	   //default public static and final
	    int  a=10;
	    //we can't write constructor
	    public static void fun4() {
	    	System.out.println("in private f4");
	    }
	    private void reuse() {
	    	System.out.println("hiii");
	    }
}
