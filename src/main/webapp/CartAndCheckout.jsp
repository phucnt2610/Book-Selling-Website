<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <div class="wrap-header-cart js-panel-cart">
		<div class="header-cart flex-col-l p-l-65 p-r-25">
			<div class="header-cart-title flex-w flex-sb-m p-b-8">
				<span class="mtext-103 cl2"> Your Cart </span>

				<div class="iconCart">
					<i class="fa-solid fa-xmark"></i>
				</div>
			</div>

			<div class="header-cart-content flex-w js-pscroll">
				<ul class="header-cart-wrapitem w-full">
				<c:forEach items="${items}" var="i">
					<li  style="margin-bottom: 50px;"  class="header-cart-item flex-w flex-t m-b-12">
						<div class="header-cart-item-img">
							<img src="${i.book.BImage}" alt="IMG" />
						</div>
						<div class="header-cart-item-txt p-t-8">
							<a href="#" class="header-cart-item-name m-b-18 hov-cl1 trans-04">
								${i.book.BName} </a> <span class="header-cart-item-info"> ${i.quantity} x ${i.book.BPriceSale } </span>
						</div>
					</li>
				</c:forEach>
				</ul>
				<div class="w-full totalCart">
					<div class="header-cart-total w-full p-tb-40">Total: ${sessionScope.cart.total()}</div>

					<div class="header-cart-buttons flex-w w-full">
						<a href="ShoppingCart" class="site-btn"> View Cart </a> <a
							href="checkout" class="site-btn"> Check Out </a>
					</div>
				</div>
			</div>
		</div>
	</div>
    