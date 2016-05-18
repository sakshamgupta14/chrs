<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Fixed navbar -->
	<nav class="navbar  navbar-default mynavbar" id="mynavbar" width="100%">
      <div class="container">
        
		<!--navbar header-->
		<div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#pharma-navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/home" id="brand" style="color:#008B8B;font-size:30px;font-family:'Courier New', Courier, monospace;"><b>CHRS</b></a>
        </div>
        
		<!--navbar content-->
		<div id="pharma-navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li class="active" style="margin:0px"><a href="/home">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="/register">Register With Us</a></li>
			<li><a href="/contact">Contact Us</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
	<!--end of navbar-->
	
	<!--jquery src for scripting-->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>	

	<!--src for scripting of navbar-->
	<script src="jquery/header-navbar.js"></script>
