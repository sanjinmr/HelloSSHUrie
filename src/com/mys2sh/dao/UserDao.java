package com.mys2sh.dao;

import java.util.List;

import com.mys2sh.entity.User;

public interface UserDao {
	
	public User getUser(String name);

	public User createUser(String name, String password);

	public List<User> query();
}
