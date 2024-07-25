package com.sql.Control.Admin.User;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;
import com.sql.Model.Author;
import com.sql.Model.Book;
import com.sql.Model.Category;
import com.sql.Model.User;

/**
 * Servlet implementation class LoadUser
 */
@WebServlet("/LoadUser")
public class LoadUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		DAO dao = new DAO();
		User B = dao.getUserByBId(uid);
		System.out.print(B);
		request.setAttribute("detail", B);
		request.getRequestDispatcher("EditUser.jsp").forward(request, response);
	}


}
