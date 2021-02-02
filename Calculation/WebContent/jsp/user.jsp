<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザーページ</title>
</head>
<body>
<p>　　　名前：<c:out value="${account.name }"></c:out></p>
<a href="register.jsp"><button type="button" >新規登録の方はこちら</button></a>
	<form method="get" action="./Random_addition">
	        <input type="submit" name="nextButton" value="足し算">
        </form>
</body>
</html>