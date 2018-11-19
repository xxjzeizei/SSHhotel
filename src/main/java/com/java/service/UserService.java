package com.java.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.UserDao;

@Service("UserService")
@Transactional
public class UserService {

	@Autowired
	private UserDao userdao;
	public void select(){
		userdao.update2();
	} 
	public void update(){
		userdao.update();
	} 
	
}
