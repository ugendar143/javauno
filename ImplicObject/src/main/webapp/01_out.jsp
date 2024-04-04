<%@page import="java.util.Date"  %>
<%@page import="java.time.LocalDate" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Out Example</title>
<style>
  span#first{
     color:red;
  }
  span#second{
     color:blue;
  }
  
</style>
</head>
<body>

<p>
    current time is:<% out.print(new Date());  %>
</p>

<%
    int num1=10;
    int num2=20;
    
    out.print("num1 is<span id = 'first'>"+num1+"</span><br/>");
    out.print("num2 is<span id = 'second'>"+num1+"</span><br/>");
%>
   <p>PI = <%= Math.PI %></p>
   <p>Date Today:<%= LocalDate.now() %></p>
</body>
</html>