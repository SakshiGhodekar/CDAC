package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	boolean addNewStudent();

	List<Student> displayAll();

	Student FindById(int id);

	List<Student> FindByName(String name);

	boolean updateByMarks(int id, int marks1);

	boolean updateByMarks2(int id, int marks2);

	boolean deleteById(int id);

	boolean deleteByAvg(double avg);

	List<Student> sortById();

}
