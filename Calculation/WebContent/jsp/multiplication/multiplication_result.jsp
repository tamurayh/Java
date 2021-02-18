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
<p>正解</p>
	<form method="get" action="./Random_multiplication">
		<input type="submit" name="nextButton" value="次の問題">
    </form>
</div>
</body>
</html>