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
<!-- CSS only -->

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

<!-- Css Blog -->
<link rel="stylesheet" href="./css/Blog.css">
</head>
<header class="header">
	<div class="container">
		<div class="row">
			<div class="col-lg-3 col-md-3">
				<div class="header__logo" style="float: right; padding: 13px 0 0 0;">
					<a href="index"> <img src="./img/logo.png" alt=""
						style="height: 70px;" />
					</a>
				</div>
			</div>
			<div class="navbar col-lg-6 col-md-6">
				<nav class="header__menu mobile-menu">
					<ul>
						<li class="itemHeader"><a href="index">Home</a></li>
						<li class="itemHeader "><a href="shop">Shop</a></li>
						<li><a href="About">Pages</a></li>
						<li class="itemHeader"><a href="Blog">Blog</a></li>
						<c:if test="${sessionScope.acc.isAdmin == 1}">
							<li class="itemHeader"><a href="ManagerBook">Manager</a></li>
						</c:if>
						<c:if test="${sessionScope.acc.isUser == 1}">
							<li class="itemHeader"><a href="./contact.jsp">Contacts</a></li>
						</c:if>
					</ul>
				</nav>
			</div>
			<div class="col-lg-3 col-md-3">
				<div class="header__nav__option">
					<div class="search">

						<form action="search" method="post">
							<input name="txt" placeholder="Enter..." class="inputSearch" />
							<button type="submit">
								<i class="fa-solid fa-magnifying-glass inputIcon"></i> <span
									class="icon_search"></span>
							</button>
						</form>

					</div>
					<a class="search-switch"> <i
						class="fa-solid fa-magnifying-glass"></i>
					</a>
					<c:if test="${sessionScope.acc eq null}">

						<a href="login"><i class="fa-solid fa-user"></i></a>
					</c:if>
					<c:if test="${sessionScope.acc ne null}">
						<a href=Profile.jsp><i class="fa-solid fa-right-from-bracket"></i>
							<b class="AccountName"> ${sessionScope.acc.uName}</b> </a>
					</c:if>
					<a href="#"><i class="fa-solid fa-heart"></i></a> <a href="#"
						class="js-show-cart "> <i class="fa-solid fa-cart-shopping">

					</i> <span
						class=" top-0 start-100 translate-middle badge rounded-pill bg-danger"
						style="left: 15px !important; top: -9px !important;">
							${sessionScope.cart.total()} <span class="visually-hidden"></span>
					</span>
					</a>
				</div>

			</div>
		</div>

		<div class="canvas__open">
			<i class="fa fa-bars"></i>
		</div>
	</div>
</header>
<div class="container rounded bg-white mt-5 mb-5">
	<div class="row">
		<div class="col-md-3 border-right">
			<div
				class="d-flex flex-column align-items-center text-center p-3 py-5">
				<img class="rounded-circle mt-5" width="150px"
					src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg"><span
					class="font-weight-bold">Edogaru</span><span class="text-black-50">edogaru@mail.com.my</span><span>
				</span>
			</div>
		</div>
		<div class="col-md-5 border-right">
			<c:if test="${error!=null }">
				<div class="alert alert-danger" role="alert">${error}</div>
			</c:if>
			<c:if test="${mess!=null }">
				<div class="alert alert-success" role="alert">${mess}</div>
			</c:if>
			<div class="p-3 py-5">
				<div class="d-flex justify-content-between align-items-center mb-3">
					<h4 class="text-right">New Post</h4>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Title</label><input type="text"
							class="form-control" placeholder="Tiêu đề" name="Title" value="">
					</div>
				</div>
				<div class="row mt-65">
					<div class="col-md-12">
					<label class="labels">ID Sách </label>
					
						<select name="BId" class="form-select"
							aria-label="Default select example">
							<c:forEach items="${listBook}" var="o">
								<option value="${o.BId}">ID =  ${o.BName}</option>
							</c:forEach>
							</select>
					</div>
				</div>
				<div class="row mt-65">
					<div class="col-md-12">
					<label class="labels">Tên sách </label>
					
						<select name="Name" class="form-select"
							aria-label="Default select example">
							<c:forEach items="${listBook}" var="o">
								<option value="${o.BName}">${o.BName}</option>
							</c:forEach>
							</select>
					</div>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Blog Image</label><input type="text"
							class="form-control" placeholder="Hình ảnh" name="BlogImage"
							value="">
					</div>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Blog Content</label><input type="text"
							style="height: 212px;" class="form-control"
							placeholder="Nội dung" name="BlogCon1" value="">
					</div>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Blog Content</label><input type="text"
							style="height: 212px;" class="form-control"
							placeholder="Nội dung" name="BlogCon2" value="">
					</div>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Blog Content</label><input type="text"
							style="height: 212px;" class="form-control"
							placeholder="Nội dung" name="BlogCon3" value="">
					</div>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Quotes</label><input type="text"
							class="form-control" placeholder="Câu nói tâm đắc" name="Quotes"
							value="">
					</div>
				</div>


				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Author</label><input type="text"
							class="form-control" placeholder="Người viết" name="Author"
							value="">
					</div>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">Image Detail</label><input type="text"
							class="form-control" placeholder="Hình ảnh hiển thị chi tiết"
							name="ImageDetail" value="">
					</div>
				</div>
				<div class="row mt-6">
					<div class="col-md-12">
						<label class="labels">AuthorQuotes</label><input type="text"
							class="form-control" placeholder="Tác giả câu nói tâm đắc"
							name="AuthorQuotes" value="">
					</div>
				</div>
			</div>

			<div class="mt-5 text-center">
				<button class="btn btn-primary profile-button" type="submit">
					<a href="AddBlog" class="text-white"> Save Profile</a>
				</button>
			</div>
		</div>
	</div>
</div>
</div>
</div>
</div>
</div>

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
