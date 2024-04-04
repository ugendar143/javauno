<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="Task.LoginModel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>	Welcome </title>
</head>
<body>
<p> hello welcome to unocareer </p>
 <%
   LoginModel lm= (LoginModel)request.getAttribute("login");
 %>
 <p><%=lm.getUserName() %></p>
</body>
