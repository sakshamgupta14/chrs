<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<div class="container-fluid" style="margin:2% 5% 2% 5%">
		<form role="form" class="form-horizontal" method="POST" enctype="multipart/form-data" action="/search">
			<!--Other relevant Information-->	
			<div class="form-group">
				<div class="col-lg-6">
					<label class="control-label col-lg-5" for="state">Location :</label>
					<div class="col-lg-7">
						<select class="form-control" id="state" name="state">
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
					<label class="control-label col-lg-4" for="salary">Average Salary :</label>
					<div class="col-lg-8">
						<input type="text" class="form-control" id="salary" name="salary" placeholder="Salary In Number"/>
					</div>
				</div>
			</div>
			
			
			<div class="form-group">
				<label class="control-label col-lg-5" for="state">Location :</label>
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
			
			
			
			<div class="form-group col-centered" align="center">
					<input type="submit" id="submit" class="btn btn-success" value="Search"/>
					<input type="reset" class="btn btn-warning" value="Reset The Data"/>
				
			</div>
		</form>
	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>	
	<script src="validation.js"></script>
	
</body>
</html>
