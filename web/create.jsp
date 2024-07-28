<%-- 
    Document   : create
    Created on : Jul 27, 2024, 2:30:14 PM
    Author     : Omni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
            
            <input type="text" id="hoTen" name="name" placeholder ="Full name">

            <input type="text" id="diaChi" name="address" placeholder="Address">

            <input type="date" id="ngaySinh" name="dayOfBirth" placeholder="Day of birth">

            <input type="text" id="queQuan" name="homeTown" placeholder="Home Town" >
                   
            <input type="tel" id="sdt" name="phoneNumber" placeholder="Phonenumber">

            <input type="text" id="trinhDo" name="level" placeholder="Level">
            
            <input type="text" id="personId" name="personId" placeholder="PersonId">

            <input type="text" id="accountId" name="accountId" placeholder="AcountId">

            <input type="password" id="pass" name="password" placeholder="Password">
            <button>Login<button>
                    
        </form>
        
    </body>
</html>
