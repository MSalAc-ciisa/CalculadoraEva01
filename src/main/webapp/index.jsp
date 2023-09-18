<%-- 
    Document   : index
    Created on : 18-09-2023, 9:55:47
    Author     : Marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Interés Simple</title>
</head>
<body>
    <h1>Calculadora de Interés Simple</h1>
    
    <form action="calculate" method="post">
        <label for="capital">Capital:</label>
        <input type="number" id="capital" name="capital" required><br><br>
        
        <label for="tasaInteres">Tasa de Interés Anual (%):</label>
        <input type="number" id="tasaInteres" name="tasaInteres" required><br><br>
        
        <label for="numAnios">Número de Años:</label>
        <input type="number" id="numAnios" name="numAnios" required><br><br>
        
        <input type="submit" value="Calcular">
    </form>
</body>
</html>