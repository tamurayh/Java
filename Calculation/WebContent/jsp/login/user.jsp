<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
<title>ユーザーページ</title>
<link rel="stylesheet" type="text/css" href="./css/user.css"/>
</head>
<body>
<div class="user">
<p>　　　ユーザー名：<c:out value="${account.name }"></c:out></p>
	<form method="get" action="./Random_addition">
	        <input type="submit" name="nextButton" value="足し算">
    </form>
    <form method="get" action="./Random_subtraction">
	        <input type="submit" name="nextButton" value="引き算">
    </form>
    <form method="get" action="./Random_multiplication">
	        <input type="submit" name="nextButton" value="掛け算">
    </form>
    
    <form method="get" action="./Random_division">
	        <input type="submit" name="nextButton" value="割り算">
    </form>
</div>
</body>
</html>