package com.java.dao;

import java.util.List;

import javax.swing.text.StyledEditorKit.ItalicAction;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {

	@Autowired
	private SessionFactory session;
	@Autowired
	private HibernateTemplate hib;
	
	
	
	public void update() {
		// TODO Auto-generated method stub
/*		Session openSession = session.getCurrentSession();
		iTrace.print(openSession);
		User user = new User();
		user.setPassword("1");
		user.setUsername("1");
		openSession.save(user);
		int i=5/0;
		User user2 = new User();
		user2.setPassword("2");
		user2.setUsername("2");
		openSession.save(user2);*/
		int i=5/0;
	}
	public void update2() {
		// TODO Auto-generated method stub
		Session openSession = session.getCurrentSession();
	}
}
