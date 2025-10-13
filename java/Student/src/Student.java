import java.util.*;

public class Student {
	private String name;
	private int age;
	private int mob;
	String mail;
	

	public Student() {
		super();
	}


	public Student(String name, int age, int mob, String mail) {
		super();
		this.name = name;
		this.age = age;
		this.mob = mob;
		this.mail = mail;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMob() {
		return mob;
	}


	public void setMob(int mob) {
		this.mob = mob;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mob=" + mob + ", mail=" + mail + "]";
	}
	
}
