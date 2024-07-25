<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="menu.jsp"></jsp:include>
<jsp:include page="CartAndCheckout.jsp"></jsp:include>
<section class="home" id="home">
	<div class="slide-container active">
		<div class="slide" style="background-color: #F3F3F1;">
			<div class="content">
				<span>Breckenridge Carnegie</span>
				<h3>ĐẮC NHÂN TÂM</h3>
				<p>
					Trong cuộc sống, tôi tin chắc một điều rằng ai trong số chúng ta
					đều có một mong muốn rằng, tất cả mọi người đều sẽ luôn vui vẻ,
					thiện chí sẵn lòng giúp đỡ chúng ta điều gì đó không chỉ trong công
					việc, nó còn bao gồm cả tròng đời sống cá nhân... <a
						style="color: #666666; text-decoration: solid;"
						href="blogDetail?Blogid=2">Read more</a>
				</p>
				<a href="add-cart?BId=2" class="primary-btn">add to cart</a>
			</div>
			<div class="image">
				<img src="./img/DacNhanTam.webp" class="text"
					style="width: 500px; height: 500px;" alt="" />
			</div>
		</div>
	</div>
	<div class="slide-container">
		<div class="slide">
			<div class="content">
				<span>Daniel Kehlmann </span>
				<h3>tư duy nhanh và chậm</h3>
				<p>
					Luôn luôn có một vở kịch hấp dẫn diễn ra trong tâm trí của chúng
					ta, với sự tham gia của hai diễn viên chính cùng nhiều kịch tính và
					cao trào. H ai nhân vật này là hệ thống 1 bản năng, tự động, cảm
					tính và hệ thống 2 chín chắn, chậm rãi, toan tính. Khi đương đầu
					với nhau, sự tương tác của hai hệ thống này quyết định cách chúng
					ta nghĩ, đưa ra các phán xét, quyết định và hành động... <a
						style="color: #666666; text-decoration: solid;"
						href="blogDetail?Blogid=3">Read more</a>
				</p>
				<a href="add-cart?BId=3" class="primary-btn">add to cart</a>
			</div>
			<div class="image">
				<img src="./img/TuDuyNhanhCham.png" class="text" alt=""
					style="width: 500px; height: 500px;" />
			</div>
		</div>
	</div>
	<div class="slide-container">
		<div class="slide">
			<div class="content">
				<span>Napoleon Hill</span>
				<h3>Để Thế Giới Biết Bạn Là Ai</h3>
				<p>
					Được Xem Là Người Khai Sinh Ra Bộ Môn Khoa Học Về Thành Công,
					Napoleon Hill Đã Dành Gần Như Trọn Đời Để Phân Tích, Nghiên Cứu,
					Xây Dựng Và Giảng Dạy Những Triết Lý, Nguyên Tắc Cốt Lõi, Nền Tảng
					Nhất Có Thể Đưa Một Người Đến Cái Đích Thành Công. Trải Qua Khảo
					Nghiệm hời Gian Gần Một Thế Kỷ, Những Triết Lý Thành Công Của Hill
					Đã Chứng Tỏ Giá Trị Bền Vững Và Đúng Đắn Qua Nhiều Biến Đổi Xã Hội.
					“Để Thế Giới Biết Bạn Là Ai.... <a
						style="color: #666666; text-decoration: solid;"
						href="blogDetail?Blogid=7">Read more</a>
				</p>
				<a href="add-cart?BId=7" class="primary-btn">add to cart</a>
			</div>
			<div class="image">
				<img src="./img/DeTheGioiBietBanLaAi.jpg" class="text" alt=""
					style="width: 500px; height: 600px;" />
			</div>
		</div>
	</div>
	<div id="prev" class="fas fa-chevron-left" onclick="prev()"></div>
	<div id="next" class="fas fa-chevron-right" onclick="next()"></div>
</section>

<section class="features section_gap">
	<div class="container">
		<div class="row features-inner">
			<!-- single features -->
			<div class="col-lg-3 col-md-6 col-sm-6">
				<div class="single-features">
					<div class="f-icon">
						<img src="img/features/f-icon1.png" alt="" />
					</div>
					<h6>Free Delivery</h6>
					<p>Free Shipping on all order</p>
				</div>
			</div>
			<!-- single features -->
			<div class="col-lg-3 col-md-6 col-sm-6">
				<div class="single-features">
					<div class="f-icon">
						<img src="img/features/f-icon2.png" alt="" />
					</div>
					<h6>Return Policy</h6>
					<p>Free Shipping on all order</p>
				</div>
			</div>
			<!-- single features -->
			<div class="col-lg-3 col-md-6 col-sm-6">
				<div class="single-features">
					<div class="f-icon">
						<img src="img/features/f-icon3.png" alt="" />
					</div>
					<h6>24/7 Support</h6>
					<p>Free Shipping on all order</p>
				</div>
			</div>
			<!-- single features -->
			<div class="col-lg-3 col-md-6 col-sm-6">
				<div class="single-features">
					<div class="f-icon">
						<img src="img/features/f-icon4.png" alt="" />
					</div>
					<h6>Secure Payment</h6>
					<p>Free Shipping on all order</p>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="category-area">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-lg-8 col-md-12">
				<div class="row">
					<div class="col-lg-8 col-md-8">
						<div class="single-deal">
							<div class="overlay"></div>
							<img class="img-fluid w-100" style="height: auto !important;"
								src="img/category/Libary.jpg" alt="" /> <a
								href="shop" class="img-pop-up" target="_blank">
								<div class="deal-details">
									<h6 class="deal-title">Books of all genres</h6>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4 col-md-4">
						<div class="single-deal">
							<div class="overlay"></div>
							<img class="img-fluid w-100" style="height: 191px;"
								src="img/category/Libary2.jpg" alt="" /> <a
								href="shop" class="img-pop-up" target="_blank">
								<div class="deal-details">
									<h6 class="deal-title">Thrillers & Horror</h6>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4 col-md-4">
						<div class="single-deal">
							<div class="overlay"></div>
							<img class="img-fluid w-100" style="height: 213px;"
								src="img/category/Libary3.jpg" alt="" /> <a
								href="shop" class="img-pop-up" target="_blank">
								<div class="deal-details">
									<h6 class="deal-title">Self-help</h6>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-8 col-md-8">
						<div class="single-deal">
							<div class="overlay"></div>
							<img class="img-fluid w-100" style="height: 213px;"
								src="img/category/Libary4.jpg" alt="" /> <a
								href="shop" class="img-pop-up" target="_blank">
								<div class="deal-details">
									<h6 class="deal-title">Books of Biography, Autobiography
										and Memoirs</h6>
								</div>
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6">
				<div class="single-deal">
					<div class="overlay"></div>
					<img class="img-fluid w-100" src="img/category/c5.jpg" alt="" /> <a
						href="shop" class="img-pop-up" target="_blank">
						<div class="deal-details">
							<h6 class="deal-title">For Black Friday</h6>
						</div>
					</a>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="product " id="Trend">
	<div class="container" id="w">
		<!-- Tab items -->
		<div class="tabs d-flex justify-content-center">
			<div class="tab-item active">Best Seller</div>
			<div class="tab-item">New Arrivals</div>
			<div class="tab-item">Hot Sales</div>
			<div class="tab-item">Popular</div>
			<div class="line"></div>
		</div>
		<!-- Tab content -->
		<div class="tab-content">
			<div class="tab-pane active">
				<div class="row">
					<!-- single product -->
					<c:forEach items="${listB}" var="o">
						<div class="col-lg-3 col-md-6">
							<div class="single-product">
								<a href="detail?Bid=${o.BId}"><img
									class="img-fluid" src="${o.BImage}" alt="" /></a>
								<div class="product-details">
									<h6>${o.BName}</h6>
									<div class="price">
										<h6>${o.BPriceSale}VNĐ</h6>
										<h6 class="l-through">${o.BPrice }VNĐ</h6>
									</div>
									<div class="prd-bottom">
										<a href="add-cart?BId=${o.BId}" class="social-info"> <span class="lnr lnr-cart"></span>
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
			<div class="tab-pane">
				<div class="row">
					<!-- single product -->
					<c:forEach items="${listN}" var="o">
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
										<a href="add-cart?BId=${o.BId}" class="social-info"> <span class="lnr lnr-cart"></span>
											<p class="hover-text">add to bag</p>
										</a> <a href="" class="social-info"> <span
											class="lnr lnr-heart"></span>
											<p class="hover-text">Wishlist</p>
										</a> <a href="shopping_detail.html" class="social-info"> <span
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
			<div class="tab-pane">
				<div class="row">
					<!-- single product -->
					<c:forEach items="${listH}" var="o">
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
										<a href="add-cart?BId=${o.BId}" class="social-info"> <span class="lnr lnr-cart"></span>
											<p class="hover-text">add to bag</p>
										</a> <a href="" class="social-info"> <span
											class="lnr lnr-heart"></span>
											<p class="hover-text">Wishlist</p>
										</a> <a href="shopping_detail.html" class="social-info"> <span
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
			<div class="tab-pane">
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
										<a href="add-cart?BId=${o.BId}" class="social-info"> <span class="lnr lnr-cart"></span>
											<p class="hover-text">add to bag</p>
										</a> <a href="" class="social-info"> <span
											class="lnr lnr-heart"></span>
											<p class="hover-text">Wishlist</p>
										</a> <a href="shopping_detail.html" class="social-info"> <span
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

<section class="discount">
	<div class="container">
		<div class="row">
			<div id="sale" class="col-lg-6 p-0">
				<div class="discount__pic">
					<img src="img/category/sale.jpeg" alt="" />
				</div>
			</div>
			<div class="col-lg-6 p-0">
				<div class="discount__text">
					<div class="discount__text__title">
						<span>Discount</span>
						<h2>Summer 2022</h2>
						<h5>
							<span>Sale</span> 50%
						</h5>
					</div>
					<div class="discount__countdown" id="countdown-time">
						<div class="countdown__item">
							<span id="days">20</span>
							<p>Days</p>
						</div>
						<div class="countdown__item">
							<span id="hours">18</span>
							<p>Hour</p>
						</div>
						<div class="countdown__item">
							<span id="mitunes">46</span>
							<p>Min</p>
						</div>
						<div class="countdown__item">
							<span id="seconds">05</span>
							<p>Sec</p>
						</div>
					</div>
					<a href="shop">Shop now</a>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="latest">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="section-title">
					<span>Latest News</span>
					<h2>Review</h2>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="blog__item">
					<div class="blog__item__pic"
						style="background-image: url('img/blog/details/Napoleon.jpg')"></div>
					<div class="blog__item__text">
						<span><img src="img/icon/calendar.png"
							alt="" /> 16 October 2022</span>
						<h5>ĐỂ CHO THẾ GIỚI BIẾT BẠN LÀ AI</h5>
						<a href="blogDetail?Blogid=7">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="blog__item">
					<div class="blog__item__pic"
						style="background-image: url('img/blog/details/Dale\ Breackenridge.jpg')"></div>
					<div class="blog__item__text">
						<span><img src="img/icon/calendar.png"
							alt="" /> 16 October 2022</span>
						<h5>ĐẮC NHÂN TÂM</h5>
						<a href="blogDetail?Blogid=2">Read More</a>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="blog__item">
					<div class="blog__item__pic"
						style="background-image: url('img/blog/details/Daniel.jpg')"></div>
					<div class="blog__item__text">
						<span><img src="img/icon/calendar.png"
							alt="" /> 21 October 2022</span>
						<h5>TƯ DUY NHANH VÀ CHẬM</h5>
						<a href="blogDetail?Blogid=7">Read More</a>
					</div>
				</div>
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
