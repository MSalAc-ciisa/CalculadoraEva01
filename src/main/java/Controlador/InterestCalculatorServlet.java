/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcelo
 */
public class InterestCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            // Obtener los parámetros del formulario JSP
            double capital = Double.parseDouble(request.getParameter("capital"));
            double tasaInteres = Double.parseDouble(request.getParameter("tasaInteres"));
            int numAnios = Integer.parseInt(request.getParameter("numAnios"));

            // Realizar el cálculo de interés simple
            double interesSimple = capital * (tasaInteres / 100) * numAnios;

            // Enviar el resultado directamente como respuesta al cliente
            response.setContentType("text/html");
            response.getWriter().println("<html><head><title>Resultado del cálculo de interés simple</title></head><body>");
            response.getWriter().println("<h1>Resultado del cálculo de interés simple</h1>");
            response.getWriter().println("<p>El interés simple generado es: $" + interesSimple + "</p>");
            response.getWriter().println("<a href=\"index.jsp\">Calcular otro interés simple</a>");
            response.getWriter().println("</body></html>");
        } catch (NumberFormatException e) {
            e.printStackTrace(); 
        }
    }
}
