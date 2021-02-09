<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
<form action="./Signup_Servlet" method="post">
<p>すべて入力してください</p>

ユーザー名：<input type="text" name="name" required><br>
パスワード：<input type="password" name="pass" required><br>
<input type="submit" value="登録"><br>
</form>
<a href="login.jsp"><button type="button" >ログインをする</button></a>
</body>
</html>