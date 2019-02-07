 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 
 <!-- caminho do servlet -->  
<c:url value="/novo-cliente" var="linkServletNovoCliente"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Cliente</title>
</head>
<body>

	<form action="${linkServletNovoCliente}" method="post">
 
    Nome: <input type="text" name="nome"/>
    Telefone: <input type="text" name="telefone"/>
    Data Cadastro: <input type="text" name="data"/>
    <input type="submit" value="Cadastrar"/>

</form>

</body>
</html>