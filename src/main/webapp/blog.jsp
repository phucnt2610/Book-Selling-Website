<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <jsp:include page="menu.jsp"></jsp:include>

   <body>
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
					<li  style="margin-bottom: 50px;" class="header-cart-item flex-w flex-t m-b-12">
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

    <section
      class="breadcrumb-blog"
      style="background-image: url('./img/breadcrumb-bg.jpg')"
    >
      <div class="container">
        <div class="row">
          <div class="col-lg-12">
            <h2>Our Blog</h2>
          </div>
        </div>
      </div>
    </section>

    <section class="blog">
      <div class="container">
        <div class="row">
        <c:forEach items="${ListBlog}" var="o">
          <div class="col-lg-4 col-md-6 col-sm-6">
            <div class="blog__item">
              <div
                class="blog__item__pic set-bg"
                style="background-image: url('${o.blogImage}')"
              >
              </div>
              <div class="blog__item__text">
                <span
                  ><img src="img/icon/calendar.png" alt="" /> ${o.dayCreate}</span
                >
                <h5>${o.name}</h5>
                <a href="blogDetail?Blogid=${o.blogID}">Read More</a>
              </div>
            </div>
          </div>
           </c:forEach>
        </div>
      </div>
    </section>
    <div class="row">
						<div class="col-lg-12">
							<div class="product__pagination Paging_Blog" style="padding-bottom: 25px;">
									<c:forEach begin="1" end="${EndPage}" var="i">
										<a  class="${tag==i?"active":"" }"
										 href="PagingBlogControl?index=${i}"> ${i} </a>
									</c:forEach>
							</div>
						</div>
					</div>

  	<jsp:include page="Footer.jsp"></jsp:include>

    <a href="#" class="scrool-top">
      <img src="img/scroll-img-min.png" alt="" />
    </a>

    <!-- JS  -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
  </body>
</html>
    