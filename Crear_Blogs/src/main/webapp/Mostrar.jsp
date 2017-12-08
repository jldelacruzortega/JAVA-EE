<%-- 
    Document   : Mostrar
    Created on : Nov 9, 2017, 5:02:19 PM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <dive>
        <c:forEach items="${datos}" var="dato" >
            <h2> ${dato.nombreB} </h2> <br>
            ${dato.nombre} <br>
            ${dato.apellido} <br>
            ${dato.correo} <br>
            ${dato.contenido}<br><br>
            
            <hr>
            
            
            
        </c:forEach>  
            
    </dive>
    </body>
</html>
