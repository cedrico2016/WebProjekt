package net.core.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import net.code.model.User;
import net.core.dao.UserDAO;

import java.io.*;
import java.sql.SQLException;
import java.util.ResourceBundle;

//@WebServlet("/login")
public class UserLoginServlet extends HttpServlet{
	
	private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
	 private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
	 private static final long serialVersionUID = 1L;
	 
	    public UserLoginServlet() {
	        super();
	    }
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	         
	        UserDAO userDao = new UserDAO();
	         
	        try {
	            User user = userDao.checkLogin(email, password);
	            String destPage = "login.jsp";
	             
	            if (user != null) {
	                HttpSession session = request.getSession();
	                session.setAttribute("user", user);
	                destPage = "home.jsp";
	            } else {
	                String message = "Invalid email/password";
	                request.setAttribute("message", message);
	            }
	             
	            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
	            dispatcher.forward(request, response);
	             
	        } catch (SQLException | ClassNotFoundException ex) {
	            throw new ServletException(ex);
	        }
	    }
}
