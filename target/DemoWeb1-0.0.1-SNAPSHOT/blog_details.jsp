<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="menu.jsp"></jsp:include>
<jsp:include page="CartAndCheckout.jsp"></jsp:include>
<section class="blog-hero spad">
	<div class="container">
		<div class="row d-flex justify-content-center">
			<div class="col-lg-9 text-center">
				<div class="blog__hero__text">
					<h2>${blogDetail.title}</h2>
					<ul>
						<li>By ${blogDetail.author}</li>
						<li>February 21, 2019</li>
						<li>${totalCmt} Comments</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="blog-details spad">
	<div class="container">
		<div class="row d-flex justify-content-center">
			<div class="col-lg-12">
				<div class="blog__details__pic">
					<img src="${blogDetail.imageEmail}" alt="imageEmail" />
				</div>
			</div>
			<div class="col-lg-8">
				<div class="blog__details__content">
					<div class="blog__details__share">
						<span>share</span>
						<ul>
							<li><a href="#"><i class="fa-brands fa-facebook-f"></i></a>
							</li>
							<li><a href="#" class="twitter"><i
									class="fa-brands fa-twitter"></i></a></li>
							<li><a href="#" class="youtube"><i
									class="fa-brands fa-youtube"></i></a></li>
							<li><a href="#" class="linkedin"><i
									class="fa-brands fa-linkedin-in"></i></a></li>
						</ul>
					</div>
					<div class="blog__details__text">
						<p>${blogDetail.blogCon1 }</p>
						<p>${blogDetail.blogCon2}</p>
					</div>
					<div class="blog__details__quote">
						<i class="fa fa-quote-left"></i>
						<p>${blogDetail.quotes}</p>
						<h6>_ ${blogDetail.authorQuotes} _</h6>
					</div>
					<div class="blog__details__text">
						<p>${blogDetail.blogCon3}</p>
						<p></p>
					</div>
					<div class="blog__details__option">
						<div class="row">
							<div class="col-lg-6 col-md-6 col-sm-6">
								<c:if test="${sessionScope.acc ne null}">

									<div class="blog__details__author">
										<div class="blog__details__author__pic">
											<img src="${sessionScope.acc.uImage}" alt="" />
										</div>
										<div class="blog__details__author__text">
											<h5>${sessionScope.acc.uName}</h5>
										</div>
									</div>

								</c:if>
							</div>
						</div>
					</div>
					<div class="blog__details__comments">
						<h3 class="mb-5">${totalCmt} Comments</h3>
						<ul class="comment-list">
							<c:forEach items="${listCommnent}" var="o">
								<li class="comment">
									<div class="vcard bio">
										<c:url value="${sessionScope.acc.uImage }" var="imgUrl"></c:url>
										<c:choose>
											<c:when test="${sessionScope.acc.uImage == null }">
												<img class="blog__details__author__pic"
													src="https://mdbootstrap.com/img/Photos/Others/placeholder1.jpg"
												 alt="avatar"
													>
											</c:when>
											<c:otherwise>
												<img src="${imgUrl}" class="blog__details__author__pic"
													alt="avatar"
													>
											</c:otherwise>
										</c:choose>
									</div>
									<div class="comment-body">
										<h3>${o.name}</h3>
										<div class="meta" >${o.day}</div>
										<p>${o.content}</p>
									</div>
								</li>
							</c:forEach>
						</ul>






						<div class="blog__details__form">
							<h4>Leave A Comment</h4>
							<form action="Comment" method="get">
								<div class="row">
									<div class="col-lg-4 col-md-4">
										<input type="text" placeholder="Name" name="name" />
									</div>
									<div class="col-lg-4 col-md-4">
										<input type="text" placeholder="Email" name="email" />
									</div>
									<div class="col-lg-4 col-md-4">
										<input type="text" placeholder="Phone" name="phone" />
									</div>
									<div class="col-lg-12 text-center">
										<textarea placeholder="Comment" name="content"></textarea>
										<button type="submit" class="site-btn">Post Comment</button>
									</div>
								</div>
							</form>
						</div>
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


<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>
