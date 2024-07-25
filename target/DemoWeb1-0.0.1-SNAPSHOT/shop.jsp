<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="menu.jsp"></jsp:include>
<jsp:include page="CartAndCheckout.jsp"></jsp:include>
	<!-- Breadcrumb Section Begin -->
	<section class="breadcrumb-option">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb__text">
						<h4>Shop</h4>
						<div class="breadcrumb__links">
							<a href="./index.jsp">Home</a> <span>Shop</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Breadcrumb Section End -->

	<!-- Shop Section Begin -->
	<section class="shop">
		<div class="container">
			<div class="row">
				<div class="col-lg-3">
					<div class="shop__sidebar">
						<div class="shop__sidebar__search">
							<form action="search" method="post">
								<input name="txt" type="text" placeholder="Search..." />
								<button type="submit">
									<span class="icon_search"></span>
								</button>
							</form>
						</div>
						<div class="shop__sidebar__accordion">
							<div class="accordion" id="accordionExample">
								<div class="card">
									<div class="card-heading">
										<a data-toggle="collapse" data-target="#collapseOne">Author</a>
									</div>
									<div id="collapseOne" class="collapse show"
										data-parent="#accordionExample">
										<div class="card-body">
											<div class="shop__sidebar__categories">
												<ul class="nice-scroll">
													<c:forEach items="${listAu}" var="o">
														<li><a href="author?aid=${o.auId}">${o.auName}</a></li>
													</c:forEach>
												</ul>
											</div>
										</div>
									</div>
								</div>
								<div class="card">
									<div class="card-heading">
										<a data-toggle="collapse" data-target="#collapseTwo">Categories</a>
									</div>
									<div id="collapseTwo" class="collapse show"
										data-parent="#accordionExample">
										<div class="card-body">
											<div class="shop__sidebar__brand">
												<ul>
													<c:forEach items="${listC}" var="o">
														<li><a href="category?cid=${o.CId}">${o.CName}</a></li>
													</c:forEach>
												</ul>
											</div>
										</div>
									</div>
								</div>
								<div class="card">
									<div class="card-heading">
										<a data-toggle="collapse" data-target="#collapseThree">Filter
											Price</a>
									</div>
									<div id="collapseThree" class="collapse show"
										data-parent="#accordionExample">
										<div class="card-body">
											<div class="shop__sidebar__price">
												<ul>
													<li><a href="FilterPrice?filter_id=1">10000$ -
															50000$</a></li>
													<li><a href="FilterPrice?filter_id=2">50000$ -
															70000$</a></li>
													<li><a href="FilterPrice?filter_id=3">70000$ -
															100000$</a></li>
													<li><a href="FilterPrice?filter_id=4">100000$
															-200000$</a></li>
													<li><a href="FilterPrice?filter_id=5">200000$
															-300000$</a></li>
													<li><a href="FilterPrice?filter_id=6">300000$+</a></li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-9">
					<div class="shop__product__option">
						<div class="row">
							<div class="col-lg-6 col-md-6 col-sm-6">
								<div class="shop__product__option__left">
									<p>Showing 1–6 of ${totalBook} results</p>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<c:forEach items="${listP}" var="o">
							<div class="col-lg-4 col-md-6 col-sm-6">
								<div class="single-product">
									<a href="detail?Bid=${o.BId}"> <img
										style="height: 359px !important;" class="img-fluid"
										src="${o.BImage}" alt="" />
									</a>
									<div class="product-details">
										<h6>${o.BName}</h6>
										<div class="price">
											<h6>${o.BPriceSale}VNĐ</h6>
											<h6 class="l-through">${o.BPrice }</h6>
										</div>
										<div class="prd-bottom">
											<a href="add-cart?BId=${o.BId}" class="social-info"> <span
												class="lnr lnr-cart"></span>
												<p class="hover-text">add to bag</p>
											</a> <a href="" class="social-info"> <span
												class="lnr lnr-heart"></span>
												<p class="hover-text">Wishlist</p> <a
												href="detail?Bid=${o.BId}" class="social-info"> <span
													class="lnr lnr-move"></span>
													<p class="hover-text">view more</p>
											</a>
										</div>
									</div>
								</div>
							</div>

						</c:forEach>

					</div>
					<div class="row">
						<div class="col-lg-12">
							<div class="product__pagination">
								<c:forEach begin="1" end="${EndPage}" var="i">
									<a class="${tag==i?"
										active":"" }"
										 href="Paging?index=${i}"> ${i} </a>
								</c:forEach>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</section>
	<!-- Shop Section End -->

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
