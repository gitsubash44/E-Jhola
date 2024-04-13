<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
    
    <%
    try {
        HttpSession session1 = request.getSession(false);
        if (session1 != null && session1.getAttribute("username") != null) {
            String username = (String) session1.getAttribute("username");
            // Display page content
        } else {
            // Redirect to login page
            response.sendRedirect("login.jsp");
        }
    } catch (Exception e) {
        // Handle exceptions gracefully
        e.printStackTrace(); // or log the exception
        // Redirect to an error page or display an error message
        response.sendRedirect("error.jsp");
    }
%>
    
    
    
    
    <h1>E-Jhola aaudai x hai bajar ma </h1>





</body>
</html>