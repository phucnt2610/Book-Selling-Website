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
 * Servlet implementation class PagingBook
 */
@WebServlet("/PagingBook")
public class PagingBook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		String indexPage = request.getParameter("index");
		if(indexPage==null)
		{
			indexPage="1";
		}
		int index =Integer.parseInt(indexPage);
		List<Category> listC = dao.getAllCategory();
		List<Author> listAu= dao.getAllAuthor();
		List<Book> list = dao.PagingManagerBook(index);
		int count  = dao.getTotalBook();
		int endPage = count/12;
		if(count  % 12 != 0 ) {
			endPage++;
		}
		request.setAttribute("tag", index);
		request.setAttribute("EndPage",endPage);
		request.setAttribute("listC", listC);
		request.setAttribute("listAu", listAu);
		request.setAttribute("listMa", list);
		request.getRequestDispatcher("ManagerBook.jsp").forward(request, response);
	}
}
