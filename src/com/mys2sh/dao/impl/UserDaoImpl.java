package com.mys2sh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import com.mys2sh.dao.UserDao;
import com.mys2sh.entity.User;

public class UserDaoImpl implements UserDao {

	private User user;

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.openSession();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		return this.user;
	}

	@Override
	public User createUser(String name, String password) {
		// TODO Auto-generated method stub
		user.setName(name);
		user.setPassword(password);
		return this.user;
	}

	@Override
	public List<User> query() {
		// TODO Auto-generated method stub
		String hql = "from User";
		getSession().createQuery(hql);
		Query query = getSession().createQuery(hql);
		List<User> userList = query.list();
		return userList;
	}

}
