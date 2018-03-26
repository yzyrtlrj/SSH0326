package com.cray.dao.impl;

import com.cray.dao.UserDao;
import com.cray.dao.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public User login(User user) {
		// Dao层Login方法
		//预设username, password
		String username = "binbin";
		String password = "123456";
		if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
			User successUser = new User();
			successUser.setId(1);
			successUser.setUsername("binbin");
			successUser.setPassword("123456");
			return successUser;
		}
		
		return null;
	}

}
