public class Account {
		private String fname;
		private String lname;
		private String mail;
		private int mob;
		
	public Account(){
		System.out.println ("Default Constructor");
	}
	 public Account(String fn, String ln,String em,int mb ) {
		fname=fn;
		lname=ln;
		mail=em;
		mob=mb;
	 }
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Account [fname=" + fname + ", lname=" + lname + ", mail=" + mail + ", mob=" + mob + "]";
	} 
	 
	
	}

