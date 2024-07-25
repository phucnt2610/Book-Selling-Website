package com.sql.Control.Amin.ManagerBook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;
//Hai
/**
 * Servlet implementation class DeleteControl
 */
@WebServlet("/delete")
public class DeleteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String bid = request.getParameter("bid");
		DAO dao = new DAO();
		dao.DeleteBook(bid);
		response.sendRedirect("ManagerBook");
	}

}
