package com.sql.Control.Blog;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Dao.DAO;
import com.sql.Model.Blog;
import com.sql.Model.Book;
import com.sql.Model.Cart;
import com.sql.Model.CartItem;
import com.sql.Model.Category;

/**
 * Servlet implementation class BlogControl
 */
@WebServlet("/Blog")
public class BlogControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		List<Blog> list = dao.getAllBlog();
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") != null) {
			Cart cart = (Cart) session.getAttribute("cart");
			List<CartItem> items = cart.getItems();
			for (CartItem a : items) {
				System.out.println(a.toString());
			}
			request.setAttribute("items", items);}
		String indexPage = request.getParameter("index");
		if(indexPage==null)
		{
			indexPage="1";
		}
		int index =Integer.parseInt(indexPage);
		List<Blog> listPa = dao.PagingBlog(index);

		int count  = dao.getTotalBlog();
		int endPage = count/6;
		if(count  % 6!=0 ) {
			endPage++;
		}
		request.setAttribute("tag", index);
		request.setAttribute("EndPage",endPage);
		request.setAttribute("ListBlog", listPa);
		request.getRequestDispatcher("blog.jsp").forward(request, response);
	}
	

}
