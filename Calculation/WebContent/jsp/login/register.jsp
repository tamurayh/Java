<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
<title>新規登録</title>
<link rel="stylesheet" type="text/css" href="./css/login.css"/>
</head>
<body>
<div class="login">
<form action="./Signup_Servlet" method="post">
<h1>すべて入力してください</h1>

<p>ユーザー名：</p><input type="text" name="name" required><br>
<p>パスワード：</p><input type="password" name="pass" required><br>
<input type="submit" value="登録"><br>
</form>
<a href="login.jsp"><button type="button" >ログインをする</button></a>
</div>
</body>
</html>