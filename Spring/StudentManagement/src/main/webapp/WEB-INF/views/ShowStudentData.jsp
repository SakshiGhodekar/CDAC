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
   <h3>UseName : ${user.name}</h3>
   <h3>Email : ${user.email }</h3>
   <h3>Address : ${user.address }</h3>
   <h3>Date of Birth : ${user.dob }</h3>
   <br>
   <a href="updateForm/{user.id}">Update details</a>
</body>
</html>