<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<jsp:include page="mynav.jsp"></jsp:include>
<head>
	<title>Register</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet" type="text/css" href="css/broadbill_style.css">
	<link rel="stylesheet" href="boot/css/bootstrap.min.css">
	<script src="boot/js/bootstrap.min.js"></script>

  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  </head>

<body>
	<div class="container-fluid" style="margin:2% 5% 2% 5%">
		<form role="form" class="form-horizontal" method="POST" action="/registerdoc">
			<h2 class="well" align="center">Registration Form</h2>
			<hr>
			
			<!--Personal Detail's Information-->
			<div class="form-group">
				<h3>Personal Details</h3>
				<div class="col-lg-8">
					<label class="control-label col-lg-3" for="name">NAME :</label>
					<div class="col-lg-8">
						<input type="text" class="form-control" id="name" name="name" placeholder="Your Name"/>
					</div>
				</div>
				<div class="col-lg-4">
					<label class="control-label col-lg-6" for="blood_group">Blood Group : </label>
					<div class="col-lg-6">
						<input type="text"  class="form-control" id="blood_group" name="blood_group" placeholder="Blood Group"/>
					</div>
				</div>
			</div>
			<!--for date of birth-->
			<div class="form-group">
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="dob">Date of birth :</label>
					<div class="col-lg-6">
						<input type="date" class="form-control" id="dob" name="dob">
					</div>
				</div>
				<!--for gender-->
				<div class="offset">
				</div>
				<div class="col-lg-6" align="center">
				<h4 style="display:inline-block">GENDER : &nbsp&nbsp&nbsp&nbsp&nbsp </h4>
					<div class="radio-inline"><label for="male"><input type="radio" id="male" name="gender" value="male">Male </label></div>				
					<div class="radio-inline"><label for="female"><input type="radio" id="female" name="gender" value="female">Female </label></div>
				</div>
			</div>
			<hr>
			
			<!--Contact Information-->
			<h3>Contact Information</h3>
			<div class="form-group">
				<label class="control-label col-lg-3" for="address">Address :</label>
				<div class="col-lg-8">
					<input type="text" class="form-control" id="address" name="address" placeholder="Address"/>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-6">
				
				</div>
				<div class="col-lg-6">
					<label class="control-label col-lg-4" for="location">Location :</label>
					<div class="col-lg-8">
						<input type="text" class="form-control" id="location" name="location" placeholder="location"/>
					</div>
				</div>
			</div>
			<div class="form-group">
				
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="con_number">Contact Number : </label>
					<div class="col-lg-6">
						<input type="text" class="form-control" id="contactNo" name="contactNo" placeholder="Contact Number"/>
					</div>
				</div>
				
			</div>
			
			
			<!--Other Information-->
			<hr>
			<h3>Other Information</h3>
			<div class="form-group">
				<div class="row">	
					<div class="col-lg-6">
						<label class="control-label col-lg-6" for="Field">Field : </label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="field" name="field" placeholder="field"/>
						</div>
					</div>

					<div class="col-lg-6">
						<label class="control-label col-lg-6" for="inTime">In Time : </label>
						<div class="col-lg-6">
							<input type="text" min="0" class="form-control" id="inTime" name="inTime" placeholder="In Time"/>
						</div>
					<div class="col-lg-6">
						<label class="control-label col-lg-6" for="outTime">Out Time : </label>
						<div class="col-lg-6">
							<input type="text" min="0" class="form-control" id="outTime" name="outTime" placeholder="Out Time"/>
						</div>
					</div>
				</div>
			</div>
			
			
			
			
			<br>
			
			<div class="form-group col-centered" align="center">
					<input type="submit" id="submit" class="btn btn-success" value="Register"/>
					<input type="reset" class="btn btn-warning" value="Reset The Data"/>
				
			</div>
		</form>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>	
	<script src="validation.js"></script>
	
</body>
</html>
