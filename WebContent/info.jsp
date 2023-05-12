<%@page language="java" 
 contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>     
<jsp:useBean id="Restaurantes" scope="request" 
             type="model.Restaurantes"></jsp:useBean>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${Restaurantes.nome_Restaurante}"/></title>
</head>
<body>
 <h1> Segue dados do restaurante selecionado (<c:out value="${Restaurantes.nome_Restaurante}"/>) </h1>
 <hr>Código: <c:out value="${Restaurantes.id_restaurante}"/><hr/>
 <hr>Nome: <c:out value="${Restaurantes.nome_Restaurante}"/><hr/>
 <hr>Endereço: <c:out value="${Restaurantes.endereco}"/><hr/>
 <hr>Avaliação: <c:out value="${Restaurantes.avaliacao}"/><hr/>
 <hr>Telefone: <c:out value="${Restaurantes.telefone}"/><hr/>
 <hr>Tipo de Comida: <c:out value="${Restaurantes.tipo_Comida}"/><hr/>
 <hr>Site: <c:out value="${Restaurantes.site}"/><hr/>
 <hr>Funcionamento: <c:out value="${Restaurantes.funcionamento}"/><hr/>
 <hr>Faixa de Preço: <c:out value="${Restaurantes.faixa_Preco}"/><hr/>
 
</body>
</html>