<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login&register.css">

</head>
<body>
	<div class="container">
		<h1>Register</h1>
		<form action="RegisterServlet" method="post">
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" placeholder="Enter Your username"
				required><br> <label for="dateOfBirth">Date of
				Birth:</label> <input type="date" id="dateOfBirth" name="dateOfBirth"
				required><br>
			<div class="form-group">
				<label for="gender">Gender:</label> <select id="gender"
					name="gender">
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
				</select>
			</div>
			<label for="phone">Phone Num:</label> <input type="in" id="phone"
				name="phoneNumber" placeholder="Enter Your phone number" required><br>
				
			<label for="email">Email:</label> <input type="email" id="username"
				name="email" placeholder="Enter your Email" required><br>
			<label for="password">Password:</label> <input type="password"
				id="password" name="password" placeholder="Enter your password"
				required><br>
			<button type="submit">Register</button>
		</form>

		<p>
			<a href="Welcome.jsp">Back to Home</a>
		</p>

		<%-- Display error message if registration fails --%>
		<% String error = request.getParameter("error");
           if (error != null && error.equals("1")) {
        	   %>
		<p style="color: red;">Registration failed. Please try again.</p>
		<% } %> 
	</div>

</body>
</html>