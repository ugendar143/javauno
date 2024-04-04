<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response Ex- File3</title>
</head>
<body>
   <% 
     String name=request.getParameter("name");
      out.print(name);
   %>
   
   
</body>
</html>