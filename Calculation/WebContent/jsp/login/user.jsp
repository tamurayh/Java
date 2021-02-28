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
<canvas id="canvas"></canvas>
<script src="/Calculation/js/user.js"></script>
<header>
<div class="userheader">
<p>ユーザー名：<c:out value="${account.name }"></c:out></p>
</div>
</header>
<article>
<div class="user">
</div>
</article>
<aside>
<div class="box scroll" >

	<h1>算　数</h1>
	<p>---------------------------------</p>
	<form method="get" action="./Random_addition">
	        <input class="btn btn--orange" type="submit" name="nextButton" value="足し算">
    </form>
    <br>
    <p>---------------------------------</p>
    <form method="get" action="./Random_subtraction">
	        <input class="btn btn--orange" type="submit" name="nextButton" value="引き算">
    </form>
    <br>
    <p>---------------------------------</p>
    <form method="get" action="./Random_multiplication">
	        <input class="btn btn--orange" type="submit" name="nextButton" value="掛け算">
    </form>
    <br>
    <p>---------------------------------</p>
    <form method="get" action="./Random_division">
	        <input class="btn btn--orange" type="submit" name="nextButton" value="割り算">
    </form>
    <br>
    <p>---------------------------------</p>
    <h1>過去問算数</h1>
</div>
</aside>
<footer>
<div class="footer">
<form method="get" action="./logoutSarvlet">
	       <input class="btn" type="submit" name="nextButton" value="ログアウト">
</form>
</div>
</footer>
</body>
</html>