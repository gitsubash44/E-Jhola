package com.controller.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Data.Userdata;
import com.controller.Data.Userdataimp;
import model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/RegisterServlet" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String username = request.getParameter("username");
        LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateOfBirth"));
	    String gender = request.getParameter("gender");
	    String phoneNumber = request.getParameter("phoneNumber");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");

	    User user = new User(username, dateOfBirth, gender, phoneNumber, email, password);
	    user.setUsername(username);
	    user.setDateOfBirth(dateOfBirth);
	    user.setGender(gender);
	    user.setPhoneNumber(phoneNumber);
	    user.setEmail(email);
	    user.setPassword(password);
	    
	    // UserData userData = new UserDataImpl();
	    Userdata userData = new Userdataimp();
	    
	    if (userData.addUser(user)) {
	        response.sendRedirect("login.jsp?registration=success");
	    } else {
	        response.sendRedirect("register.jsp?error=1");
	    }
	}

	
}
