<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="menu.jsp"></jsp:include>
<jsp:include page="CartAndCheckout.jsp"></jsp:include>
<section class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__text">
                    <h4>Shopping Cart</h4>
                    <div class="breadcrumb__links">
                        <a href="./index.jsp">Home</a> <a href="./shop.jsp">Shop</a> <span>Shopping
							Cart</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="shopping-cart spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-8">
                <div class="shopping__cart__table">
                    <table>
                        <thead>
                        <tr>
                            <th>Product</th>
                            <th style="text-align: center; padding-right: 35px;">
                                Quantity
                            </th>
                            <th style="text-align: right;">Total</th>
                            <th style="text-align: right;">Action</th>

                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${items}" var="i">
                            <tr>
                                <td class="product__cart__item">
                                    <div class="product__cart__item__pic">
                                        <img src="${i.book.BImage}" alt=""/>
                                    </div>
                                    <div class="product__cart__item__text">
                                        <h6>${i.book.BName}</h6>
                                        <h5>${i.book.BPriceSale}$</h5>
                                    </div>
                                </td>
                                <td class="quantity__item">
                                    <div class="quantity">
                                        <div class="pro-qty-2" style="width: 137px;">
                                            <button data-id="${i.book.BId}" class="btnSub"
                                                    style="padding: 12px">
                                                <i class="fa-solid fa-minus"></i>
                                            </button>
                                            <input type="text" id="quantity-${i.book.BId}"
                                                   value="${i.quantity}"/>

                                            <button data-id="${i.book.BId}" class="btnAdd"
                                                    style="padding: 12px">
                                                <i class="fa-solid fa-plus"></i>
                                            </button>
                                        </div>
                                    </div>
                                </td>


                                <td class="cart__price"
                                    style="text-align: right !important;">${i.quantity * i.book.BPriceSale}
                                    $
                                </td>

                                <td class="quantity__item" style="text-align: right;"><a
                                        href="DeleteCart?BId=${i	.book.BId }">
                                    <button
                                            type="button" class="btn btn-danger">
                                        <i class="fa-solid fa-trash-can"></i>
                                    </button>
                                </a>
                                </td>


                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="continue__btn">
                            <a href="shop">Continue Shopping</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <c:if test="${mess eq 1}">
                    <div class="alert alert-warning" role="alert">Sản phẩm không
                        tồn tại
                    </div>
                </c:if>
                <div class="cart__total">
                    <h6>Cart total</h6>
                    <ul>
                        <li>Total <span>${sessionScope.cart.totalPrice()} $</span></li>
                        <li>Discount <span>${sessionScope.cart.totalPriceSale()}
								$</span></li>
                    </ul>
                    <a href="checkout.jsp" id="checkoutprocess" class="primary-btn">Proceed to checkout</a>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="Footer.jsp"></jsp:include>


<a href="#" class="scrool-top"> <img src="img/scroll-img-min.png"
                                     alt=""/>
</a>

<!-- JS -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js"
        integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    $('.btnAdd').click(function () {
        let bookId = $(this).data('id')
        let quantity = $('#quantity-' + bookId).val()
        let newQuantity = parseInt(quantity) + 1;
        $('#quantity-' + bookId).val(newQuantity)
        $.ajax({
            url: 'UpdateCart',
            method: 'Post',
            data: {
                'BId': bookId,
                'quantity': newQuantity
            }
        })
    });
    $('.btnSub').click(function () {
        let bookId = $(this).data('id')
        let quantity = $('#quantity-' + bookId).val()
        let newQuantity = parseInt(quantity) - 1;
        $('#quantity-' + bookId).val(newQuantity)
        $.ajax({
            url: 'UpdateCart',
            method: 'Post',
            data: {
                'BId': bookId,
                'quantity': newQuantity
            }
        })
    });

</script>
</body>
</html>
