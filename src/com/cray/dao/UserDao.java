package com.cray.dao;

import com.cray.dao.entity.User;

public interface UserDao extends BaseDao<User>{
	
	User login(User user);

}
