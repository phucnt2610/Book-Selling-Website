package com.sql.Control.Shop;

//Hai
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
 * Servlet implementation class CategoryControl
 */
@WebServlet("/category")
public class CategoryControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		String cateID = request.getParameter("cid"); // Lay id Category
		DAO dao = new DAO();
		List<Book> list = dao.getBookByCID(cateID);
		List<Category> listC = dao.getAllCategory();
		List<Author> listAu= dao.getAllAuthor();
		request.setAttribute("listAu", listAu);
		request.setAttribute("listP", list);
		request.setAttribute("listC", listC);
		request.getRequestDispatcher("shop.jsp").forward(request, response);

	}


	

}
