<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bit System</title>
</head>
<body>
	<center>
		<h1>Welcome to Auctions-R-Us<br/>Please Enter Bid.</h1>
		<form action="/A01_Nguyen_Kim/bid-system" method="GET">
			Item ID: <input type="text" id="itemID" name="itemID" /><br/>
			Item Name: <input type="text" id="itemName" name="itemName" /><br/>
			Your Name: <input type="text" id="buyer" name="buyer" /><br/>
			Your Email Address: <input type="text" id="email" name="email" /><br/>
			Amount Bid: <input type="text" id="bidPrice" name="bidPrice" /><br/>
			Auto-increment bid to match other bidders? <input type="checkbox" id="autoIncrement" name="autoIncrement" /><br/>
			<p><input type="submit" value="Submit Bid" /></p>
		</form>
	</center>
</body>
</html>