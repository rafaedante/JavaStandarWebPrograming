package com.eduit.servles;

import com.eduit.entities.Usuario;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sesion = request.getSession();
        String accion = request.getParameter("accion");
        if("logout".equals(accion)) {
            sesion.invalidate();
            response.sendRedirect("index.jsp");
            return;
        }

        ArrayList<Usuario> usuarios = dameUsuarios();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean encontro = false;

        for(Usuario usuario : usuarios) {
            if(usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                sesion.setAttribute("user", usuario);
                encontro = true;
                break;
            }
        }

        if(encontro) {
            sesion.setAttribute("error", "");
            response.sendRedirect("bienvenido.jsp");
        } else {
            sesion.setAttribute("error", "El usuario es invalido");
            response.sendRedirect("index.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private ArrayList<Usuario> dameUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario u1 = new Usuario();
        u1.setApellido("Perez");
        u1.setNombre("Jaime");
        u1.setUsername("jaiper");
        u1.setPassword("123");
        usuarios.add(u1);

        Usuario u2 = new Usuario();
        u2.setApellido("Ponce");
        u2.setNombre("Ana");
        u2.setUsername("anita");
        u2.setPassword("9089");
        usuarios.add(u2);

        Usuario u3 = new Usuario();
        u3.setApellido("Gomez");
        u3.setNombre("Pedro");
        u3.setUsername("pepe");
        u3.setPassword("123456");
        usuarios.add(u3);

        return usuarios;
    }
}
