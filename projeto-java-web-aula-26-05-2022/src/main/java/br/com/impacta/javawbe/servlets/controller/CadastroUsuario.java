package br.com.impacta.javawbe.servlets.controller;

import br.com.impacta.javawbe.servlets.model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroUsuario", value = "/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    Usuario usuario = new Usuario();
    usuario.setNome(request.getParameter("nome"));
    usuario.setLogin(request.getParameter("login"));
    usuario.setEmail(request.getParameter("email"));
    usuario.setSenha(request.getParameter("senha"));

    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Cadastro usuario de usuario</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<H1>Cadastrado com sussesso !!!!!!!<h1>");
    out.println("<h4>Nome: </h4>" + usuario.getNome());
    out.println("<h4>Login: </h4>" + usuario.getLogin());
    out.println("<h4>Email: </h4>" + usuario.getEmail());
    out.println("</body>");
    out.println("</html>");
  }
}
