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
<div class="mistake">
<form action="./Signup_Servlet" method="post">
<p>すべて入力してください</p>

ユーザー名：<input type="text" name="name" required><br>
パスワード：<input type="password" name="pass" required><br>
<input type="submit" value="登録"><br>
</form>
<a href="login.jsp"><button type="button" >ログインをする</button></a>
</div>
</body>
</html>