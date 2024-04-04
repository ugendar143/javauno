<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegesterForm</title>
<link rel="stylesheet" href="Regestation.css"/>
</head>
<body>
     <p>Sign Up Here</p>
    <form action="Sign Up" method="post"></form>
    <input type="text" name="EmailId" placeholder="Enter Email"/><br/>
    <input type="text" name="UserName" placeholder="Enter Name"/><br/>
    <input type="text" name="Password" placeholder="Enter Password"/><br/>
    <p>Gender</p>
        <label class="container">Male
         <input type="checkbox" checked="checked">
         <span class="checkmark"></span>
       </label>

       <label class="container">Female
         <input type="checkbox">
         <span class="checkmark"></span>
      </label>
        <br/>
       
      <a href="LoginForm.html"><input type="submit" value="submit"/></a>
    

</body>
</html>