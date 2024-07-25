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
 * Servlet implementation class Top10Excel
 */
@WebServlet("/Top10Excel")
public class Top10Excel extends HttpServlet {

       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO dao = new DAO();
		List<Book> listPo = dao.Selectop10();
		XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet sheet = workbook.createSheet("Top10_Book");
	    int rowNum = 1;
	    Row firstRow = sheet.createRow(rowNum++);
	    Row SecondRow = sheet.createRow(rowNum++);
	    Cell firstCell = firstRow.createCell(0);
	    Cell cell8 = SecondRow.createCell(0);
	    cell8.setCellValue("ID");
        Cell cell5 = SecondRow.createCell(1);
        cell5.setCellValue("Name");
        Cell cell6 = SecondRow.createCell(2);
        cell6.setCellValue("Giá");
	    firstCell.setCellValue("Top 10 sách bán chạy nhất ");
	    for (Book book : listPo) {
	        Row row = sheet.createRow(rowNum++);
	        Cell cell1 = row.createCell(0);
	        cell1.setCellValue(book.getBId());
	        Cell cell2 = row.createCell(1);
	        cell2.setCellValue(book.getBName());
	        Cell cell3 = row.createCell(2);
	        cell3.setCellValue(book.getBPrice());
	        Cell cell4 = row.createCell(3);
	        cell3.setCellValue(book.getBPriceSale());
	      }
	  try { 
		  FileOutputStream outputStream = new FileOutputStream("C:\\FinalProjectWeb\\Top10SanPham.xlsx");
		     workbook.write(outputStream);
		     workbook.close();
		     request.setAttribute("mess", "Đã xuất file");
			 request.getRequestDispatcher("top10SanPham").forward(request, response);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}


}
