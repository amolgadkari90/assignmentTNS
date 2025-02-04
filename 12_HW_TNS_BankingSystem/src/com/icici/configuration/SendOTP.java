package com.icici.configuration;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendOTP {
	
	private SendOTP() {
		
	}

//	 public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        
//			//int otp = OTPGeneration.generateOTP();
//			//System.out.println("Otp = "+otp);
//	        
//	        // Accept email from user
//	        System.out.print("Enter recipient's email: ");
//	        
//	        String recipientEmail = scanner.nextLine();
//
//	        // Message to send
//	        String subject = "Hello from Java!";
//	        String message = ("OTP ="+otp); //"This is a test email sent using Java.";
//
//	        // Send email
//	        sendEmail(recipientEmail, subject, message);
//	        
//	        scanner.close();
//	    }

	    public static void sendEmail(String to, String subject, String messageText) {
	        final String from = "amolgadkari90@gmail.com";  // Change this
	        final String password = "vsnl crpl xaba vyxi" ;  // Change this
	        
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");

	        Session session = Session.getInstance(props, new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(from, password);
	            }
	        });

	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(from));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
	            message.setSubject(subject);
	            message.setText(messageText);

	            Transport.send(message);
	            System.out.println("📧 Email sent successfully to " + to);
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	
}
