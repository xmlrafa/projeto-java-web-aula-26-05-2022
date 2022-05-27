package br.com.impacta.javawbe.servlets.controller;

import br.com.impacta.javawbe.servlets.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "validaLogin", value = "/validaLogin")
public class ValidaLogin extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    Usuario usuario = new Usuario();
    usuario.setLogin(request.getParameter("login"));
    usuario.setSenha(request.getParameter("senha"));

    if (usuario.getLogin() != null && usuario.getSenha()
      != null && "impacta1".equals(usuario.getSenha())) {
      request.getSession().setAttribute("usuario", usuario);
      RequestDispatcher dispatcher = request.getRequestDispatcher("/sistema");
      dispatcher.forward(request, response);
      // cria servlet da página principal.
    } else {
      response.sendRedirect("/errologin.html");
      // cria página de erro.
    }
  }
}
