<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Topic</title>
</head>
<body style="background-color: rgba(220, 220, 220, 0.2);">
	<div id="container">
		<div id="header">
			<h1 style="text-align: center;">Login</h1>
		</div>
		<div id="main">
			<form action="user_login.action" method="post">
				<table align="center">
					<tr>
						<td colspan="2">
						<s:textfield name="username" label="用户名" />
						<s:password name="password" label="密 码" /></td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="submit" value="Login" />
					</tr>
					<tr>
						<td colspan="2"><a href="#">找回密码</a></td>
					</tr>
				</table>
			</form>

		</div>
	</div>


</body>
</html>