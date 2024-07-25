package com.sql.Control.Cart;

import java.io.IOException;
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

/**
 * Servlet implementation class UpdateCart
 */
@WebServlet("/UpdateCart")
public class UpdateCart extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		request.setCharacterEncoding("UTF-8");
		try {
			if (request.getParameter("BId") != null) {
				DAO dao = new DAO();
				String BId = request.getParameter("BId");
				Book book = dao.getBookByBId(BId);
				Cart cart = (Cart) session.getAttribute("cart"); // Lay Cart
				int quantity = 1;
				if (request.getParameter("quantity") != null) {
					quantity = Integer.parseInt(request.getParameter("quantity"));
					CartItem item = new CartItem(0, 0, quantity, book);
					cart.update(item);
					session.setAttribute("cart", cart);
					response.sendRedirect(request.getContextPath() + "/ShoppingCart");
				} else {
					request.setAttribute("mess", 1);
					request.getRequestDispatcher("ShoppingCart.jsp").forward(request, response);
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
