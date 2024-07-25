package com.sql.Control.Blog;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;
import com.sql.Model.Blog;
import com.sql.Model.Book;

/**
 * Servlet implementation class ManagerBlog
 */
@WebServlet("/ManagerBlog")
public class ManagerBlog extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		List<Book> listBook= dao.getAllBook();
		request.setAttribute("listBook", listBook);
		request.getRequestDispatcher("ManagerBlog.jsp").forward(request, response);
	}

	

}
