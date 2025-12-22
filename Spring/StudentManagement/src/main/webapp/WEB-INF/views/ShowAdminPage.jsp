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
<table>
<tr>
<th>ID</th>
<th>NAME</th>
<th>ADDRESS</th>
<th>EMAIL</th>
<th>DOB</th>
<th>Delete</th>
<th>Update</th>
</tr>

<c:forEach var="p" items="${uList }">
<tr>
<td>${ p.id}</td>
<td>${ p.name}</td>
<td>${ p.address}</td>
<td>${ p.email}</td>
<td>${ p.dob}</td>
<td><a href="updateForm/${p.id}"><button>update</button></a></td>
<td><a href="delete/${p.id }"><button>delete</button></a></td>
</tr>
</c:forEach>
</table>
<br>
<a href="updateForm/-1">Update details</a>
</body>
</html>