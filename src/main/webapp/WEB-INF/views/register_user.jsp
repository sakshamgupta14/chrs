<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
<jsp:include page="mynav.jsp"></jsp:include>
<title>Register</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="css/broadbill_style.css">
<link rel="stylesheet" href="boot/css/bootstrap.min.css">
<script src="boot/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container-fluid" style="margin: 2% 5% 2% 5%">
		<form role="form" class="form-horizontal" method="POST"
			action="/registeruser">
			<h2 class="well" align="center">Registration Form</h2>
			<hr>

			<!--Personal Detail's Information-->
			<div class="form-group">
				<h3>Personal Details</h3>
				<div class="col-lg-8">
					<label class="control-label col-lg-3" for="name">NAME :</label>
					<div class="col-lg-8">
						<input type="text" class="form-control" id="name" name="name"
							placeholder="Your Name" />
					</div>
				</div>
				<div class="col-lg-4">
					<label class="control-label col-lg-6" for="blood_group">Blood
						Group : </label>
					<div class="col-lg-6">
						<input type="text" class="form-control" id="blood_group"
							name="blood_group" placeholder="Blood Group" />
					</div>
				</div>
			</div>
			<!--for date of birth-->
			<div class="form-group">
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="dob">Date of
						birth :</label>
					<div class="col-lg-6">
						<input type="date" class="form-control" id="dob" name="dob">
					</div>
				</div>
				<!--for gender-->
				<div class="offset"></div>
				<div class="col-lg-6" align="center">
					<h4 style="display: inline-block">GENDER :
						&nbsp&nbsp&nbsp&nbsp&nbsp</h4>
					<div class="radio-inline">
						<label for="male"><input type="radio" id="male"
							name="gender" value="male">Male </label>
					</div>
					<div class="radio-inline">
						<label for="female"><input type="radio" id="female"
							name="gender" value="female">Female </label>
					</div>
				</div>
			</div>
			<hr>

			<!--Contact Information-->
			<h3>Contact Information</h3>
			<div class="form-group">
				<label class="control-label col-lg-3" for="address">Address
					:</label>
				<div class="col-lg-8">
					<input type="text" class="form-control" id="address" name="address"
						placeholder="Address" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-6">
					<label class="control-label col-lg-5" for="state">State :</label>
					<div class="col-lg-7">
						<select class="form-control" id="state" name="state">
							<option value="0">Andhra Pradesh</option>
							<option value="1">Arunachal Pradesh</option>
							<option value="2">Assam</option>
							<option value="3">Bihar</option>
							<option value="4">Chhattisgarh</option>
							<option value="29">Delhi</option>
							<option value="5">Goa</option>
							<option value="6">Gujarat</option>
							<option value="7">Haryana</option>
							<option value="8">Himachal Pradesh</option>
							<option value="9">Jammu & Kashmir</option>
							<option value="10">Jharkhand</option>
							<option value="11">Karnataka</option>
							<option value="12">Kerala</option>
							<option value="13">Madhya Pradesh</option>
							<option value="14">Maharashtra</option>
							<option value="15">Manipur</option>
							<option value="16">Meghalaya</option>
							<option value="17">Mizoram</option>
							<option value="18">Nagaland</option>
							<option value="19">Odisha (Orissa)</option>
							<option value="20">Punjab</option>
							<option value="21">Rajasthan</option>
							<option value="22">Sikkim</option>
							<option value="23">Tamil Nadu</option>
							<option value="24">Telangana</option>
							<option value="25">Tripura</option>
							<option value="26">Uttar Pradesh</option>
							<option value="27">Uttarakhand</option>
							<option value="28">West Bengal</option>
						</select>
					</div>
				</div>
				<div class="col-lg-6">
					<label class="control-label col-lg-4" for="city">City :</label>
					<div class="col-lg-8">
						<input type="text" class="form-control" id="city" name="city"
							placeholder="city" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="pin">Pin-code :</label>
					<div class="col-lg-6">
						<input type="text" min="0" class="form-control" id="pin"
							name="pin" placeholder="PIN-CODE" maxlength="6" />
					</div>
				</div>
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="con_number">Contact
						Number : </label>
					<div class="col-lg-6">
						<input type="text" class="form-control" id="con_number"
							name="con_number" placeholder="Contact Number" />
					</div>
				</div>

			</div>


			<!--Other Information-->
			<hr>
			<h3>Other Information</h3>
			<div class="form-group">
				<div class="row">
					<div class="col-lg-6">
						<label class="control-label col-lg-6" for="emp">Employment
							: </label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="emp" name="emp"
								placeholder="Employment" />
						</div>
					</div>
					<div class="col-lg-6">
						<label class="control-label col-lg-6" for="income">Average
							Yearly Income : </label>
						<div class="col-lg-6">
							<input type="number" min="0" class="form-control" id="income"
								name="income" placeholder="Income" />
						</div>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-8">
					<label class="control-label col-lg-6" for="med_allergic">Medicine/Drugs
						Allergic to: </label>
					<div class="col-lg-6">
						<input type="text" min="0" class="form-control" id="med_allergic"
							name="med_allergic" placeholder="Allergic Drugs" />
					</div>
				</div>
				<div class="col-lg-4">
					<div class="checkbox-inline">
						<label for="insurance"><input type="checkbox"
							id="insurance" name="insurance">Health Insurance</label>
					</div>
				</div>
			</div>

			<!--Login Information-->
			<hr>
			<h3>Login Information</h3>
			<div class="form-group">
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="user_id">User_Id
						: </label>
					<div class="col-lg-6">
						<input type="text" class="form-control" id="username"
							name="username" placeholder="Desired User_ID" />
					</div>
				</div>
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="email">Email : </label>
					<div class="col-lg-6">
						<input type="email" class="form-control" id="email" name="email"
							placeholder="Email" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="password">Password
						: </label>
					<div class="col-lg-6">
						<input type="password" class="form-control" id="password"
							name="password" placeholder="Password" />
					</div>
				</div>
				<div class="col-lg-6">
					<label class="control-label col-lg-6" for="con_password">Confirm
						Password : </label>
					<div class="col-lg-6">
						<input type="password" class="form-control" id="con_password"
							name="con_password" placeholder="Confirm Password" />
					</div>
				</div>
			</div>

			<br>

			<div class="form-group col-centered" align="center">
				<input type="submit" id="submit" class="btn btn-success"
					value="Register" /> <input type="reset" class="btn btn-warning"
					value="Reset The Data" />

			</div>
		</form>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="validation.js"></script>

</body>
</html>