package com.sql.Control.Blog;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.sql.Dao.DAO;
import com.sql.Model.Blog;
import com.sql.Model.Coment;
/**
 * Servlet implementation class Comment
 */
@WebServlet("/Comment")
public class CommentControl extends HttpServlet {
	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		try {
			DAO dao =new DAO();
			HttpSession session = request.getSession();
			Blog blogid = (Blog) session.getAttribute("blogid");
			String content = request.getParameter("content");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			List<Coment> list = dao.GetCmtbyID(blogid.getBlogID());
			dao.InsertCmt(blogid.getBlogID(), content, name, email, phone, getCurrentDate());
			request.setAttribute("blogDetail", blogid);
			request.setAttribute("listCommnent", list);
			request.getRequestDispatcher("blog_details.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
