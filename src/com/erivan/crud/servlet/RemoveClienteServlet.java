package com.erivan.crud.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.erivan.crud.java.Banco;

/**
 * Servlet implementation class RemoveClienteServlet
 */
@WebServlet("/removeClienteServlet")
public class RemoveClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recebe uma string e converte para int
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		banco.removeCliente(id);
		
		response.sendRedirect("ListaClientesServlet");
		
	}


}
