package com.sql.Control.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Dao.DAO;
import com.sql.Model.User;
//Hai
/**
 * Servlet implementation class LoginControl
 */
@WebServlet("/login")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("user");
		String passsword = request.getParameter("pass");
		DAO dao = new DAO();
		User a = dao.login(username, passsword);
		User b = dao.login(username, passsword);
		if(a == null)
		{
			request.setAttribute("mess", "Wrong User or Password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("acc", a);
			session.setAttribute("bcc", b);
			response.sendRedirect("shop");// Khong can truyen du lieu
		}
	}



}
