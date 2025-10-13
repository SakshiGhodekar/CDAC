package bank.demo.beans;

public class Account {
	private int id;
	private String nm;
	protected Double Balance;
	
	
	public Account(){
		System.out.println("Default Constructor");
	}
	
	public Account (int id,String nm,Double Balance) 
	{
		this.id=id;
		this.nm=nm;
		this.Balance=Balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public static double deposite (double d) {
		return d;
		
	}
	
	public static void withdrawl(double d, double e) {
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", nm=" + nm + ", Balance=" + Balance + "]";
	}
	
	
	
	
	
}
