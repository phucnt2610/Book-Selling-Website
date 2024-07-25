<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  
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
</head>
<body>
  
  <hr>
<div class="container d-flex justify-content-center">
            <div class="col-md-4 ">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="text-center">
                          <h3><i class="fa fa-lock fa-4x"></i></h3>
                          <h2 class="text-center">Forgot Password?</h2>
                          <p>You can reset your password here.</p>
                            <div class="panel-body">
                              
                              <form action="ForgotPass" >                             
                                  <div class="form-group">
                                    <div class="input-group">
                                      <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                                      
                                      <input id="emailInput"  name="email" placeholder="email address" class="form-control" type="email" oninvalid="setCustomValidity('Please enter a valid email address!')" onchange="try{setCustomValidity('')}catch(e){}" required="">
                                    </div>
                                  </div>
                                    	<button type="submit" class="site-btn">Send mail</button>                              
                              </form>
                              
                            </div>
                        </div>
                </div>
                      </div>
    </div>
</div>
<!-- JS  -->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>