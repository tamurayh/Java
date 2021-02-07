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

        <font size="5">練習問題足し算</font>
        
         <p>計算問題</p>
        <br>
        <c:out value="${Randomadd.value1}"></c:out>
        +
       <c:out value="${Randomadd.value2}"></c:out>
        =
        <form method="Post" action="./Random_addition">
            <input type="text" name="answer"> 
             <input type="submit" name="nextButton" value="決定して次へ">
        </form> 
    </body></html>

</body>
</html>