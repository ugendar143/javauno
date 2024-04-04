<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletvsJSP</title>
</head>
<body>
<p style='font-size:18px;color;red;text-decoration: underline;'>
 Hellow this content is dynamically prepared
</p>
  
  <%
  
   String greet=request.getParameter("grettings");
   out.print("<p>"+greet+"</p>");
  
  %>
</body>
</html>