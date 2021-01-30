<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>問題</title>
</head>
<jsp:useBean id="Randamu_sakusei" class="arithmetic.Randamu_sakusei" scope="page" />
<body>

        <font size="5">練習問題足し算</font>
        
         <p>計算問題</p>
        <br>
        <%=Randamu_sakusei.getvalue1()%>
        +
        <%=Randamu_sakusei.getvalue2()%>
        =
        <form method="GET" action="./Addition_Servlet">
            <input type="text" name="answer"> <input type="submit"
                name="nextButton" value="決定して次へ">
        </form> 
    </body></html>

</body>
</html>