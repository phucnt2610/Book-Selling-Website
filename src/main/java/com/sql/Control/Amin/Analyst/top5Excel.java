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
import com.sql.Model.Order;

/**
 * Servlet implementation class top5Excel
 */
@WebServlet("/top5Excel")
public class top5Excel extends HttpServlet {
	   

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			DAO dao = new DAO();
			List<Order> listPo = dao.top5KhachHang();
			XSSFWorkbook workbook = new XSSFWorkbook();
		    XSSFSheet sheet = workbook.createSheet("Top5_User");
		    int rowNum = 1;
		    Row firstRow = sheet.createRow(rowNum++);
		    Row SecondRow = sheet.createRow(rowNum++);
		    Cell firstCell = firstRow.createCell(0);
		    Cell cell8 = SecondRow.createCell(0);
		    cell8.setCellValue("ID");
	        Cell cell5 = SecondRow.createCell(1);
	        cell5.setCellValue("Name");
	        Cell cell6 = SecondRow.createCell(2);
	        cell6.setCellValue("Số điện thoại");
	        Cell cell7 = SecondRow.createCell(3);
	        cell7.setCellValue("Email");
	        Cell cell10 = SecondRow.createCell(4);
	        cell10.setCellValue("Total");
		    firstCell.setCellValue("Top 5 khách hàng ");
		    for (Order order : listPo) {
		        Row row = sheet.createRow(rowNum++);
		        Cell cell1 = row.createCell(0);
		        cell1.setCellValue(order.getUserId());
		        Cell cell2 = row.createCell(1);
		        cell2.setCellValue(order.getName());
		        Cell cell3 = row.createCell(2);
		        cell3.setCellValue(order.getPhone());
		        Cell cell4 = row.createCell(3);
		        cell4.setCellValue(order.getEmail());
		        Cell cell15 = row.createCell(4);
		        cell5.setCellValue(order.getTotal());
		      }
		  try { 
			  FileOutputStream outputStream = new FileOutputStream("C:\\FinalProjectWeb\\Top5KhachHang.xlsx");
			     workbook.write(outputStream);
			     workbook.close();
			     request.setAttribute("mess", "Đã xuất file");
				 request.getRequestDispatcher("Top5KhachHang").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}

}
