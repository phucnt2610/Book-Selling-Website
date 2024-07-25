<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="description" content="Male_Fashion Template" />
<meta name="keywords" content="Male_Fashion, unica, creative, html" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>MY SHOP</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet" />

<!-- FONT AWNSOME  -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
	integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<!-- linearicons -->
<link rel="stylesheet"
	href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css" />

<!-- LINK BOOTSTRAP  -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<!-- Css Styles -->
<link rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>



	<section class="breadcrumb-option">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb__text">
						<h4>Check Out</h4>
						<div class="breadcrumb__links">
							<a href="./index.jsp">Home</a> <a href="./shop.jsp">Shop</a> <span>Check
								Out</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="checkout">
		<div class="container">
			<div class="checkout__form">
				<form action="AddOrder">
					<div class="row">
						<div class="col-lg-8 col-md-6">
							<h6 class="checkout__title">Billing Details</h6>

							<div class="checkout__input">
								<p>
									Name<span>*</span>
								</p>
								<input type="text" name="name" />
							</div>
							<div class="checkout__input">
								<p>
									Total<span>*</span>
								</p>
								<input type="text" name="total" readonly
									value="${sessionScope.cart.totalPriceSale()}" />
							</div>


							<div class="checkout__input">
								<p>
									Country<span>*</span>
								</p>
								<input type="text" name="country" />
							</div>
							<div class="checkout__input">
								<p>
									Address<span>*</span>
								</p>
								<input type="text" placeholder="Address" name="address"
									class="checkout__input__add" />
							</div>
							<div class="checkout__input">
								<p>
									Postcode / ZIP<span>*</span>
								</p>
								<input type="text" name="postcode" />
							</div>
							<div class="row">
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Phone<span>*</span>
										</p>
										<input type="text" name="phone" />
									</div>
								</div>
								<div class="col-lg-6">
									<div class="checkout__input">
										<p>
											Email<span>*</span>
										</p>
										<input type="text" name="email" />
									</div>
								</div>
							</div>

							<div class="checkout__input__checkbox">
								<a href="login" style="font-size: 16px;"> Create an account?
									<span class="checkmark"></span>
								</a>
							</div>

							<div class="checkout__input">
								<p>
									Order notes<span>*</span>
								</p>
								<input type="text" name="note"
									placeholder="Notes about your order, e.g. special notes for delivery." />
							</div>
							<div class="header-cart-buttons flex-w w-full"></div>
						</div>
						<div class="col-lg-4 col-md-6">
							<div class="checkout__order">
								<h4 class="order__title">Your order</h4>
								<div class="checkout__order__products">
									Product <span>Total</span> <span style="margin-right: 73px;">Quantity</span>

								</div>
								<ul class="checkout__total__products">
									<c:forEach items="${sessionScope.cart.items}" var="o">
										<li><img src="${o.book.BImage}"
											style="height: auto; width: 25%;"> <span>$
												${o.book.BPriceSale }</span> <span style="margin-right: 65px;">${o.quantity}</span>
										</li>
									</c:forEach>
								</ul>
								<ul class="checkout__total__all">
									<li>Giá <span>${sessionScope.cart.totalPrice()} $</span>

									</li>
									<li>Giá khuyến mãi <span>${sessionScope.cart.totalPriceSale()}
											$</span></li>
								</ul>
								<button type="submit" class="site-btn">PLACE ORDER</button>

							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>


	<jsp:include page="Footer.jsp"></jsp:include>

	<a href="#" class="scrool-top"> <img src="img/scroll-img-min.png"
		alt="" />
	</a>

	<!-- JS  -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>
