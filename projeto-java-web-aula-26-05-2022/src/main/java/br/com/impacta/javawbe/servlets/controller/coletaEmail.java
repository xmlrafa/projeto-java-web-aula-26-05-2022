package br.com.impacta.javawbe.servlets.controller;

import br.com.impacta.javawbe.servlets.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "coletaEmail", value = "/coletaEmail")
public class coletaEmail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuarioSistema = (Usuario) request.getSession().getAttribute("usuario");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro de e-mail </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + usuarioSistema.getLogin() + " Informe seu email:" + "</h1>");
        out.println("<form method=\"post\" action\"adicionaEmailCookie\">");
        out.println("Email: <input type=\"text\" name=\"email\" size=\"50\"><br>");
        out.println("<input type=\"Submit\" name=\"Enviar\"");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
