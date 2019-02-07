 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
 <!-- caminho do servlet -->  
<c:url value="/AlteraClienteServlet" var="linkServletAlteraCliente"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Cliente</title>
</head>
<body>

	<form action="${linkServletAlteraCliente}" method="post">
 
    Nome: <input type="text" name="nome" value="${cliente.nome}"/>
    Telefone: <input type="text" name="telefone" value="${cliente.telefone}"/>
    Data cadastro: <input type="text" name="data"  value="<fmt:formatDate value="${cliente.dataCadastro}" pattern="dd/MM/yyyy"/>"/>
    <input type="hidden" name="id" value="${cliente.id}">
    <input type="submit" value="Alterar"/>

</form>

</body>
</html>