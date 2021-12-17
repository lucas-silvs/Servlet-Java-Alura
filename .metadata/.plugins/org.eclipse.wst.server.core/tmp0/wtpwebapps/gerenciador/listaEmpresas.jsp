<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.servlet.Empresa"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>

<body>

	<ul>
	Lista de empresas: </br>
	
	<ul>
	
		<c:forEach items="${empresas}" var="empresa">
		<li>${empresa.nome} <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
		<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remove</a>
		<a href="/gerenciador/editarEmpresa?id=${empresa.id}">editar</a>
		</li>
		</c:forEach>
	</ul>
	
	
	
	
	
	
	
	<%
	List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
	for (Empresa empresa: lista){
		%>
		<li><%=empresa.getNome()%> cadastrada na data ${empresa.dataAbertura}</li>
		
		<% 
	}
	%>
	
		 
	</ul>
		
</body>
</html>