<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza Slice Calculator Results</title>
<! @author Dennis Bowen - dmbowen
  CIS175 - Fall 2022
  Sep 20, 2022 >
</head>
<body>
<p>You entered ${userPizzaCalculator.getNumberOfPeople()} party guests and ${userPizzaCalculator.getNumberOfPizzaPies()} pizza pies. <br>
Each guest at your party will get ${userPizzaCalculator.getSlicesPerPerson()} slice(s). 
There will be ${userPizzaCalculator.getLeftoverSlices()} slices left over.
</p>

<a href="index.jsp">Try another pizza slice calculation</a>
<br>
<a href="sodaCalculator.jsp">Calculate the number of soda cans for each party guest</a>
</body>
</html>