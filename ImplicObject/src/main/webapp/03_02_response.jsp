<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response Ex-2 File2</title>
</head>
<body>
<%
   String username=request.getParameter("username");
   out.print("Welcome:"+username);
   response.sendRedirect("03_03_response.jsp?name="+username);
%>

</body>
</html>