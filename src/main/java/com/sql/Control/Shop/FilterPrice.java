package com.sql.Control.Shop;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;
import com.sql.Model.Author;
import com.sql.Model.Book;
import com.sql.Model.Category;
//Hai
/**
 * Servlet implementation class FilterPrice
 */
@WebServlet("/FilterPrice")
public class FilterPrice extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		int req_num = Integer.parseInt(request.getParameter("filter_id"));
		switch(req_num) {
		case 1:
			List<Book> listFill1 = dao.getBookPrice1to5();
			request.setAttribute("listP", listFill1);
			break;
		case 2:
			List<Book> listFil2 = dao.getBookPrice5to7();
			request.setAttribute("listP", listFil2);
			break;
		case 3:
			List<Book> listFill3 = dao.getBookPrice7to10();
			request.setAttribute("listP", listFill3);
			break;
		case 4:
			List<Book> listFill4 = dao.getBookPrice10to20();
			request.setAttribute("listP", listFill4);
			break;
		case 5:
			List<Book> listFill5 = dao.getBookPrice20to30();
			request.setAttribute("listP", listFill5);
			break;
		case 6:
			List<Book> listFill6 = dao.getBookPrice30to40();
			request.setAttribute("listP", listFill6);
			break;
		}
		List<Category> listC = dao.getAllCategory();
		List<Author> listAu= dao.getAllAuthor();
		request.setAttribute("listAu", listAu);
		request.setAttribute("listC", listC);
		request.getRequestDispatcher("shop.jsp").forward(request, response);
	}

	

}
