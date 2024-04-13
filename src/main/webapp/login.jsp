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
        <h1>Login</h1>
        
        <form action="LoginServlet" method="post"> <!-- Change method to "post" -->
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            
            <div class="d-flex justify-content-between align-items-center">
            <!-- Checkbox -->
            <div class="form-check mb-0">
            <label class="form-check-label">Remember me  <input class="form-check-input me-2" type="checkbox" value=""/></label>
              
            </div> <br>
              <!-- Checkbox -->
              
            <a href="#!" class="text-body">Forgot password?</a>
          </div> <br>
            
            <button type="submit">Login</button>
        </form>

        <p><a href="Welcome.jsp">Back to Home</a></p>

        <%-- Display error message if login fails --%>
        <% String error = request.getParameter("error");
            if (error != null && error.equals("1")) { %>
                <p style="color: red;">Invalid username or password. Please try again.</p>
        <% } %>
        
        <%-- Display error message if Register Successful --%>
        <% String rs = request.getParameter("registration");
            if (rs != null && rs.equals("success")) { %>
                <p style="color: green;">Your Registration is Successful. Please Login.</p>
        <% } %>
    </div>

</body>
</html>