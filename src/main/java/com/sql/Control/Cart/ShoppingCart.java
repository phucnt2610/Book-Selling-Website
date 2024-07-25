package com.sql.Control.Cart;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Model.Cart;
import com.sql.Model.CartItem;
//Hai
/**
 * Servlet implementation class ShoppingCart
 */
@WebServlet("/ShoppingCart")
public class ShoppingCart extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			HttpSession session = request.getSession();
			if (session.getAttribute("cart") != null) {
				Cart cart = (Cart) session.getAttribute("cart");
				List<CartItem> items = cart.getItems();
				request.setAttribute("items", items);}
		try {
			if (session.getAttribute("cart") != null) {
				Cart cart = (Cart) session.getAttribute("cart");
				List<CartItem> items = cart.getItems();
				request.setAttribute("items", items);
			}
			request.getRequestDispatcher("shopping-cart.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
