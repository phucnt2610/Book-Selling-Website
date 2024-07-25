package com.sql.Control.Amin.ManagerBook;

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

/**
 * Servlet implementation class loadControl
 */
@WebServlet("/loadProduct")
public class loadControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Bid = request.getParameter("Bid");
		DAO dao = new DAO();
		Book B = dao.getBookByBId(Bid);
		List<Category> listC = dao.getAllCategory();
		List<Author> listAu= dao.getAllAuthor();
		
		request.setAttribute("detail", B);
		request.setAttribute("listC", listC);
		request.setAttribute("listAu", listAu);
		request.getRequestDispatcher("Edit.jsp").forward(request, response);
		
	}

	
}
