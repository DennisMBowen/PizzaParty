<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soda Calculator Results</title>
<! @author Dennis Bowen - dmbowen
  CIS175 - Fall 2022
  Sep 22, 2022 >
</head>
<body>
 <p>You entered ${userSodaCalculator.getNumberOfPeople()} party guests and ${userSodaCalculator.getNumberOfTwelvePacks()} twelve-packs of soda. <br>
Each guest at your party will get ${userSodaCalculator.getSodaPerPerson()} can(s) of soda. 
There will be ${userSodaCalculator.getLeftoverSoda()} cans of soda left over.
</p>

<a href="sodaCalculator.jsp">Try another soda calculation</a>
<br>
<a href="index.jsp">Return to pizza slice calculator</a>
</body>
</html>