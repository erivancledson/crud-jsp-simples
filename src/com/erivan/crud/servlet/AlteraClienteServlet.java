package com.erivan.crud.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.erivan.crud.java.Banco;
import com.erivan.crud.java.Cliente;

/**
 * Servlet implementation class AlteraClienteServlet
 */
@WebServlet("/AlteraClienteServlet")
public class AlteraClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeCliente = request.getParameter("nome");
		String telefoneCliente = request.getParameter("telefone");
		String dataCliente = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		  
		  //converte para o tipo Date
		  Date dataCadastro = null;
		  try {
			  SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
			  dataCadastro = dt.parse(dataCliente);
		  }catch(ParseException e) {
			  throw new ServletException(e);
		  }
		  
		  
		 Banco banco = new Banco();
		 Cliente cliente = banco.buscaClienteId(id);
		 cliente.setNome(nomeCliente);
		 cliente.setTelefone(telefoneCliente);
		 cliente.setDataCadastro(dataCadastro);
		  
		  response.sendRedirect("ListaClientesServlet");
		 
	}

}
