package com.sql.Control.Blog;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Dao.DAO;
import com.sql.Model.Cart;

/**
 * Servlet implementation class AddBlog
 */
@WebServlet("/AddBlog")
public class AddBlog extends HttpServlet {
	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		DAO dao = new DAO();
		try {
			String Title = request.getParameter("Title");
			String bId = request.getParameter("BId");
			String Name =request.getParameter("Name");
			String BlogImage = request.getParameter("BlogImage");
			String BlogCon1 = request.getParameter("BlogCon1");
			String BlogCon2 = request.getParameter("BlogCon2");
			String BlogCon3 = request.getParameter("BlogCon3");
			String Quotes = request.getParameter("Quotes");
			String Author = request.getParameter("Author");
			String ImageDetail = request.getParameter("ImageDetail");
			String AuthorQuotes = request.getParameter("AuthorQuotes");
			int BId = Integer.parseInt(bId);
			dao.InsertBlog(Title, BId, BlogImage, BlogCon1, BlogCon2, BlogCon3, Quotes, Author, ImageDetail, AuthorQuotes, getCurrentDate(), Name);
			request.getRequestDispatcher("ManagerBlog").forward(request, response);
							
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
