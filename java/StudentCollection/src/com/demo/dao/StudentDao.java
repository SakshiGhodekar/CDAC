package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	boolean save(Student s);

	List<Student> displayAll();

	Student SearchById(int id);

	List<Student> SearchByName(String name);

	boolean updateMarks(int id, int marks1);

	boolean updateMarks1(int id, int marks2);

	boolean deleteId(int id);

	boolean deleteAvg(double avg);

	List<Student> sortId();

	
 
}
