<%-- 
    Document   : login
    Created on : Jul 21, 2024, 2:16:26 PM
    Author     : Omni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles.css">
        <title>Login Form</title>
       
    
    </head>
    <body background ='b.jpg'  ">
        <div class='container'> 
         <h1 class="lable-login">LOGIN</h1>
   
     
<!--        <form action="http://localhost:8080/Wed/login" method="post">
            <input type="text"  name="Username" placeholder = "Username">
            <input type="text" name="Password" placeholder = "Password">
            <button>Login<button>
                    
        </form>-->
       
        <form  action="http://localhost:8080/Wed/login" method="post"   >
            <div class="input-group">
                <label for="email"><i class="fas fa-envelope"></i></label>
                <input type="Username" id="email" name="username" placeholder="Username" required>
            </div>
            <div class="input-group">
                <label for="password"><i class="fas fa-lock"></i></label>
                <input type="Password" id="Password" name="password" placeholder="Password" required>
            </div>
          
            <button type="submit">LOGIN</button>
        </form>
           </div>    
    </body>
</html>
