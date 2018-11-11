

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
			<td><b><spring:message code="show.fechadesalida"/></b></td>
			<td><b><spring:message code="show.horadesalida"/></b></td>
			<td><b><spring:message code="show.fechadellegada"/></b></td>
			<td><b><spring:message code="show.horadellegada"/></b></td>
		</tr>
	<c:forEach items="${disponibles}" var="horario">
			<tr>
				<td><c:out value="${horario.estacionSalidaNombre}"></c:out></td>
				<td><c:out value="${horario.estacionLlegadaNombre}"></c:out></td>
				<td><c:out value="${horario.fechaSalida}"></c:out></td>
				<td><c:out value="${horario.horaSalida}"></c:out></td>
				<td><c:out value="${horario.fechaLlegada}"></c:out></td>
				<td><c:out value="${horario.horaLlegada}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<a href="sacarBillete">Volver</a>
</body>
</html>