package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.User;

public class RegisterServiceImpl implements RegisterService{
private LoginDao rdao;
public RegisterServiceImpl() {
	rdao=new LoginDaoImpl();
}

	@Override
	public boolean addUser(User u) {
		
		return rdao.addUser(u);
	}

}
