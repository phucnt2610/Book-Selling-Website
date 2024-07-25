package com.sql.Control.Amin.Analyst;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sql.Dao.DAO;
import com.sql.Model.Book;

/**
 * Servlet implementation class top10SanPham
 */
@WebServlet("/top10SanPham")
public class top10SanPham extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		DAO dao = new DAO();
		List<Book> listPo = dao.Selectop10();
		request.setAttribute("listTop", listPo);
		request.getRequestDispatcher("Top10.jsp").forward(request, response);
	}

	
}
