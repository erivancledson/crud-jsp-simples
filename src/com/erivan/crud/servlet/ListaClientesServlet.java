package com.erivan.crud.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.erivan.crud.java.Banco;
import com.erivan.crud.java.Cliente;

/**
 * Servlet implementation class ListaClientesServlet
 */
@WebServlet("/ListaClientesServlet")
public class ListaClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Cliente> lista = banco.getClientes();
		//pega os clientes 
		request.setAttribute("clientes", lista);
		//redireciona para a lista de clientes
		RequestDispatcher rd = request.getRequestDispatcher("lista-clientes.jsp");
		rd.forward(request, response);
	}



}
