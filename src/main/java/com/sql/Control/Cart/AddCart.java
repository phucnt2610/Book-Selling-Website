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
 * Servlet implementation class AddCart
 */
@WebServlet("/add-cart")
public class AddCart extends HttpServlet {
	//Hai
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
				int quantity = 1;
				if(request.getParameter("quantity") != null)
				{
					quantity = Integer.parseInt(request.getParameter("quantity"));
				}
	
				CartItem item = new CartItem(0,0, quantity, book);
				if(cart == null)
				{
					cart = new Cart();
					if(session.getAttribute("acc")!= null)
					{
						User user = (User) session.getAttribute("acc"); // Lay User
						cart.setuId(user.getuID());
					}
				}
				cart.add(item);
				session.setAttribute("cart", cart);
				request.getRequestDispatcher("shop").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
