package bank.demo.beans;
import java.util.Date;
public class Demat extends Account{
	private int no_shares;
	private double buying_pr;
	private Date d_sp;
	
	public Demat() {
		System.out.println("in demat default constructor");
	}
	
	public Demat(int ns,double br,Date sp,String nm,int id,double bal) {
		super(id,nm,bal);
		this.no_shares=ns;
		this.buying_pr=br;
		this.d_sp=sp;
	
	}
	
public int getNo_shares() {
		return no_shares;
	}

	public void setNo_shares(int no_shares) {
		this.no_shares = no_shares;
	}

	public double getBuying_pr() {
		return buying_pr;
	}

	public void setBuying_pr(double buying_pr) {
		this.buying_pr = buying_pr;
	}

	public Date getD_sp() {
		return d_sp;
	}

	public void setD_sp(Date d_sp) {
		this.d_sp = d_sp;
	}

public static double deposite(double amount,double bal) {
		
		return 0.01*bal+amount;
	}
	public static boolean withdrawl(double amount,double bal,double min_bal) {
		if((bal-amount)>min_bal) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Demat [no_shares=" + no_shares + ", buying_pr=" + buying_pr + ", d_sp=" + d_sp + "]";
	}
	
}
