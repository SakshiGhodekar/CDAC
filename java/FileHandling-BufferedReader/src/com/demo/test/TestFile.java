package com.demo.test;
import com.demo.beans.*;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class TestFile {

	public static void main(String[] args) {
		List<Employee>lst=new ArrayList<>();
		
		try(BufferedReader br=new BufferedReader(new FileReader("emp.txt"))){
			
			String line=br.readLine();
		while(line!=null) {	
			String[]arr=line.split(",");
			Employee e=new Employee();
			e.setEid(Integer.parseInt(arr[0]));
			e.setEname(arr[1]);
			e.setDesg(arr[2]);
			e.setSal(Double.parseDouble(arr[3]));
			lst.add(e);
			line=br.readLine();
		}
		lst.forEach(System.out::println);
		
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("empdata.txt"))){
		for(Employee e:lst) {
			String str=e.getEid()+"....."+e.getEname()+"..."+e.getDesg()+"...."+e.getSal();
	
			bw.write(str);
		}
		
	} catch (IOException e) {
	
		e.printStackTrace();
	}
		
	}

}
