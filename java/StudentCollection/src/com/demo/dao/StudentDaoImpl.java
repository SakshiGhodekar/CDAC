package com.demo.dao;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
  static List<Student> slist;
  
    static {
	  slist = new ArrayList<>();
	  slist.add(new Student(1,"sakshi",55,35));
	  slist.add(new Student(2,"riya",22,43));
	  slist.add(new Student(3,"sai",88,44));
	  slist.add(new Student(4,"jiya",86,86));
	  slist.add(new Student(5,"piya",34,88));
	  
  }
	@Override
	public boolean save(Student s) {
		slist.add(s);
		return true;
	}
	@Override
	public List<Student> displayAll() {
		return slist;
	}
	

	@Override
	public Student SearchById(int id) {
		 int pos=slist.indexOf(new Student(id));
		 if(pos!=-1) {
			 return slist.get(pos);
		 }
		return null;
	}
	
	
	@Override
	public List<Student> SearchByName(String name) {
		List<Student> temp= slist.stream()
                .filter(emp->emp.getName().equals(name))
                .collect(Collectors.toList());

if(temp.size()>0) {
return temp;
}
		return null;
	}
	@Override
	public boolean updateMarks(int id, int marks1) {
		int pos=slist.indexOf(new Student(id));
		if(pos!=-1) {
			
			Student s=slist.get(pos);
		   s.setMarks1(marks1);
		   return true;
		}
		
		return false;
	}
	@Override
	public boolean updateMarks1(int id, int marks2) {
		int pos=slist.indexOf(new Student(id));
		if(pos!=-1) {
			
			Student s=slist.get(pos);
		   s.setMarks2(marks2);
		   return true;
		}
		
		return false;
	}
	@Override
	public boolean deleteId(int id) {
		return slist.remove(new Student(id));
	}
	@Override
	public boolean deleteAvg(double avg) {
		
		return slist.remove(new Student(avg));
	}
	@Override
	public List<Student> sortId() {
		List<Student>sl=new ArrayList<>();
		for(Student s:slist) {
			sl.add(s);
		}
		sl.sort(null);
		return sl;
	}
}