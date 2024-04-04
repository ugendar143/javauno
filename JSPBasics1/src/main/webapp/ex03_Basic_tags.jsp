<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basics JSP tags</title>
<style>
   table, th,td {
    border:1px solid black;
    border-collapse: collapse; 
   }
    th,td{
    padding:5px;
    }
</style>
</head>
<body>
<h2>Declaration</h2>
<%!
   int number1=10;
   int number2=20;
   
   String str="this is declaration tag";
   
   public int add(int number3){
	   return number1+number2+number3;
   }

    public String convertToUppercase(String str){
         return str.toUpperCase();    	
    }
%>
  <h2>Script Tags</h2>
<%
    int number4=60;
    out.print("number1 = -"+number1+"<br/>");
    out.print("number2 = -"+number2+"<br/>");
    out.print("Addition = -"+add(number4)+"<br/>");
    out.print("Uppercase = -"+convertToUppercase(str));
     
   /*  public int subtract(int number3);{
      return number1-number2-nymber3;
    } */
   
  
%>
<p><a href ="ex03_scriptlet.jsp?name=ugendar">Test Scriptlet tags</a></p>


<h2>Expression Tag</h2>
 <% out.print("<br/> This is number1 -" + number1);%>
 <%= "<br/> This is number1 -" + number1%>
<table>
<tr>
    <tr>
       <th>Name</th>
       <th>Value</th>
     </tr>
    <tr>
       <td> number1</td>
      <td><%=number1 %></tr>td>
   </tr>
   <tr>
       <td> number2</td>
      <td><%=number2 %></td>
   </tr>
   <tr>
       <td> number4</td>
      <td><%=number4 %></tr>td>
   </tr>
   <tr>
      <td>Add 3 numbers</td>
      <td><%= add(number4) %></td>
    </tr>
      <td>Upper case</td>
       
      <td><%=convertToUppercase("hi, how are you")%></td>
      
 </tr>
</table>   


</body>
</html>