package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/ProcesarLogin")
public class ProcesarLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomUsuario = request.getParameter("nomUsuario");
        String contrasena = request.getParameter("contrasena");
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexionDB.getConnection();
            String sql = "SELECT * FROM usuario WHERE NombreUsuario = ? AND Contraseña = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomUsuario);
            stmt.setString(2, contrasena);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int idUsuario = rs.getInt("idUsuario");
                request.getSession().setAttribute("idUsuario", idUsuario);
                response.sendRedirect("jsp/principalAdmin.jsp");
            } else {
                request.setAttribute("error", "Nombre de usuario o contraseña incorrectos");
                request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", "Error al procesar inicio de sesión");
            request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
        } finally {
            ConexionDB.closeConnection(conn);
        }
    }
}
