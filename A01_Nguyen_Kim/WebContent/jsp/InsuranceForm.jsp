<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Insurance Sign-up</title>
</head>
<body>
	<center>
		<h1>Employee Insurance Sign-up</h1>
		<form action="/A01_Nguyen_Kim/submit-insurance-info" method="POST">
			Name: <input type="text" id="name" name="name" /><br/>
			Employee ID: <input type="text" id="id" name="id" /><br/>
			Number of children: <input type="text" id="numChildren" name="numChildren" /><br/>
			Married: <input type="checkbox" id="isMarried" name="isMarried" /><br/>
			<input type="submit" value="Submit" />
		</form>
	</center>
</body>
</html>