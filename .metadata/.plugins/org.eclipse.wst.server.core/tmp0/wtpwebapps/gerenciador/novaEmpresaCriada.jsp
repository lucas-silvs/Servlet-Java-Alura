<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>

<c:if test="${not empty nomeEmpresa}">
Empresa ${nomeEmpresa} cadastrada com sucesso!
</c:if>

<c:if test="${empty nomeEmpresa}">
 Nome da empresa não pode ser vazio
</c:if>

</body>
</html>


