<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up Form</title>
</head>
<body>
	<h1>Sign Up Form</h1>
	<form action="/Form/Registration" method="GET">
		<p> Email: <input type="text" id="email" name="email" /> </p>
		<p> Name: <input type="text" id="name" name="name" /> </p>
		<p> Password: <input type="password" id="password" name="password" /> </p>
		<input type="submit" value="Sign Up" />
	</form>
</body>
</html>