package net.core.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	
	 final static  String username = "076aeefca51724";//username generated by Mailtrap
     final static  String password = "3a6a8159318972";//password generated by Mailtrap
     final static String host = "smtp.mailtrap.io";
     final static Properties props = new Properties();
     static String from = "from@example.com";

	 public static void main(String[] args) {
	      // Put recipient�s address
	      String to = "cedrico2015@gmail.com";
	      
	      // Put sender�s address
	     


	      // Paste host address from the SMTP settings tab in your Mailtrap Inbox
	     

	     
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");//it�s optional in Mailtrap
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "2525");// use one of the options in the SMTP settings tab in your Mailtrap Inbox

	      // Get the Session object.
	      


	   }
	 
	 
	 public static void sendMail(String recipiender, String registrierungsCode) {
		 
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");//it�s optional in Mailtrap
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "2525");
	      
	      
	      Session session = Session.getInstance(props,
	 	         new javax.mail.Authenticator() {
	 	            protected PasswordAuthentication getPasswordAuthentication() {
	 	               return new PasswordAuthentication(username, password);
	 	    }
	 	         });
	      
	      
	      try {
	    // Create a default MimeMessage object.
	    Message message = new MimeMessage(session);

	    // Set From: header field
	    message.setFrom(new InternetAddress(from));

	    // Set To: header field
	    message.setRecipients(Message.RecipientType.TO,
	               InternetAddress.parse(recipiender));

	    // Set Subject: header field
	    message.setSubject("Ihre Registrierung auf XXX Webseite ");

	    // Put the content of your message
	    message.setText("Vielen Dank f�r Ihre Registrierung auf der Webseite. Klicken Sie bitte auf dem Link http://"+registrierungsCode+" hier um Ihre Registrierung abzuschlie�en. Vielen Dank.");

	    // Send message
	    Transport.send(message);

	    System.out.println("Sent message successfully....");

	      } catch (MessagingException e) {
	         throw new RuntimeException(e);
	      }
	 }

}