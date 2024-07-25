<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="menu.jsp"></jsp:include>
<jsp:include page="CartAndCheckout.jsp"></jsp:include>

<!-- Map Begin -->
<div class="map">
	<iframe
		src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.484300945954!2d106.76973361471904!3d10.850721392271097!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752763f23816ab%3A0x282f711441b6916f!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBTxrAgcGjhuqFtIEvhu7kgdGh14bqtdCBUcC4gSOG7kyBDaMOtIE1pbmg!5e0!3m2!1svi!2s!4v1664013233596!5m2!1svi!2s"
		width="600" height="450" style="border: 0" allowfullscreen=""
		loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
</div>
<!-- Map End -->

<!-- Contact Section Begin -->
<section class="contact spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-6">
				<div class="contact__text">
					<div class="section-title">
						<span>Information</span>
						<h2>Contact Us</h2>
						<p>Hãy cho chúng tôi thêm về những thông tin mà bạn cần. Chúng
							tôi sẵn lòng phục vụ các bạn bất cứ lúc nào</p>
					</div>
					<ul>
						<li>
							<h4>CEO</h4>
							<p>
								Số 1, Võ Văn Ngân, Tp Thủ Đức <br />+0814069391

							</p>
							<p>Ngochai06122002@gmail.com</p>
						</li>
					</ul>
				</div>
			</div>
			<div class="col-lg-6 col-md-6">
				<div class="contact__form">
					<form action="SendMailControl" method="post">
						<div class="row">
							<div class="col-lg-6">
								<input name="Name" type="text" placeholder="Name" />
							</div>
							<div class="col-lg-6">
								<input name="Email" type="text" placeholder="Email" />
							</div>
							<div class="col-lg-12">
								<textarea name="Messeage" placeholder="Message"></textarea>
								<button type="submit" class="site-btn">Send Message</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Contact Section End -->

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
