<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Result</title>
</head>
<body>hello
<c:choose>
	<c:when test="${doctors }!=null">
		<c:forEach items="${doctors }" var="doctor">
			${doctor.name }
		</c:forEach>
	</c:when>
	<c:otherwise>
		no hos in your location
	</c:otherwise>
</c:choose>
</body>
</html>