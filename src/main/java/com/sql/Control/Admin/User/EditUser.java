package com.sql.Control.Admin.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/EditUser")
public class EditUser extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
			String name = request.getParameter("name");
		String email = request.getParameter("email");
		String image = request.getParameter("image");
		String phone = request.getParameter("phone");
		String pass = request.getParameter("pass");
		String username = request.getParameter("username");
		int uid = Integer.parseInt(id);
		DAO dao =new DAO();
		dao.EditUser(name, image, email, phone, image, pass, username, uid);
		response.sendRedirect("ManagerUser");
	}
	

}
