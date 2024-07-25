package com.sql.Control.Shop;
//Hai
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

/**
 * Servlet implementation class shop
 */
@WebServlet("/shop")
public class ShopControl extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart) session.getAttribute("cart");
			List<CartItem> items = cart.getItems();
			request.setAttribute("items", items);}
		DAO dao = new DAO();
		int totalBook = dao.getTotalBook();
		List<Book> list = dao.getAllBook();
		List<Author> listAu= dao.getAllAuthor();
		List<Category> listC = dao.getAllCategory();
		String indexPage = request.getParameter("index");
		if(indexPage==null)
		{
			indexPage="1";
		}
		int index =Integer.parseInt(indexPage);
		List<Book> listPa = dao.PagingBook(index);

		int count  = dao.getTotalBook();
		int endPage = count/6;
		if(count  % 6!=0 ) {
			endPage++;
		}
		request.setAttribute("tag", index);
		request.setAttribute("totalBook", totalBook);
		request.setAttribute("EndPage",endPage);
		request.setAttribute("listP", listPa);
		request.setAttribute("listC", listC);
		request.setAttribute("listAu", listAu);
		request.getRequestDispatcher("shop.jsp").forward(request, response);
	}

	
	}
