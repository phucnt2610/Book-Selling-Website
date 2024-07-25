package com.sql.Control.Contact;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Dao.DAO;
import com.sql.Email.SendMail;
import com.sql.Model.Cart;
import com.sql.Model.CartItem;

import javax.mail.Authenticator;
import javax.mail.Message;
/**
 * Servlet implementation class SendMailControl
 */
//Hai
@WebServlet("/SendMailControl")
public class SendMailControl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("contact.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		DAO dao = new DAO();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart) session.getAttribute("cart");
			List<CartItem> items = cart.getItems();
			for (CartItem a : items) {
				System.out.println(a.toString());
			}
			request.setAttribute("items", items);}
		String name =request.getParameter("Name");
		String email =request.getParameter("Email");
		String content = request.getParameter("Messeage");
		String format = "name";
		SendMail.sendMailToEmail(email,name,content);
		dao.InsertFeedback(name, email, email, content);
		response.sendRedirect("contact.jsp");
	}
}
