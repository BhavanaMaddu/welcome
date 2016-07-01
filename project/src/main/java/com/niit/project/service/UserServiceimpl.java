package com.niit.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.project.dao.UserDAO;
import com.niit.project.model.SignupModel;
import com.niit.project.service.UserService;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserDAO userDAO;
	public void insertSignupModel(SignupModel u)
	{
		userDAO.insertSignupModel(u);
	}



}
