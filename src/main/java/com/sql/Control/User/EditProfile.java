package com.sql.Control.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.util.SystemOutLogger;

import com.sql.Dao.DAO;
import com.sql.Model.Cart;
import com.sql.Model.User;

/**
 * Servlet implementation class EditProfile
 */
@WebServlet("/EditProfile")
public class EditProfile extends HttpServlet {
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		try {
			User user = (User) session.getAttribute("acc");
			String username = req.getParameter("user");
			String passsword = req.getParameter("pass");
			String email = req.getParameter("email");
			String image = req.getParameter("images");
			DAO dao = new DAO();
			dao.UpdateUser(user, username, passsword, image, email);
			session.setAttribute("acc", user);
			req.setAttribute("mess", "Vui lòng đăng nhập lại");
			req.getRequestDispatcher("Profile.jsp").forward(req, resp);
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
		
			

	}
}
