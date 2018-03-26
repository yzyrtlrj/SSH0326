package com.cray.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.cray.dao.entity.User;
import com.cray.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 模型驱动使用的对象
	private User user = new User();

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	// 注入UserService
	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 用户登录的方法
	public String login() {
		// 调用业务层用户登录的方法
		user = userService.login(user);
		if (user != null) {
			// 登录成功
			ServletActionContext.getRequest().getSession().setAttribute("userinfo", user);
			return "loginSuccess";
		} else {
			// 登录失败
			return LOGIN;
		}

	}

}
