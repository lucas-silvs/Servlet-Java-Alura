<%
String nomeEmpresa =(String) request.getAttribute("nomeEmpresa");
System.out.println(nomeEmpresa);
%>

<html>
<body>

Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso!

</body>
</html>


