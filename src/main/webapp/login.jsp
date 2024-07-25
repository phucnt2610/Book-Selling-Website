<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>LOGIN</title>

    <!-- FONT AWNSOME  -->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
      integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />

    <!-- -- CSS FILE  -->
    <link rel="stylesheet" href="./css/style_login.css" />
  </head>
  <body>
    <div class="container" id="container">
      <div class="form-container sign-up-container">
        <form action="signUp">
          <h1>Create Account</h1>
          <div class="social-container">
            <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
            <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
            <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
          </div>
          <input type="text" name ="name"placeholder="Họ và tên" /> 
          <input type="text" name ="phone" placeholder="Số điện thoại" />
          <input type="email" name ="email" placeholder="Email" />
          <input type="text" name ="user" placeholder="Tên đăng nhập" />
          <input type="password" name ="pass" placeholder="Mật khẩu" />
          <input type="password" name ="repass" placeholder="Nhập lại mật khẩu" />
          <button >Sign Up</button>
        </form>
      </div>
      <div class="form-container sign-in-container">
        <form action="login">
          <h1>Sign in</h1>
          
          <div class="social-container">
            <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
            <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
            <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
          </div>
          <span>or use your account</span>
          <div style="color: red;">
			<p>${mess}</p>
          </div>
          <input type="text" name ="user" placeholder="Tên đăng nhập" />
          <input type="password" name ="pass" placeholder="Mật khẩu" />
          <a href="ForgotPass.jsp">Forgot your password?</a>
          <button>Sign In</button>
        </form>
      </div>
      <div class="overlay-container">
        <div class="overlay">
          <div class="overlay-panel overlay-left">
            <h1>Welcome Back!</h1>
            <p>
              To keep connected with us please login with your personal info
            </p>
            <button class="ghost" id="signIn">Sign In</button>
          </div>
          <div class="overlay-panel overlay-right">
            <h1>Hello, Friend!</h1>
            <p>Enter your personal details and start journey with us</p>
            <button class="ghost" id="signUp">Sign Up</button>
          </div>
        </div>
      </div>
    </div>

    <script src="./js/main_login.js"></script>
  </body>
</html>
    