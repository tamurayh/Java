<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>問題ページ</title>
</head>
<body>
		<font size="5">練習問題掛け算</font>

         <p>計算問題 ユーザー名：<c:out value="${account.name }"></c:out></p>
        <br>
        <c:out value="${Randomadd.value1}"></c:out>
        ×
       <c:out value="${Randomadd.value2}"></c:out>
        =
        <form method="Post" action="./Random_multiplication">
        <input type="hidden" name="value1" value= "${Randomadd.value1}">
        <input type="hidden" name="value2" value= "${Randomadd.value2}">
         <input type="hidden" name="userid" value= "${account.id}">
            <input type="text" name="answer"> 
             <input type="submit" name="nextButton" value="決定して次へ">
        </form> 

</body>
</html>