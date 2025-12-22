<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<form action="/StudentManagement/login/validate" method="post">
<label  for="useremail">Enter User Email : </label>
<input type="text" name="useremail" id="useremail">
<label  for="password">Enter User Password : </label>
<input type="password" name="password" id="password">
<button type="submit" name="loginBtn" id="loginBtn">Login</button>
</form>
</body>
</html>