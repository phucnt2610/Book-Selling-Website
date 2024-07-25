package com.sql.Control.Admin.User;

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
import com.sql.Model.User;

/**
 * Servlet implementation class PagingUser
 */
@WebServlet("/PagingUser")
public class PagingUser extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		String indexPage = request.getParameter("index");
		if(indexPage==null)
		{
			indexPage="1";
		}
		int index =Integer.parseInt(indexPage);
		List<User> list = dao.PagingManagerUser(index);
		int count  = dao.getTotalUser();
		int endPage = count/12;
		if(count  % 10 != 0 ) {
			endPage++;
		}
		request.setAttribute("tag", index);
		request.setAttribute("EndPage",endPage);
		request.setAttribute("listMa", list);
		request.getRequestDispatcher("ManagerUser.jsp").forward(request, response);
	}
	

	

}
