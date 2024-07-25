package com.sql.Control.Shop;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Dao.DAO;
import com.sql.Model.Author;
import com.sql.Model.Book;
import com.sql.Model.Cart;
import com.sql.Model.CartItem;
import com.sql.Model.Category;
//Hai
/**
 * Servlet implementation class PagingControl
 */
@WebServlet("/Paging")
public class PagingControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart) session.getAttribute("cart");
			List<CartItem> items = cart.getItems();
			request.setAttribute("items", items);}
		DAO dao = new DAO();
		String indexPage = request.getParameter("index");
		if(indexPage==null)
		{
			indexPage="1";
		}
		int index =Integer.parseInt(indexPage);
		List<Book> list = dao.PagingBook(index);
		List<Category> listC = dao.getAllCategory();
		List<Author> listAu = dao.getAllAuthor();
		int count  = dao.getTotalBook();
		int endPage = count/6;
		if(count  % 6!=0 ) {
			endPage++;
		}
		request.setAttribute("tag", index);
		request.setAttribute("EndPage",endPage);
		request.setAttribute("listP", list);
		request.setAttribute("listAu", listAu);
		request.setAttribute("listC", listC);
		request.getRequestDispatcher("shop.jsp").forward(request, response);
	}

	
}
