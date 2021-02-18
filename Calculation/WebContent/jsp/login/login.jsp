<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="./css/login.css"/>
</head>
<body>
<div class="login">
	<h1> ログインをしてください</h1>
	
        <form method="Post" action="./loginServlet">
          ユーザー名: <input type="text" name="uername"required><br>
          パスワード: <input type="password" name="uerpass"required><br>
          <input type="submit" name="nextButton" value="ログイン">
        </form>
          <a href="register.jsp"><button type="button" >新規登録の方はこちら</button></a>
</div>
</body>
</html>