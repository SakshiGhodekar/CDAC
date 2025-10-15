package com.demo.test;
import java.util.*;
import com.demo.exceptions.*;
public class TestGuessNoException {

	public static void main(String[] args) {
	  int num=55;
	  Scanner sc=new Scanner(System.in);
	  while(true) {
	  try {
		 System.out.println("enter number"); 
		 int num1=sc.nextInt();
		 
		 if(num1==num) {
			System.out.println("Guess is right"); 
		 }
		 else {
			 if(num1>num) {
				throw new WrongNumberException("plz enter small number");
			 }else {
				throw new WrongNumberException("plz enter large number");
			 }
		 }
		  
	  } catch( WrongNumberException e) {
		  System.out.println(e.getMessage());
	  }
	}
	}
}
