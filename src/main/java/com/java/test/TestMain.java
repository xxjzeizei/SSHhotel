package com.java.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.service.UserService;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService bean = (UserService) Context.getBean("UserService");
		bean.select();
		bean.update();
		System.out.println("ok");
	}

}
