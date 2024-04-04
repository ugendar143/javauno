<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib tagdir="/WEB-INF/tags/Common/header" prefix="header" %>
    <%@taglib tagdir="/WEB-INF/tags/Common/footer" prefix="footer" %>
    
     <%@taglib tagdir="/WEB-INF/tags/nav" prefix="nav" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<title>Amazon | Online Shopping Site</title>
</head>
<body>

<header:header></header:header>
<nav:tabs></nav:tabs>



<div class="container">
    
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
   
      <article>
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="image/Ajio.jpeg" alt="Clothing" style="width:100%;">
      </div>
      <div class="item">
        <img src="image/eletronics.jpeg" alt="Mobiles" style="width:100%;">
      </div>
       <div class="item">
        <img src="image/kid'swear.jpeg" alt="Kitchenware" style="width:100%;">
      </div>
    </div>
    </article>
     

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<hr>
<div class="row">
       <div class="col-sm-3 p-3 bg-dark text-white">
          <img src="image/mobile2.jpeg" alt="mobile" style="width:100%;">
       </div>
       <div class="col-sm-3 p-3 bg-primary text-white">
          <img src="image/mobile1.jpeg" alt="mobile" style="width:100%;">
       </div>
       <div class="col-sm-3 p-3 bg-dark text-white">
          <img src="image/mobile.jpeg" alt="mobile" style="width:100%;">
       </div>
       <div class="col-sm-3 p-3 bg-primary text-white">
         <img src="image/mobile1.jpeg" alt="mobile" style="width:100%;">
       </div>
</div>
<hr>
<div class="row">
    <div class="col-sm-3 p-3 bg-dark text-white">
      <img src="image/LapTop.jpeg" alt="laptop" style="width:100%;">
    </div>
    <div class="col-sm-3 p-3 bg-primary text-white">
      <img src="image/laptop1.jpeg" alt="laptop" style="width:100%;">
    </div>
    <div class="col-sm-3 p-3 bg-dark text-white">
      <img src="image/laptop2.jpeg" alt="laptop" style="width:100%;">
    </div>
    <div class="col-sm-3 p-3 bg-primary text-white">
      <img src="image/laptop3.jpeg" alt="laptop" style="width:100%;">
    </div>
</div>
<hr>

<div class="row">
    <div class="col-sm-3 p-3 bg-dark text-white">
      <img src="image/Bikes.jpeg" alt="laptop" style="width:100%;">
    </div>
    <div class="col-sm-3 p-3 bg-primary text-white">
      <img src="image/bike1.jpeg" alt="laptop" style="width:100%;">
    </div>
    <div class="col-sm-3 p-3 bg-dark text-white">
      <img src="image/bike2.jpeg" alt="laptop" style="width:100%;">
    </div>
    <div class="col-sm-3 p-3 bg-primary text-white">
      <img src="image/bike3.jpeg" alt="laptop" style="width:100%;">
    </div>
</div>

<footer:footer></footer:footer>


</body>
</html>
