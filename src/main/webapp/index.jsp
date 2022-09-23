<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza Party Calculator</title>
<! @author Dennis Bowen - dmbowen
  CIS175 - Fall 2022
  Sep 20, 2022 >
</head>
<body>
	<h1>Welcome to the Pizza Party Calculator!</h1>
	<p>This will help determine the number of slices of pizza for each party-goer.
	<br>Each pizza contains 8 slices.
	</p>

	<form action="getPizzaSlicesServlet" method = "post">
	Enter the number of people at your party:
	<input type ="text" name="numberOfPeople" size = "10">
	<br>
	Enter the number of pizza pies: 
	<input type ="text" name="numberOfPizzaPies" size = "10">
	<br>
	<input type ="submit" value = "Calculate Slices" />
	</form> 
</body>
</html>