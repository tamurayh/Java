<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
<title>問題ページ</title>
<link rel="stylesheet" type="text/css" href="./css/background.css"/>
</head>
<body>
<div class="problem">
　<h2>練習問題足し算</h2>
        
 <p>計算問題 ユーザー名：<c:out value="${account.name }"></c:out></p>
 <br>
 <p> <c:out value="${Randomadd.value1}"></c:out>
  +
 <c:out value="${Randomadd.value2}"></c:out>
  =</p>
 <form method="Post" action="./Random_addition">
 <input type="hidden" name="value1" value= "${Randomadd.value1}">
 <input type="hidden" name="value2" value= "${Randomadd.value2}">
 <input type="hidden" name="userid" value= "${account.id}">
 <div class="cp_iptxt">
 <label class="ef">
 <input type="text" name="answer"> 
 </label>
 </div>
 <input type="submit" name="nextButton" value="決定して次へ">
 </form> 
</div>

</body>
</html>