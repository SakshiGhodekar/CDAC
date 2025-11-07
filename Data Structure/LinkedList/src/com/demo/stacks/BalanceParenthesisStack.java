package com.demo.stacks;

public class BalanceParenthesisStack {
  public static boolean isBalanced(String s) {
	  
	  char[] st=new char[s.length()];
	  int top=-1;
	  
	  for(char c:s.toCharArray()) {
		  if(c=='('||c=='{'||c=='[') {
			  st[++top]=c;
		  }else if(c==')'||c=='}'||c==']') {
			  if(top==-1) {
				  return false;
			  }
			  char open=st[top--];
			  if((c==')'&& open!='(')||(c=='}'&&open!='{')||(c==']'&&open!='[')) {
				  return false;
			  }
		  }
	  }
	return top==-1;
	  
  }
}
