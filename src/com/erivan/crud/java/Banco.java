package com.erivan.crud.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Cliente> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	//adiciona o cliente
	public void adiciona(Cliente cliente) {
		cliente.setId(Banco.chaveSequencial++);
		lista.add(cliente);
	}
	//lista de clientes
	public List<Cliente> getClientes(){
		return Banco.lista;
	}
	
	public void removeCliente(Integer id) {
		Iterator<Cliente> it = lista.iterator();
		//existe um proximo evento continua
		while(it.hasNext()) {
			Cliente cliente = it.next();
			
			if(cliente.getId() == id) {
				it.remove();
			}
		}
	}
	
	
	public Cliente buscaClienteId(Integer id) {
		for(Cliente cliente : lista) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		
		return null;
	}
	
	

}
