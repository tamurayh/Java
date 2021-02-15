<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果ページ</title>
</head>
<body>

	<p>正解の答えは</p>
	<c:out value="${Randomadd.value1}"></c:out>
	 ÷
	<c:out value="${Randomadd.value2}"></c:out>
	=
	<%= request.getAttribute("Additionresult") %>
        
	<form method="get" action="./Random_division">
	<input type="submit" name="nextButton" value="次の問題">
	</form>

</body>
</html>