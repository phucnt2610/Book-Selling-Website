package com.sql.Control.Index;

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
//Hai
/**
 * Servlet implementation class IndexControl
 */
@WebServlet("/index")
public class IndexControl extends HttpServlet {
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart) session.getAttribute("cart");
			List<CartItem> items = cart.getItems();
			request.setAttribute("items", items);}
		DAO dao = new DAO();
		List<Book> listB = dao.BestSeller();
		List<Book> listN = dao.getNewArrivals();
		List<Book> listH = dao.getHotSales();
		List<Book> listPo = dao.getPopular();
		
		request.setAttribute("listB", listB);
		request.setAttribute("listN", listN);
		request.setAttribute("listH", listH);
		request.setAttribute("listPo",listPo);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

	

}
