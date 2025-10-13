package InterfacePr;

public class Test implements I1,I2{
	public void fun2() {
		
		 System.out.println("overriden fun2");
	 }
	public static void main(String[] args) {
		Test t= new Test();
		t.fun2();
		 t.fun1_2();
		 t.fun5();
	}

}
