<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <footer class="footer">
      <div class="container">
        <div class="row">
          <div class="col-lg-3 col-md-6 col-sm-6">
            <div class="footer__about">
              <div class="footer__logo">
    
              </div>
              <p>
                The customer is at the heart of our unique business model, which
                includes design.
              </p>
              <a href="#"><img src="img/payment.png" alt="" /></a>
            </div>
          </div>
          <div class="col-lg-2 offset-lg-1 col-md-3 col-sm-6">
            <div class="footer__widget">
              <h6>Shopping</h6>
              <ul>
                <li><a href="shop">Book </a></li>
                <li><a href="shop">Trending </a></li>
                <li><a href="shop">Accessories</a></li>
                <li><a href="shop">Sale</a></li>
              </ul>
            </div>
          </div>
          <div class="col-lg-2 col-md-3 col-sm-6">
            <div class="footer__widget">
              <h6>Shopping</h6>
              <ul>
                <li><a href="contact.jsp">Contact Us</a></li>
                <li><a href="contact.jsp">Payment Methods</a></li>
                <li><a href="contact.jsp">Delivary</a></li>
                <li><a href="contact.jsp">Return & Exchanges</a></li>
              </ul>
            </div>
          </div>
          <div class="col-lg-3 offset-lg-1 col-md-6 col-sm-6">
            <div class="footer__widget">
              <h6>NewLetter</h6>
              <div class="footer__newslatter">
                <p>
                  Be the first to know about new arrivals, look books, sales &
                  promos!
                </p>
                <form action="contact.jsp">
                  <input type="text" placeholder="Your email" />
                  <button type="submit">
                    <span class="lnr lnr-chevron-right"></span>
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-12 text-center">
            <div class="footer__copyright__text">
              <p>
               Website Version 1.0.1
                <script>
                  document.write(new Date().getFullYear());
                </script>
              </p>
            </div>
          </div>
        </div>
      </div>
    </footer>