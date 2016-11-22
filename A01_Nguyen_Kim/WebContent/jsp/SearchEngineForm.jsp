<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Engine Form</title>
</head>
<body>
    <h1>One-Stop Web Search!</h1>
    <form action="/A01_Nguyen_Kim/search-engines" method="get">
        Search keywords: <input type="text" id="searchString" name="searchString" /><br/>
        <input type="radio" id="searchEngine" name="searchEngine" value="google" /> Google
        <input type="radio" id="searchEngine" name="searchEngine" value="alltheweb" /> AllTheWeb
        <input type="radio" id="searchEngine" name="searchEngine" value="yahoo" /> Yahoo
        <input type="radio" id="searchEngine" name="searchEngine" value="altavista" /> AltaVista
        <input type="radio" id="searchEngine" name="searchEngine" value="lycos" /> Lycos
        <input type="radio" id="searchEngine" name="searchEngine" value="hotbot" /> HotBot
        <input type="radio" id="searchEngine" name="searchEngine" value="msn" /> MSN
        <input type="submit" value="Submit" />
    </form>
</body>
</html>