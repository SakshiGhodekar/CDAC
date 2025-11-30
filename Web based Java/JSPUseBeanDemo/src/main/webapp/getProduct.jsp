<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p" class="com.demo.beans.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"></jsp:setProperty>
<h1>Product Data</h1>
Product id:<jsp:getProperty property="pid" name="p"></jsp:getProperty><br>
Product name:<jsp:getProperty property="pname" name="p"></jsp:getProperty><br>
Product quantity:<jsp:getProperty property="qty" name="p"></jsp:getProperty><br>
Product price:<jsp:getProperty property="price" name="p"></jsp:getProperty>
</body>
</html>