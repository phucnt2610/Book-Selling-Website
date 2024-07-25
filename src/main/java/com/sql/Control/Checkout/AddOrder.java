package com.sql.Control.Checkout;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sql.Dao.DAO;
import com.sql.Email.SendMailConfirm;
import com.sql.Model.Cart;
import com.sql.Model.CartItem;

/**
 * Servlet implementation class AddOrder
 */
@WebServlet("/AddOrder")
public class AddOrder extends HttpServlet {
	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		DAO dao = new DAO();
		try {
			String name = request.getParameter("name");
			String total = request.getParameter("total");
			String country = request.getParameter("country");
			String address = request.getParameter("address");
			String postcode = request.getParameter("postcode");
			String phone = request.getParameter("phone");
			String email = request.getParameter("email");
			String note = request.getParameter("note");
			int totalP= Integer.parseInt(total);
			List<CartItem> items = cart.getItems();
			StringBuilder content = new StringBuilder();
			content.append("Dear ").append(name).append("\n");
			content.append("Bạn vừa đặt hàng từ Shop Ngọc Hải. \n ");
			content.append("Địa chỉ nhận hàng của bạn là: ").append(address).append("\n");
			content.append("Số điện thoại khi nhận hàng của bạn là ").append(phone).append("\n");
			content.append("Các sản phẩm bạn đặt bao gồm: \n");
			for (CartItem c : items) {
				
						content.append(c.getBook().getBName()).append(" | ").append("Giá:").append(c.getBook().getBPriceSale()).append("$")
								.append(" | ").append("Số lượng:").append(c.getQuantity()).append(" | ")
								.append("\n");
					}
			content.append("Tổng tiền: ").append(String.format("%d", cart.totalPriceSale())).append(" VNĐ").append("\n");
			content.append("Nếu đơn hàng có sai sót xin vui lòng liên hệ số điện thoại 0814069391 \n");
			content.append("Cảm ơn bạn đã đặt hàng tại Ngọc Hải Store \n");
			content.append("Chủ cửa hàng ");
			SendMailConfirm.sendMailToEmail(email,name,content.toString());
			for (CartItem c : items) {
				dao.InsertOrderItem(c.getBook().getBId(), c.getQuantity(), c.getBook().getBPriceSale());
				}
			if(cart.getuId() == 0)
			{
				dao.InsertCart(16, getCurrentDate());
			}
			else
			{
				dao.InsertCart(cart.getuId(), getCurrentDate());
			}
			for (CartItem c : items) {
				dao.InsertCartItem(c.getBook().getBId(), c.getBook().getBPriceSale(), c.getcId(), c.getQuantity());
			}
			dao.InsertOrder(name, country, address, postcode, phone, email, totalP, note);
			session.removeAttribute("cart");
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("checkout.jsp").forward(request, response);
	}
}
