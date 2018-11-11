

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Amazin</title>
</head>
<body>
	<h1 style="text-align: center;"><spring:message code="title"/></h1>
	<br>
	<h2 style="text-align: center;"><spring:message code="welcome"/></h2>
	<br />
	<br> <spring:message code="show.disponibles"/>
	<br>
	<table>
		<tr>
			<td><b><spring:message code="show.estaciondesalida"/></b></td>
			<td><b><spring:message code="show.estaciondellegada"/></b></td>
		</tr>
	<c:forEach items="${disponibles}" var="horario">
			<tr>
				<td><c:out value="${horario.estacionSalidaId}"></c:out></td>
				<td><c:out value="${horario.estacionLlegadaId}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<a href="sacarBillete">Volver</a>
</body>
</html>