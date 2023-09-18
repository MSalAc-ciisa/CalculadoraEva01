<%-- 
    Document   : result
    Created on : 18-09-2023, 10:58:51
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado del cálculo de interés simple</title>
</head>
<body>
    <h1>Resultado del cálculo de interés simple</h1>
    <p>El interés simple generado es: $<%= request.getAttribute("interesSimple") %></p>
    
    <!-- Enlace para volver a ingresar los datos -->
    <a href="index.jsp">Calcular otro interés simple</a>
</body>
</html>
