package TestQuestions;

import java.util.Arrays;

public class Questions {
  private int tid;
  private String tname;
  private String dTest;
 private QueBank qlist[];
 
	@Override
public String toString() {
	return "Questions [tid=" + tid + ", tname=" + tname + ", dTest=" + dTest + ", qlist=" + Arrays.toString(qlist)
			+ "]";
}
	public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}
public String getdTest() {
	return dTest;
}

public void setdTest(String dTest) {
	this.dTest = dTest;
}

public QueBank[] getQlist() {
	return qlist;
}



public void setQlist(QueBank[] qlist) {
	this.qlist = qlist;
}

	public Questions() {
		super();
		
	}
	public Questions(int tid, String tname, String dTest, QueBank[] qlist) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.dTest = dTest;
		this.qlist = qlist;
	}

}
