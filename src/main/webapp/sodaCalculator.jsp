<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soda Calculator</title>
<! @author Dennis Bowen - dmbowen
  CIS175 - Fall 2022
  Sep 22, 2022 >
</head>
<body>
	<h1>Welcome to the Soda Calculator!</h1>
	<p>This will help determine how many twelve-packs of soda will be needed for the pizza party.
	</p>
	
	<form action="getTwelvePackServlet" method = "post">
	Enter the number of people at your party:
	<input type ="text" name="numberOfPeople" size = "10">
	<br>
	Enter the amount of twelve-packs of soda that is being purchased for the party:
	<input type ="text" name="numberOfTwelvePacks" size = "10">
	<br>
	<input type ="submit" value = "Calculate Soda per Person" />
	</form> 
</body>
</html>