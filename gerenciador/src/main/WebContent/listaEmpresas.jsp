<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.alura.gerenciador.servlet.Empresa"%>

<html>

<body>

	<ul>
	<%
	List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
	for (Empresa empresa: lista){
		%>
		<li><%=empresa.getNome()%> cadastrada</li>
		<% 
	}
	%>
	
		 
	</ul>
		
</body>
</html>