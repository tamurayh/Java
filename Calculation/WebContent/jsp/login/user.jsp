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
<p>　　　ユーザー名：<c:out value="${account.name }"></c:out></p>
	<form method="get" action="./Random_addition">
	        <input type="submit" name="nextButton" value="足し算">
    </form>
    <form method="get" action="./Random_subtraction">
	        <input type="submit" name="nextButton" value="引き算">
    </form>
       <form method="get" action="./Random_multiplication">
	        <input type="submit" name="nextButton" value="引き算">
    </form>

</body>
</html>