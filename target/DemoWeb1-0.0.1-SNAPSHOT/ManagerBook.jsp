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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
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
	<div class="container pt-4">
		<!--Section: Quan Ly tai Khoan-->
		<section class="mb-4">
			<div class="card">
				<div class="card-header py-3 row">
					<div class="col-sm-6">
						<h5 class="mb-0 text-left" id="">
							<strong>Quản lý sản phẩm</strong>
						</h5>
					</div>
					<div class="col-sm-6">
						<h5 class="mb-0 text-right" id="">
							<a href="#addEmployeeModal" class="btn btn-success"
								data-toggle="modal"><i class="fa-solid fa-folder-plus"></i></a>
						</h5>
					</div>
				</div>

		

				<div class="card-body">
					<div class="table-responsive">
						<table class="table table-hover text-nowrap">
							<thead>
								<tr>
									<th scope="col">ID</th>
									<th scope="col">Name</th>
									<th scope="col">Image</th>
									<th scope="col">Price</th>
									<th scope="col">Actions</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listMa}" var="o">
									<tr>
										<td>${o.BId}</td>
										<td>${o.BName}</td>
										<td><img style="    height: 150px; width: 113px;"src="${o.BImage}"></td>
										<td>${o.BPrice}$</td>
										<td><a href="loadProduct?Bid=${o.BId}"><button
													type="button" class="btn btn-warning">
													<i class="fa-solid fa-pen-to-square"></i>
												</button></a> 
												<a href="delete?Bid=${o.BId }"><button type="button"
													class="btn btn-danger">
													<i class="fa-solid fa-trash-can"></i>
												</button></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

						<div class="clearfix">
							
						</div>

					</div>
				</div>
			</div>
		</section>
	</div>


</main>

<!-- Edit Modal HTML -->
<div id="addEmployeeModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form action="add" method="post">
				<div class="modal-header">
					<h4 class="modal-title">Add Product</h4>
					<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
					<div class="form-group">
							<label>Name</label> <input name="name" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Image</label> <input name="image" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Price</label> <input name="price" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>PriceSale</label>
							<textarea name="PriceSale" class="form-control" required></textarea>
						</div>
						<div class="form-group">
							<label>Category</label> <select name="category"
								class="form-select" aria-label="Default select example">
								<c:forEach items="${listC}" var="o">
									<option value="${o.CId}">${o.CName}</option>
								</c:forEach>
							</select>
						</div>
							<div class="form-group">
							<label>Author</label>
							<select name="author"
								class="form-select" aria-label="Default select example">
								<c:forEach items="${listAu}" var="o">
									<option value="${o.auId}">${o.auName}</option>
								</c:forEach>
							</select>
						</div>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal"
						value="Cancel"> <input type="submit"
						class="btn btn-success" value="Add">
				</div>
			</form>
		</div>
	</div>
</div>

					   <div class="row">
						<div class="col-lg-12">
							<div class="product__pagination Paging_Blog" style="padding-bottom: 25px;">
									<c:forEach begin="1" end="2" var="i">
										<a  class="${tag==i?"active":"" }"
										 href="PagingBook?index=${i}"> ${i} </a>
									</c:forEach>
							</div>
						</div>
					</div>
					