package com.temo.test;
import com.demo.stacks.*;
import java.util.*;
public class TestBalanceParenthesis {

	public static void main(String[] args) {
		BalanceParenthesisStack st=new BalanceParenthesisStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		
		if(st.isBalanced(s)){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		

	}

}
