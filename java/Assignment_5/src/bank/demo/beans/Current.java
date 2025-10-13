package bank.demo.beans;

public class Current extends Account{
	private static int rate;
	private static  double min_bal;
	private int no_trans;
	
	
	public Current() {
		System.out.println("Default constructor");
	}
	
	public Current (int r ,double m_bal,int no_trans,int id,String nm,double bal ) {
		super(id ,nm,bal);
		rate=r;
		min_bal=m_bal;
		this.no_trans=no_trans;
		
	}

	public static int getRate() {
		return rate;
	}

	public static void setRate(int rate) {
		Current.rate = rate;
	}

	public static double getMin_bal() {
		return min_bal;
	}

	public static void setMin_bal(double min_bal) {
		Current.min_bal = min_bal;
	}

	public int getNo_trans() {
		return no_trans;
	}

	public void setNo_trans(int no_trans) {
		this.no_trans = no_trans;
	}

	@Override
	public String toString() {
		return "Saving [no_trans=" + no_trans + "]";
	}
	
	public static double deposite(double amount) {
		
		return 0.01*amount;
	}
	public static void withdrawl(double amount,double bal) {
		if((bal-amount)>min_bal) {
			System.out.println("can withdraw");
		}
	}
}
