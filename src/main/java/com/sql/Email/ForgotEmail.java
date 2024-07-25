package com.sql.Email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ForgotEmail {
	static final String ACCOUNT = "baboga12@outlook.com";
	static final String PASSWORD = "Ngochai0612";
	static final String SUBJECT = "Quên mật khẩu.";

	public static void sendMailToEmail(String email,  String Content) {
		String fromEmail = ACCOUNT;
		try {
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.office365.com");
			props.put("mail.smtp.post", "587");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.ssl.protocols", "TLSv1.2");
			Authenticator auth = new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(ACCOUNT, PASSWORD);
				}
			};
			// Gui email
			Session session = Session.getInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
			// set data for mail
			msg.setFrom(new InternetAddress(fromEmail, "Hai"));
			msg.setReplyTo(InternetAddress.parse(fromEmail, false));
			msg.setText(Content, "UTF-8");
			msg.setSubject(SUBJECT, "UTF-8");
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email, false));
			Transport.send(msg);
			System.out.println("Send mail complete");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
