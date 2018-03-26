package com.cray.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cray.dao.UserDao;
import com.cray.dao.entity.User;
import com.cray.service.UserService;

public class UserServiceImpl implements UserService {

	// 注入UserDao
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	// 业务层用户登录的方法
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
