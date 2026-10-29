package org.gerdoc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        if (nombre == null || nombre.trim().isEmpty()
                || contrasena == null || contrasena.isEmpty()) {

            response.getWriter().println(
                    "<h2>Error: debes ingresar nombre y contraseña.</h2>"
            );
            return;
        }

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Datos recibidos correctamente</h2>");
        response.getWriter().println(
                "<p>Nombre: " + escaparHTML(nombre) + "</p>"
        );
        response.getWriter().println("</body></html>");
    }

    private String escaparHTML(String texto) {
        return texto.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#x27;");
    }
}
