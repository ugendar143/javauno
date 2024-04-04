<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request-Example2</title>
<%
   String formposition=request.getParameter("form-postion");
   String pagecolor=request.getParameter("page-color");
   
   if(formposition!=null&pagecolor!=null){
%>
   <style>
   body{
     background-color:<%=   pagecolor%>
   }
   form{
      text-align:<%=  formposition %>
   }
   </style>
      <%
   
        }
   
       %>
</head>

<body>
   <form action="02_03_request.jsp" method="get">
     <input type="text" name="form-position" placeholder="left/rigth/center"/><br/>
     <input type="text" name="page-color" placeholder="Enter any color"/><br/>
     <input type="submit" value="Submit	"/>
   </form>

</body>
</html>