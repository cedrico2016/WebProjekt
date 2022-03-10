package net.core.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import net.code.model.User;
import net.core.dao.UserDAO;
import net.core.utils.SendEmail;

import java.io.*;
import java.sql.SQLException;
import java.util.ResourceBundle;

//@WebServlet("/login")
public class UserRegisterServlet extends HttpServlet{
	
	private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
	 private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
	 private static final long serialVersionUID = 1L;
	 
	    public UserRegisterServlet() {
	        super();
	    }
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        String age = request.getParameter("age");
	        String name = request.getParameter("name");
	         
	        UserDAO userDao = new UserDAO();
	         
	        try {
	            boolean userExists = userDao.checkUserExists(email);
	            String destPage = "register.jsp";
	            String message = "";
	            if (!userExists) {
	                HttpSession session = request.getSession();
	                User user = userDao.saveUser(email, password, Integer.parseInt(age), name);
	                message ="Ihr Konto wurde eingerichtet. Bitte klicken Sie auf dem Registrierungslink. Prüfen Sie bitte Ihre Postfach.";
	                SendEmail.sendMail(email, user.getRegistrierungsCode());
	                request.setAttribute("message", message);
	               // destPage = "home.jsp";
	            } else {
	            	destPage = "login.jsp";
	            	message ="Registrierung nicht möglich: Ein Konto existiert schon mit dieser E-Mail Adresse";
	                request.setAttribute("message", message);
	            }
	             
	            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
	            dispatcher.forward(request, response);
	             
	        } catch (SQLException | ClassNotFoundException ex) {
	            throw new ServletException(ex);
	        }
	    }
}
