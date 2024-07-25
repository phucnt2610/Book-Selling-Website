package com.sql.Control.Login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Dao.DAO;
import com.sql.Email.ForgotEmail;
import com.sql.Email.SendMail;
import com.sql.Model.Cart;
import com.sql.Model.CartItem;

/**
 * Servlet implementation class ForgotPass
 */
@WebServlet("/ForgotPass")
public class ForgotPass extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		request.setCharacterEncoding("UTF-8");
		String email =request.getParameter("email");
		String content = "Mật khẩu của bạn là: " + dao.getPass(email) ;
		System.out.println(content);
		ForgotEmail.sendMailToEmail(email, content);
		request.getRequestDispatcher("login").forward(request, response);
	}
}
