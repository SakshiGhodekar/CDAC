package com.demo.dao;
import java.util.List;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import com.demo.beans.*;
import com.demo.service.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;


public class EmployeeDaoImpl implements EmployeeDao {
  static List<Employee>lst;
  static {
	  lst=new ArrayList<>();
  }
  
	@Override
	public void findFile(String fname) {
		File f=new File(fname);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
				
				while(true) {
					Employee e=(Employee)ois.readObject();
					lst.add(e);
				}
				
			}catch (EOFException e1) {
			System.out.println("file reached to end");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}catch (IOException e1) {	
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
		}
		System.out.println("size :"+lst.size());
		
	}

	@Override
	public boolean save(Employee e) {
		
		return lst.add(e);
	}

	@Override
	public List<Employee> display() {
	
		return lst;
	}

	@Override
	public boolean removeById(int id) {
		return lst.remove(new Employee(id));
	}

	@Override
	public Employee searchById(int eid) {
		int pos=lst.indexOf(new Employee(eid));
		if(pos!=-1) {
			   return lst.get(pos);
		}
		return null;
	}

	@Override
	public void WriteToFile(String fname) {
     try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname))){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean changeById(int id,double sal) {
		int pos=lst.indexOf(new Employee(id));
		if(pos!=-1) {
			
			
			lst.get(pos).setSal(sal);
		}
		return false;
	}

}
