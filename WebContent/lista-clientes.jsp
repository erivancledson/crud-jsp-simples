<%@ page import="java.util.List, com.erivan.crud.java.Cliente" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de clientes</title>
</head>
<body>
<a href="/crud-jsp-simples/cadastro-cliente.jsp">Cadastrar cliente</a>

		<ul>
			<c:forEach items="${clientes}" var="cliente">
			
				<li>
				${cliente.nome} - ${cliente.telefone} - <fmt:formatDate value="${cliente.dataCadastro}" pattern="dd/MM/yyyy"/>
				<a href="/crud-jsp-simples/exibeClienteServlet?id=${cliente.id}">editar</a>
				<a href="/crud-jsp-simples/removeClienteServlet?id=${cliente.id}">remover</a>
				</li>
			
			</c:forEach>
			
		
		</ul>

</body>
</html>