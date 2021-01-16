<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="sample.MeiboBean"%>
<% MeiboBean med = (MeiboBean) request.getAttribute("med");%>
<html>
<head>
<meta charset="UTF-8">
<title>results</title>
</head>
<body>

ユーザー名：<%=med.getName()%>


</body>
</html>