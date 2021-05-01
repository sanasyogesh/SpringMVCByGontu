<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page.</title>
</head>
<body>

	<form:errors path="student.*"/>

	<form action="/SpringMVCByGontu/registration.html" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" /></td>
			</tr>
			
			<tr>
				<td>Mobile No</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			
			<tr>
				<td>Date Of Birth</td>
				<td><input type="text" name="dob" /></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td>
					<select name="skillSets" multiple>
						<option value="Core Java">Core Java</option>
						<option value="Java 8">Java 8</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
						<option value="Spring Boot">Spring Boot</option>
						<option value="Hibernate">Hibernate</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>Country</td>
				<td><input type="text" name="studentAddress.country" /></td>
			</tr>
			
			<tr>
				<td>State</td>
				<td><input type="text" name="studentAddress.state" /></td>
			</tr>
			
			<tr>
				<td>City</td>
				<td><input type="text" name="studentAddress.city" /></td>
			</tr>
			
			<tr>
				<td>Pin Code</td>
				<td><input type="text" name="studentAddress.pincode" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" /></td>
			</tr>
			
			
			
		
		</table>
	
	</form>


</body>
</html>