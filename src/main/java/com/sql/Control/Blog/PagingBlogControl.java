package com.sql.Control.Blog;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;
import com.sql.Model.Blog;
import com.sql.Model.Book;
import com.sql.Model.Category;

/**
 * Servlet implementation class PagingBlogControl
 */
@WebServlet("/PagingBlogControl")
public class PagingBlogControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
		String indexPage = request.getParameter("index");
		if(indexPage==null)
		{
			indexPage="1";
		}
		int index =Integer.parseInt(indexPage);
		List<Blog> list = dao.PagingBlog(index);
		int count  = dao.getTotalBlog();
		int endPage = count/6;
		if(count  % 6!=0 ) {
			endPage++;
		}
		request.setAttribute("tag", index);
		request.setAttribute("EndPage",endPage);
		request.setAttribute("ListBlog", list);
		request.getRequestDispatcher("blog.jsp").forward(request, response);
	}

}
