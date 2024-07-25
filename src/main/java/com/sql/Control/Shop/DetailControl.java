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
import com.sql.Model.Book;
import com.sql.Model.Cart;
import com.sql.Model.CartItem;
//Hai
/**
 * Servlet implementation class DetailControl
 */
@WebServlet("/detail")
public class DetailControl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart) session.getAttribute("cart");
			List<CartItem> items = cart.getItems();
			for (CartItem a : items) {
				System.out.println(a.toString());
			}
			request.setAttribute("items", items);}
		String Bid = request.getParameter("Bid");
		DAO dao = new DAO();
		Book B = dao.getBookByBId(Bid);
		List<Book> listPo = dao.getPopular();
		
		request.setAttribute("detail", B);
		request.setAttribute("listPo",listPo);
		request.getRequestDispatcher("shopping_detail.jsp").forward(request, response);
}	
}