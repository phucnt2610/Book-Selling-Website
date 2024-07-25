package com.sql.Control.Cart;

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
import com.sql.Model.User;

/**
 * Servlet implementation class DeleteCart
 */
@WebServlet("/DeleteCart")
public class DeleteCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart) session.getAttribute("cart");
			List<CartItem> items = cart.getItems();
		
			request.setAttribute("items", items);}
		request.setCharacterEncoding("UTF-8");
		try {
			if(request.getParameter("BId")!= null)
			{
				DAO dao =new DAO();
				String BId = request.getParameter("BId");
				Book book = dao.getBookByBId(BId);
				Cart cart = (Cart) session.getAttribute("cart"); // Lay Cart
				
				cart.delete(new CartItem(0, 0, 0, book));;
				session.setAttribute("cart", cart);
				response.sendRedirect(request.getContextPath()+"/ShoppingCart");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
