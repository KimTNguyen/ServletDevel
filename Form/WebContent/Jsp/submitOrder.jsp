<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Submit Order</title>
</head>
<body>
	<h1>Submit Order</h1>
	<form action="/Form/submitOrder" method="POST">
		<p>Item: <input type="text" id="item" name="item" /><br/>
		Item: <input type="text" id="item" name="item" />
		</p>
		First Name: <input type="text" id="firstName" name="firstName" /><br/>
		Last Name: <input type="text" id="lastName" name="lastName" /><br/>
		Shipping Address: <input type="text" id="address" name="address" /><br/>
		<p>
		Credit Card:<br/>
		<input type="radio" id="cardType" name="cardType" value="Visa" /> Visa
		<input type="radio" id="cardType" name="cardType" value="MasterCard"/> MasterCard
		<input type="radio" id="cardType" name="cardType" value="American Express"/> American Express
		</p>
		Credit Card Number: <input type="password" id="cardNumber" name="cardNumber" /><br/>
		CCV Number: <input type="password" id="ccv" name="ccv" /> <br/>
		<p><input type="submit" value="Submit Order" /></p>
	</form>
</body>
</html>