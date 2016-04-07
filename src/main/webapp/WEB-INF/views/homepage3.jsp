<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
<title>CHRS | Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" media="all" href='css/jquery-jvectormap.css' />
<link rel="shortcut icon" href="images/tab4.png">
<link rel="stylesheet" type="text/css" href="css/broadbill_style.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script src="js/map/googleMap.js"></script>
</head>

<body>

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
					<img src="images/heartbeat2.jpg" alt="slide_3" width="100%">
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

	<!--navigation bar-->

	<jsp:include page="mynav.jsp"></jsp:include>
	<!--end of navigation bar-->

	<!--Main content of the page-->
	<div class="container" class="main">
		<div class="row">
			<div class="col-lg-4" align="center">
				<img class="img-circle" src="images/people.jpg"
					alt="Broadbill Pharma - Quality For Everyone" width="140"
					height="140">
				<h2>QUALITY FOR EVERYONE</h2>
				<p>We believe that superior quality is key to our long-term
					success. Our advanced technologies, decades of experience, and
					rigorous standards all contribute to quality at a price that
					everyone can afford.</p>
			</div>

			<div class="col-lg-4" align="center">
				<img class="img-circle" src="images/healthcare.jpg"
					alt="Broadbill Pharma - Shaping the Future" width="140"
					height="140">
				<h2>SHAPING THE FUTURE OF HEALTHCARE</h2>
				<p>Going beyond standard generics, we use innovation and
					expertise to develop even the most complex medicines for patient
					healthcare – from biosimilars and complex injectables to
					respiratory and specialty generics.</p>
			</div>

			<div class="col-lg-4" align="center">
				<img class="img-circle" src="images/medicine.jpg"
					alt="Broadbill Pharma - Changing The World of Medicine" width="140"
					height="140">
				<h2>CHANGING THE WORLD OF MEDICINE</h2>
				<p>As a world leader in pharmaceutics, we are focused on finding
					innovative ways to make medicines affordable and accessible to more
					than 90 percent of the world’s population.</p>
			</div>
		</div>
		<hr>

		<div class="container-fluid" align="center"
			style="margin: 2% 5% 2% 5%; border: 2px solid #AFAFAF; padding: 0em 3em 3em 3em; border-radius: 10px">
			<form role="form" class="form-horizontal" method="get"
				enctype="multipart/form-data" action="/search">
				<h2 class="well" align="center">Query Box</h2>
				<hr>
				<!--Other relevant Information-->
				<div class="form-group">
					<div class="col-lg-6">
						<label class="control-label col-lg-5" for="state">Location
							:</label>
						<div class="col-lg-7">
							<select class="form-control" id="locationName" name="locationName">
								<option value="0">--select any one--</option>
								<option value="1">Crossing Republik</option>
								<option value="6">Gandhi Nagar</option>
								<option value="2">Raj Nagar</option>
								<option value="3">Kavinagar</option>
								<option value="5">ShastriNagar</option>
								<option value="4">GhantaGhar</option>
								<option value="7">PatelNagar</option>
								<option value="8">Indirapuram</option>
								<option value="9">Vaishali</option>
							</select>
						</div>
					</div>
					<div class="col-lg-6">
						<label class="control-label col-lg-4" for="salary">Average
							Salary :</label>
						<div class="col-lg-8">
							<input type="text" class="form-control" id="salary" name="salary"
								placeholder="Salary In Number" />
						</div>
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-5" for="service">Type OF
						Service :</label>
					<div class="col-lg-7">
						<select class="form-control" id="service" name="service">
							<option value="0">--select any one--</option>
							<option value="ENT">ENT</option>
							<option value="Orthopadic">Orthopadic</option>
							<option value="Dentist">Dentist</option>
							<option value="Physician">Physician</option>
						</select>
					</div>
				</div>



				<div class="form-group col-centered" align="center">
					<input type="submit" id="submit" class="btn btn-success"
						value="Search" /> <input type="reset" class="btn btn-warning"
						value="Reset The Data" />

				</div>
			</form>
		</div>

		<!--faded panel-->
		<div class="panel panel-default" style="margin-top: 5%">
			<div class="panel-heading" id="panelhead" style="font-size: 30px;">
				Who We Are..?</div>
			<div class="panel-body" id="mypanel">Lorem ipsum dolor sit
				amet, consectetur adipiscing elit. Nam eu condimentum nulla, at
				efficitur diam. Integer nunc eros, tempor ut ex quis, congue tempor
				dolor. Sed dictum, lacus vel ultrices bibendum, turpis lectus
				hendrerit leo, eget aliquet mauris risus sed tellus. Morbi varius
				sapien eros, eget accumsan sem porttitor non. Nam ultrices sed odio
				sed porta. Aliquam elementum eget quam eu congue. Donec laoreet dui
				vel augue luctus molestie.</div>

		</div>

		<!--map-->

		<div class="container">
			<div id="googleMap" style="width: 85%; height: 400px;"></div>
		</div>
		<!--footer-->

		<jsp:include page="myfoot.jsp"></jsp:include>
	</div>
	<!--end  of footer-->



	<!--jquery src for scripting-->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

	<!-- Bootstrap core JavaScript
    ==================================================-->
	<!--external jquery include file containig function-->
	<script src="jquery/homepage-script.js"></script>



</body>
</html>
