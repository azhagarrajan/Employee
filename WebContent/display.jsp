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
<tr>Employee name="<%= request.getAttribute("employeeName") %>"</tr> 
<tr>Employee Id ="<%= request.getAttribute("employeeId") %>"</tr> 
<tr>Phone number="<%= request.getAttribute("phoneNumber") %>"</tr> 
<tr>Email Id ="<%= request.getAttribute("emailId") %>"</tr> 

</body>
</html>