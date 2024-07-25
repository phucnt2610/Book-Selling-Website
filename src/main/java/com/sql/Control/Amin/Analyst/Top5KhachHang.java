package com.sql.Control.Amin.Analyst;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sql.Dao.DAO;
import com.sql.Model.Book;
import com.sql.Model.Order;

/**
 * Servlet implementation class Top5KhachHang
 */
@WebServlet("/Top5KhachHang")
public class Top5KhachHang extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("UTF-8");
			DAO dao = new DAO();
			List<Order> listPo = dao.top5KhachHang();
			request.setAttribute("listTop5", listPo);
			request.getRequestDispatcher("top5khachhang.jsp").forward(request, response);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
