<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Main layout-->
<header>
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta http-equiv="x-ua-compatible" content="ie=edge">
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ------>
	<link
		href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
		rel="stylesheet"
		integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
		crossorigin="anonymous">
	<link href="css/StyleAdmin" rel="stylesheet" type="text/css" />
	<!-- Font Awesome -->
	<link rel="stylesheet"
		href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
		integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
		crossorigin="anonymous" referrerpolicy="no-referrer" />
	<!-- Bootstrap core CSS -->
	<link rel="stylesheet"
		href="https://mdbootstrap.com/previews/ecommerce-demo/css/bootstrap.min.css">
	<!-- Material Design Bootstrap -->
	<link rel="stylesheet"
		href="https://mdbootstrap.com/previews/ecommerce-demo/css/mdb-pro.min.css">
	<!-- Material Design Bootstrap Ecommerce -->
	<link rel="stylesheet"
		href="https://mdbootstrap.com/previews/ecommerce-demo/css/mdb.ecommerce.min.css">
	<!-- Your custom styles (optional) -->
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ------>
	<link
		href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
		rel="stylesheet"
		integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
		crossorigin="anonymous">
	<link href="css/style.css" rel="stylesheet" type="text/css" />
	<style>
body {
	margin: 0;
	padding: 0;
}
</style>
	<link rel="stylesheet" type="text/css"
		href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
	<link rel="stylesheet" type="text/css"
		href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&amp;display=swap">
	<link rel="stylesheet" type="text/css"
		href="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/mdb5/3.8.1/compiled.min.css">
	<link rel="stylesheet" type="text/css"
		href="https://mdbootstrap.com/wp-content/themes/mdbootstrap4/css/mdb-plugins-gathered.min.css">
	<style>
body {
	background-color: #fbfbfb;
}

@media ( min-width : 991.98px) {
	main {
		padding-left: 240px;
	}
}

/* Sidebar */
.sidebar {
	position: fixed;
	top: 0;
	bottom: 0;
	left: 0;
	padding: 58px 0 0; /* Height of navbar */
	box-shadow: 0 2px 5px 0 rgb(0 0 0/ 5%), 0 2px 10px 0 rgb(0 0 0/ 5%);
	width: 240px;
	z-index: 600;
}

@media ( max-width : 991.98px) {
	.sidebar {
		width: 100%;
	}
}

.sidebar .active {
	border-radius: 5px;
	box-shadow: 0 2px 5px 0 rgb(0 0 0/ 16%), 0 2px 10px 0 rgb(0 0 0/ 12%);
}

.sidebar-sticky {
	position: relative;
	top: 0;
	height: calc(100vh - 48px);
	padding-top: 0.5rem;
	overflow-x: hidden;
	overflow-y: auto;
	/* Scrollable contents if viewport is shorter than content. */
}
</style>
	<jsp:include page="Admin.jsp"></jsp:include>
</header>
<main>
	<div class="container pt-4"></div>


</main>

<!-- Edit Modal HTML -->
<div id="Edit" class=" ">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="EditUser" method="post">
				<div class="modal-header">
					<h4 class="modal-title">Edit Product</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
				<div class="form-group">
						<label>ID</label> <input value="${detail.uID}" name="id" type="text"
							class="form-control "  readonly required>
					</div>
					<div class="form-group">
						<label>Name</label> <input value="${detail.uName}" name="name" type="text"
							class="form-control" required>
					</div>
					
					<div class="form-group">
						<label>Email</label> <input value="${detail.email}" name="email" type="text"
							class="form-control" required>
					</div>
						<div class="form-group">
						<label>Image (Link)</label> <input value="${detail.uImage}" name=" image " type="text"
							class="form-control" required>
					</div>
					
					<div class="form-group">
						<label>Phone</label> <input value="${detail.uPhone}" name="phone" type="text"
							class="form-control" required>
					</div>
					<div class="form-group">
						<label>Mật khẩu</label> <input value="${detail.uPass}" name="pass" type="text"
							class="form-control" required>
					</div>
					<div class="form-group">
						<label>Tài khoản</label> <input value="${detail.uTK}" name="username" type="text"
							class="form-control" required>
					</div>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal"
						value="Cancel">
					<input type="submit"
						class="btn btn-success" value="Edit">
				</div>
			</form>
		</div>
	</div>
</div>


