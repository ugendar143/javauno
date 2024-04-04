<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request- Example1</title>
</head>
<body>
     
     <p>Star Pattern</p>
     <%
      String n= request.getParameter("no_of_rows");
     int noofRows = Integer.parseInt(n);
     
     for( int i=1; i<=noofRows; i++){
    	 for( int j=1; j<=i; j++){
    		 out.print("*");
    	 }
    	 out.print("<br/>");
     }
     
     %>

</body>
</html>