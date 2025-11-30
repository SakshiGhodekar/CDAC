package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.*;

public class LoginServiceImpl implements LoginService{
private LoginDao ldao;
 public LoginServiceImpl() {
	 ldao=new LoginDaoImpl();
 }
@Override
public User validateuser(String uname, String pass) {
	
	return ldao.validateUser(uname,pass);
}

}
