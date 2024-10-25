<%-- 
    Document   : signUp
    Created on : Oct 18, 2024, 10:13:41 PM
    Author     : Macbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="css/mystyle.css">
        <script>
            function redirectToPage() {
                window.location.href = 'index.jsp';
            }
        </script>
    </head>
    <body class="login">
        <form class="form_signup" action="signup" method="post">
            <h3>Sign up Here</h3>

            
            <label for="fullname">Full name</label>
            <input  name ="fullname" type="text" placeholder="fullname" id="fullname" required">
            
              <label for="address">Address</label>
            <input name="address" type="text" placeholder="address" id="address" required>
                
             <label for="phone">Number phone</label>
            <input name ="phone" type="text" placeholder="phone" id="phone" required>
            
            <label for="email">Email    </label>
            <input  name ="email" type="text" placeholder="Email" id="email" required>

            <label for="password">Password</label>
            <input name ="password" type="password" placeholder="Password" id="password" required>
            
            <label for="birthday">Enter Your Birthday(YYYY-MM-DD)</label>
            <input name ="birthday" type="birthday" placeholder="Birthday" id="birthday" required>
            
          

            <button>Sign up</button>
            <p style="margin-top: 15px">Do you have an account?<a href="login.jsp" class="nav-item nav-link">Login</a></p>
            <!--
                        <div class="social">
                            <div class="go"><i class="fab fa-google"></i>  Google</div>
                            <div class="fb"><i class="fab fa-facebook"></i>  Facebook</div>
                        </div>-->
            
            <div class="back">
            <button type="button"onclick="redirectToPage()" >Back</button>
</div>
        </form>
    </body>
</html>