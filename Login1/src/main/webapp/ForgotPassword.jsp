<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
  <link rel="stylesheet" href="ForgotPassword.css"/>
</head>
<body>
        <form action="ForgotPassword" method="post"></form>
        <input type="text" name="MobileNO" placeholder="Enter MobileNo"/><br/>
        <input type="text" name="OTP" placeholder="Enter OTP"/><br/>
         <input type="text" name="New Password" placeholder="Enter New Pasword"/><br/>
         <input type="text" name="Conform Password" placeholder="Re-Enter Password"/><br/>
         <a href="LoginForm.html"><input type="submit" value="submit"></a>
</body>
</html>