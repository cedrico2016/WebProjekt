package net.core.dao;

import java.sql.*;

import net.code.model.User;
import net.core.utils.RandomString;

public class UserDAO {
  /*  public User checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
	String jdbcURL = "jdbc:mysql://localhost:3306/bookshop";
	String dbUser = "root";
	String dbPassword = "password";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	String sql = "SELECT * FROM users WHERE email = ? and password = ?";
	PreparedStatement statement = connection.prepareStatement(sql);
	statement.setString(1, email);
	statement.setString(2, password);
	
	ResultSet result = statement.executeQuery();
	
	User user = null;
	
	if (result.next()) {
	    user = new User();
	    user.setFullname(result.getString("fullname"));
	    user.setEmail(email);
	}
	
	connection.close();
	
	return user;
	}*/
    
    public User checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
    	
    	return new User("fullnam", "email", "password");
    }
    
   public boolean checkUserExists(String email) throws SQLException, ClassNotFoundException {    	
    	return false;
    }
    
   public User saveUser(String email, String password, int age, String name) {
	   User user = new User(name, email, password, age);
	   RandomString code = new RandomString();
	   user.setRegistrierungsCode(code.nextString());
	   
	   return user;
   }
   
   
    
    
}
