package com.erivan.crud.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.erivan.crud.java.Banco;
import com.erivan.crud.java.Cliente;

/**
 * Servlet implementation class ExibeClienteServlet
 */
@WebServlet("/exibeClienteServlet")
public class ExibeClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Cliente cliente = banco.buscaClienteId(id);
		
		request.setAttribute("cliente", cliente);
		RequestDispatcher rd = request.getRequestDispatcher("/altera-cliente.jsp");
		rd.forward(request, response);
	}

	

}
