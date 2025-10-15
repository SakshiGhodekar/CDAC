package InterfacePr;

public interface I1 {
	
public default void fun1_2(){
	
	System.out.println("in i1 fun1 ");
} 
    void fun2();
 
    int  a=10;
 
    public static void fun4() {
    	System.out.println("in static f4");
    }
    private void reuse() {
    	System.out.println("hiii");
    }
    default void fun5() {
    	reuse();
    	System.out.println("in private f4");
    }
}


