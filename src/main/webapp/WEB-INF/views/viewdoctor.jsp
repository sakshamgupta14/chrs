<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">


<head>
<title>CHRS | Result</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" media="all" href='css/jquery-jvectormap.css' />
<link rel="shortcut icon" href="/images/tab4.png">
<link rel="stylesheet" type="text/css" href="css/broadbill_style.css">
<link rel="stylesheet" href="boot/css/bootstrap.min.css">
<script src="js/jquery-1.12.0.min"></script>
<script src="boot/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<!--TOP Carousel-->
<div width="100%" class="top-carousel" align="center">
	<br>
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">

				<img src="/images/slide1.jpg" alt="slide_1" width="100%">
				<div class="container">
					<div class="carousel-caption">
						<h1>SHAPING THE FUTURE OF HEALTHCARE</h1>
						<p>Description here</p>

					</div>
				</div>
			</div>

			<div class="item">
				<img src="/images/slide3.jpg" alt="slide_2" width="100%">
				<div class="container">
					<div class="carousel-caption">
						<h1>CHANGING THE WORLD OF MEDICINE</h1>
						<p>Description here</p>

					</div>
				</div>
			</div>

			<div class="item">
				<img src="/images/heartbeat2.jpg" alt="slide_3" width="100%">
				<div class="container">
					<div class="carousel-caption">
						<h1>QUALITY FOR EVERYONE</h1>
						<p>Description here</p>

					</div>
				</div>
			</div>

		</div>
	</div>
</div>
<!--End of Carousel-->

<!-- Fixed navbar -->
<nav class="navbar  navbar-default navbar-fixed mynavbar" id="mynavbar"
	width="100%">
<div class="container">

	<!--navbar header-->
	<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed"
			data-toggle="collapse" data-target="#pharma-navbar"
			aria-expanded="false" aria-controls="navbar">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="/home" id="brand"
			style="color: #008B8B; font-size: 30px; font-family: 'Courier New', Courier, monospace;"><b>CHRS</b></a>
	</div>

	<!--navbar content-->
	<div id="pharma-navbar" class="navbar-collapse collapse">
		<ul class="nav navbar-nav navbar-right">
			<li class="active" style="margin: 0px"><a href="/home">Home</a></li>
			<li><a href="#about">About</a></li>
			<li><a href="/register">Register</a></li>
			<li><a href="#contact">Contact Us</a></li>
		</ul>
	</div>
	<!--/.nav-collapse -->
</div>
</nav>
<!--end of navbar-->

<!--Main content-->
<div class="container">
	
	Dr. ${doctors.name } <br/>
	In Time :  ${doctors.inTime }<br/>
	Out Time : ${doctors.outTime } <br/>
	Contact No: ${doctors.contactNo } <br/>
	Address : ${doctors.address }<br/>
	<!--Google map-->
	<div class="container-fluid" style="margin: 10px">
		<div id="googleMap" style="width: 100%; height: 50px;"></div>
	</div>
	<!-- Other relevant data-->
	<div class="container"></div>

</div>


<!--footer-->
<footer>
<hr>
<!--main footer content-->
<div class="container">
	<div class="row">

		<div class="col-md-9">
			<!--for categories column-->
			<div class="col-sm-6">
				<h4>Categories</h4>
				<ul>
					<li class="foot"><a href="">Category 1</a></li>
					<li class="foot"><a href="">Category 2</a></li>
					<li class="foot"><a href="">Category 3</a></li>
					<li class="foot"><a href="">Category 4</a></li>
				</ul>
			</div>

			<!--for contact column-->
			<div class="col-sm-6">
				<img src="/images/logo.jpg" width="50%" />
			</div>
		</div>

		<div class="clearfix hidden-lg hidden-md"></div>

		<!--for social media links-->
		<div class="col-md-3">
			<p>
				Follow Us On :<br> <br>
			<div class="row" align="left">
				<div class="col-xs-3" align="left">
					<a href="https://www.facebook.com/" target="_BLANK"><img
						src="/images/social/fb.png"
						onmouseover="this.src='/images/social/fbhover.png'"
						onmouseout="this.src='/images/social/fb.png'"></a>
				</div>
				<div class="col-xs-3" align="left">
					<a href="https://plus.google.com/" target="_BLANK"><img
						src="/images/social/g+.png"
						onmouseover="this.src='/images/social/g+hover.png'"
						onmouseout="this.src='/images/social/g+.png'" target="blank"></a>
				</div>
				<div class="col-xs-3" align="left">
					<a href="https://twitter.com/" target="_BLANK"><img
						src="/images/social/twitter.png"
						onmouseover="this.src='/images/social/twitterhover.png'"
						onmouseout="this.src='/images/social/twitter.png'" target="blank"></a>
				</div>
			</div>
		</div>
	</div>
</div>
<!--end of main footer content--> <!--developer and other information-->
<hr>
<div class="container" style="margin-top: 10px">
	<div class="row">

		<div class="col-sm-9">
			<b> Copyright &copy; 2016. All rights reserved. </b>
		</div>

		<div class="col-sm-3">
			<b align="right"> Powered by <a href="#" target="_BLANK">
					SEAD</a>
			</b>
		</div>

	</div>
</div>
<!--end of the information data--> </footer>
<!--end of footer-->

<!--glyphicon icon for the page to scroll top-->
<div class="container scrollup"
	style="position: fixed; bottom: 40px; right: 1%" align="right">
	<span class="glyphicon glyphicon-menu-up"></span>
</div>


<!--jquery src for scripting-->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!--src for scripting of moving the page to top-->
<script src="jquery/footer.js"></script>


<!--jquery src for scripting-->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</body>
</html>



<%-- 
<jsp:include page="homepage3.jsp"></jsp:include> --%>