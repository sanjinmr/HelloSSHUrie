package com.mys2sh.action;

import java.util.Iterator;
import java.util.List;

import com.mys2sh.dao.UserDao;
import com.mys2sh.entity.User;

public class UserAction {
	private UserDao userDao;
	private String name;
	private String password;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String createUser() {
		User user = userDao.createUser(name, password);
		if (user.getName() == name) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	public String queryUser() {
		List<User> userList = userDao.query();
		Iterator<User> users = userList.iterator();
		while (users.hasNext()) {
			User user1 = users.next();
			System.out.println(user1.getName() + "---------" + "password:" + user1.getPassword());
		}
		if (!userList.isEmpty()) {

			return "SUCCESS";
		} else {
			System.out.println("--------- User is empty! ---------");
		}

		return "ERROR";
	}
}
