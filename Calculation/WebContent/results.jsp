<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="account" scope="session"class="sample.Sample">
<jsp:getProperty property="account" name="name"/>
</jsp:useBean>
<html>
<head>
<meta charset="UTF-8">
<title>results</title>
</head>
<body>

<p>ログイン成功</p>
<button  onclick="location.href='./user.jsp'">ユーザーページ</button>


</body>
</html>