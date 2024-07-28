<%-- 
    Document   : center
    Created on : Jul 23, 2024, 10:09:50 AM
    Author     : Omni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id ="hv" class ="Service.HocVienService" scope="request"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
         ${hv.showInformationHocVien()}
        <<form action="/application" method="get">
            ${hv.showInformationHocVien()}
            <button> View student information <button>
            
        </form>>
        
    </body>
</html>
