<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Array Initialization</title>
</head>
<body>
	<h1>Array Initialization</h1>
	<p>Choose Array's dimensions that you wish to create by clicking the below button:</p>
	<form action="/A01_Nguyen_Kim/ArrayInitialization" method="GET">
		<p>
			Array's size: <input type="text" id="size" name="size" /><br/>
			Upper bound: <input type="text" id="upperBound" name="upperBound" /><br/>
			Lower bound: <input type="text" id="lowerBound" name="lowerBound" /><br/>
			<input type="submit" value="2D-Array" name="2DArray"/>
		</p>
		<p><input type="submit" value="3D-Array" name="3DArray"/></p>
	</form>
</body>
</html>