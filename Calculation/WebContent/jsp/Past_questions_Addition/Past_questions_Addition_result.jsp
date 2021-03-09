<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
<title>結果ページ</title>
<link rel="stylesheet" type="text/css" href="./css/mistake.css"/>
</head>
<body>
<div class="mistake">
<P>正解</P>
<br>
	<form method="get" action="./Past_questions_Addition_Servlet">
	<input type="hidden" name="userid" value= "${account.id}">
    <input type="hidden" name="countadd" value= "${count.count_addition}">
    <input type="hidden" name="countaddall" value= "${count.count_additionall}">
	<input type="submit" name="nextButton" value="次の問題">
    </form>
 <form method="Post" action="./count_Sarvlet">
 <input type="hidden" name="userid" value= "${account.id}">
 <input type="submit" name="nextButton" value="ユーザーページにもどる">
</form>
 </div>
</body>
</html>