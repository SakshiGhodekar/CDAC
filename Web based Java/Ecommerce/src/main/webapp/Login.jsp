<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="validateUser" method="post">
    User name: <input type="text" name="uname" id="unm"><br/>
    Password: <input type="text" name="pass" id="pass"><br/>
    <button type="submit" name="login" id="login">Login</button>
  </form>
  <a href="Register.jsp">Sign Up?</a><br/>
  <a href="ForgotPassword.jsp">forgot password?</a><br/>
  
</body>
</html>