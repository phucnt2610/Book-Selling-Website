<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="menu.jsp"></jsp:include>
<jsp:include page="CartAndCheckout.jsp"></jsp:include>

<!-- Product section-->
<section class="py-5">
	<div class="container px-4 px-lg-5 my-5">
		<div class="row gx-4 gx-lg-5 align-items-center bg-light p-4">
			<div class="col-md-6">
				<img class="card-img-top mb-5 mb-md-0" src="${detail.BImage}"
					alt="..." />
			</div>
			<div class="col-md-6">
				<div class="product__details__text">
					<h4>${detail.BName}</h4>
					<div class="rating">
						<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star"></i> <i class="fa fa-star"></i> <i
							class="fa fa-star-o"></i> <span> - 5 Reviews</span>
					</div>
					<h3>${detail.BPriceSale}
						VNĐ <span>${detail.BPrice} VNĐ</span>
					</h3>
					<div class="product__details__option"></div>
					<form action="add-cart" method="get">
						<div class="product__details__cart__option">
							<div class="quantity">
								<div class="pro-qty">
									<input name="BId" type="hidden"
										value="${detail.BId}"/>
									<input name="quantity" type="number" value="1" />
								</div>
							</div>
							<button type="submit" class="btn primary-btn">add to cart</button>
						</div>
					</form>

					<div class="product__details__btns__option">
						<a href="#"><i class="fa fa-heart"></i> add to wishlist</a> <a
							href="#"><i class="fa fa-exchange"></i> Add To Compare</a>
					</div>
					<div class="product__details__last__option">
						<h5>
							<span>Guaranteed Safe Checkout</span>
						</h5>
						<img src="img/details-payment.png" alt="" />

					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="product__details__tab">
					<ul class="nav nav-tabs text-center" role="tablist">
						<li class="nav-item"><a class="nav-link active"
							data-toggle="tab" href="#tabs-5" role="tab">Description</a></li>
						<li class="nav-item"><a class="nav-link" data-toggle="tab"
							href="#tabs-6" role="tab">Customer Previews(5)</a></li>
						<li class="nav-item"><a class="nav-link" data-toggle="tab"
							href="#tabs-7" role="tab">Additional information</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="tabs-5" role="tabpanel">
							<div class="product__details__tab__content">
								<p class="note">Nam tempus turpis at metus scelerisque
									placerat nulla deumantos solicitud felis. Pellentesque diam
									dolor, elementum etos lobortis des mollis ut risus. Sedcus
									faucibus an sullamcorper mattis drostique des commodo pharetras
									loremos.</p>
								<div class="product__details__tab__content__item">
									<h5>Products Infomation</h5>
									<p>A Pocket PC is a handheld computer, which features many
										of the same capabilities as a modern PC. These handy little
										devices allow individuals to retrieve and store e-mail
										messages, create a contact file, coordinate appointments, surf
										the internet, exchange text messages and more. Every product
										that is labeled as a Pocket PC must be accompanied with
										specific software to operate the unit and must feature a
										touchscreen and touchpad.</p>
									<p>As is the case with any new technology product, the cost
										of a Pocket PC was substantial during it’s early release. For
										approximately $700.00, consumers could purchase one of
										top-of-the-line Pocket PCs in 2003. These days, customers are
										finding that prices have become much more reasonable now that
										the newness is wearing off. For approximately $350.00, a new
										Pocket PC can now be purchased.</p>
								</div>
								<div class="product__details__tab__content__item">
									<h5>Material used</h5>
									<p>Polyester is deemed lower quality due to its none
										natural quality’s. Made from synthetic materials, not natural
										like wool. Polyester suits become creased easily and are known
										for not being breathable. Polyester suits tend to have a shine
										to them compared to wool and cotton suits, this can make the
										suit look cheap. The texture of velvet is luxurious and
										breathable. Velvet is a great choice for dinner party jacket
										and can be worn all year round.</p>
								</div>
							</div>
						</div>
						<div class="tab-pane" id="tabs-6" role="tabpanel">
							<div class="product__details__tab__content">
								<div class="product__details__tab__content__item">
									<h5>Products Infomation</h5>
									<p>A Pocket PC is a handheld computer, which features many
										of the same capabilities as a modern PC. These handy little
										devices allow individuals to retrieve and store e-mail
										messages, create a contact file, coordinate appointments, surf
										the internet, exchange text messages and more. Every product
										that is labeled as a Pocket PC must be accompanied with
										specific software to operate the unit and must feature a
										touchscreen and touchpad.</p>
									<p>As is the case with any new technology product, the cost
										of a Pocket PC was substantial during it’s early release. For
										approximately $700.00, consumers could purchase one of
										top-of-the-line Pocket PCs in 2003. These days, customers are
										finding that prices have become much more reasonable now that
										the newness is wearing off. For approximately $350.00, a new
										Pocket PC can now be purchased.</p>
								</div>
								<div class="product__details__tab__content__item">
									<h5>Material used</h5>
									<p>Polyester is deemed lower quality due to its none
										natural quality’s. Made from synthetic materials, not natural
										like wool. Polyester suits become creased easily and are known
										for not being breathable. Polyester suits tend to have a shine
										to them compared to wool and cotton suits, this can make the
										suit look cheap. The texture of velvet is luxurious and
										breathable. Velvet is a great choice for dinner party jacket
										and can be worn all year round.</p>
								</div>
							</div>
						</div>
						<div class="tab-pane" id="tabs-7" role="tabpanel">
							<div class="product__details__tab__content">
								<p class="note">Nam tempus turpis at metus scelerisque
									placerat nulla deumantos solicitud felis. Pellentesque diam
									dolor, elementum etos lobortis des mollis ut risus. Sedcus
									faucibus an sullamcorper mattis drostique des commodo pharetras
									loremos.</p>
								<div class="product__details__tab__content__item">
									<h5>Products Infomation</h5>
									<p>A Pocket PC is a handheld computer, which features many
										of the same capabilities as a modern PC. These handy little
										devices allow individuals to retrieve and store e-mail
										messages, create a contact file, coordinate appointments, surf
										the internet, exchange text messages and more. Every product
										that is labeled as a Pocket PC must be accompanied with
										specific software to operate the unit and must feature a
										touchscreen and touchpad.</p>
									<p>As is the case with any new technology product, the cost
										of a Pocket PC was substantial during it’s early release. For
										approximately $700.00, consumers could purchase one of
										top-of-the-line Pocket PCs in 2003. These days, customers are
										finding that prices have become much more reasonable now that
										the newness is wearing off. For approximately $350.00, a new
										Pocket PC can now be purchased.</p>
								</div>
								<div class="product__details__tab__content__item">
									<h5>Material used</h5>
									<p>Polyester is deemed lower quality due to its none
										natural quality’s. Made from synthetic materials, not natural
										like wool. Polyester suits become creased easily and are known
										for not being breathable. Polyester suits tend to have a shine
										to them compared to wool and cotton suits, this can make the
										suit look cheap. The texture of velvet is luxurious and
										breathable. Velvet is a great choice for dinner party jacket
										and can be worn all year round.</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>


<section class="related">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h3 class="related-title">Related Product</h3>
			</div>
			<div class="row">
				<!-- single product -->
				<c:forEach items="${listPo}" var="o">
					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<a href="shopping_detail.html"><img
								class="img-fluid" src="${o.BImage}" alt="" /></a>
							<div class="product-details">
								<h6>${o.BName}</h6>
								<div class="price">
									<h6>${o.BPriceSale}VNĐ</h6>
									<h6 class="l-through">${o.BPrice }VNĐ</h6>
								</div>
								<div class="prd-bottom">
									<a href="" class="social-info"> <span class="lnr lnr-cart"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href="" class="social-info"> <span
										class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href="detail?Bid=${o.BId}" class="social-info"> <span
										class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>

					</div>
				</c:forEach>
			</div>
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
