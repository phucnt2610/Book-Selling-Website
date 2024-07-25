package com.sql.Control.Amin.ManagerBook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;

/**
 * Servlet implementation class EditbookControl
 */
@WebServlet("/edit")
public class EditbookControl extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse responseonse) throws ServletException, IOException {
		responseonse.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String image = request.getParameter("image");
		String price = request.getParameter("price");
		String PriceSale = request.getParameter("PriceSale");
		String getCate = request.getParameter("category");
		String getauthor = request.getParameter("author");
		int category = Integer.parseInt(getCate);
		int author = Integer.parseInt(getauthor);
		DAO dao =new DAO();
		dao.EditBook(name, image, price, PriceSale, category, author, id);
		responseonse.sendRedirect("ManagerBook");
	}

}
