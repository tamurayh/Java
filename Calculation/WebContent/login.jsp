<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1> ログインをしてください。</h1>
        <form method="GET" action="./Sample">
          <p>ユーザー名: <input type="text" name="uername"></p> 
          <p>パスワード: <input type="text" name="uerpass"></p>
          <input type="submit" name="nextButton" value="ログイン">
        </form>
	

</body>
</html>