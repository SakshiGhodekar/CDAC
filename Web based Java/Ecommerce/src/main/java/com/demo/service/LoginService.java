package com.demo.service;

import com.demo.bean.User;

public interface LoginService {

	User validateuser(String name, String pass);

}
