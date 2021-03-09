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
<div class="user scroll">
<h1>正解数/問題数</h1>
<br>
<p>足し算 　<c:out value="${count.count_addition}"></c:out>/<c:out value="${count.count_additionall}"></c:out></p>
<br>
<p>引き算　　<c:out value="${count.count_subtraction}"></c:out>/<c:out value="${count.count_subtractionall}"></c:out></p>
<br>
<p>掛け算　　<c:out value="${count.count_muitiplication}"></c:out>/<c:out value="${count.count_muitiplicationall}"></c:out></p>
<br>
<p>割り算　　<c:out value="${count.count_divsion}"></c:out>/<c:out value="${count.count_divsionall}"></c:out></p>
<br>
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
    <form method="get" action="./Past_questions_Addition_Servlet">
    <input type="hidden" name="userid" value= "${account.id}">
    <input type="hidden" name="countadd" value= "${count.count_addition}">
    <input type="hidden" name="countaddall" value= "${count.count_additionall}">
 	<input class="btn btn--orange"type="submit" name="nextButton" value="過去問足し算">
 	</form>
 	<br>
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