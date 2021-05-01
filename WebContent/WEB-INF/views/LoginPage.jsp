<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Landing Page.</title>
</head>
<body>

<h2>Congratulations!!! You are In... </h2>
<h3>Your User Name is : ${student.userName}</h3>
<h3>Your Password is : ${student.password}</h3>
<h3>Your Mobile No is : ${student.mobile}</h3>
<h3>Your DOB is : ${student.dob}</h3>
<h3>Your Skill sets : ${student.skillSets}</h3>
<h3>Your Country : ${student.studentAddress.country}</h3>
<h3>Your State : ${student.studentAddress.state}</h3>
<h3>Your City : ${student.studentAddress.city}</h3>
<h3>Your Pin Code : ${student.studentAddress.pincode}</h3>
</body>
</html>