<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="menu.jsp"></jsp:include>
<jsp:include page="CartAndCheckout.jsp"></jsp:include>
<div class="container bootstrap snippets bootdey"
	style="margin-top: 25px; font-size: 20px;">
	<h1 class="text-primary">Edit Profile</h1>
	<p>${mess}</p>
	<hr>
	<div class="row">
		<div class="col-md-12 personal-info">
			<h3>Personal info</h3>
			<c:url value="EditProfile" var="edit"></c:url>
			<form class="form-signin d-flex" action="EditProfile" method="Get"
				enctype="multipart/form-data">
				<div class="col-md-3">
					<div class="text-center">
						<c:url value="${sessionScope.acc.uImage }" var="imgUrl"></c:url>
						<c:choose>
							<c:when test="${sessionScope.acc.uImage == null }">
								<img
									src="https://images.pexels.com/photos/3183187/pexels-photo-3183187.jpeg?auto=compress&cs=tinysrgb&w=600"
									class="avatar img-circle img-thumbnail" alt="avatar"
									style="width: 200px; height: 200px; border-radius: 50%;">
							</c:when>
							<c:otherwise>
								<img src="${imgUrl}" class="avatar img-circle img-thumbnail"
									alt="avatar"
									style="width: 200px; height: 200px; border-radius: 50%;">
							</c:otherwise>
						</c:choose>
						<h6>Ảnh đại diện</h6>

						<input type="text" class="form-control" name="images"
							style="height: 40px; font-size: 15px;"
							value="${sessionScope.acc.uImage}">
					</div>
				</div>
				<div class="col-md-9">
					<div class="form-group">
						<input name="id" value="${sessionScope.acc.uID}" hidden="">
						<label class="col-lg-3 control-label">UTK:</label>
						<c:if test="${mess==null }">
						<label class=" control-label " style=" color: red;">Vui lòng nhập thông tin</label>
						</c:if>
						<c:if test="${mess!=null }">
						<label class=" control-label " style=" color: red;">${mess}</label>
						</c:if>
						<div class="col-lg-8">
							<input name="user" type="text" id="username" class="form-control"
								 required="" autofocus="" placeholder="${sessionScope.acc.uTK}"
								style="height: 45px; font-size: 15px; text-transform: none">
						</div>
					</div>
					<div class="form-group">
						<label class="col-lg-3 control-label">Password:</label>
						<div class="col-lg-8">
							<input name="pass" type="password" id="password"
								class="form-control" placeholder="........."
								required="" autofocus=""
								style="height: 45px; font-size: 15px; text-transform: none">
						</div>
					</div>
					<div class="form-group">
						<label class="col-lg-3 control-label">Email:</label>
						<div class="col-lg-8">
							<input name="email" type="text" id="email" class="form-control"
								required="" autofocus="" placeholder="${sessionScope.acc.email}"
								style="height: 45px; font-size: 15px; text-transform: none">
						</div>
					</div>
					<div class="form-group">
						
							<c:if test="${mess ==null }">
						<button
							style="font-size: 14px; color: #ffffff; background: green; font-weight: 700; border: none; text-transform: uppercase; display: inline-block; padding: 10px 20px; border-radius: 5px;"
							type="submit">Edit</button>
						</c:if>
						<button class=""
							style="font-size: 14px; color: #ffffff; background: red; font-weight: 700; border: none; text-transform: uppercase; display: inline-block; padding: 10px 20px; border-radius: 5px;"
							type="submit">
							<a href="logout" class="text-white">Đăng xuất</a>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<hr>
<jsp:include page="Footer.jsp"></jsp:include>
