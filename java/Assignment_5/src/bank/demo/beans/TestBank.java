package bank.demo.beans;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1= new Account(1,"sakshi",4465.0);
		Account a2= new Account(2,"riya",65456.66);
		
		Account s1=new Saving(3,454.76,3,1,"sakshi",34534.7);
		Account s2=new Saving(6,454.76,3,2,"riya",34534.7);
		
		Account c1=new Current(3,454.76,3,1,"sakshi",34534.7);
		Account c2=new Current(7,454.76,3,1,"sakshi",34534.7);
		
		
		double s=s1.deposite(2343.4);
		System.out.println(s);
		double s5=c2.deposite(2343.4);
		System.out.println(s5);
		
		
		 s1.withdrawl(254533.7,5653334.9);
		
	}
	

}
