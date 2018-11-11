

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<br> <spring:message code="show.idas"/>
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
	<c:if test = "${billeteRegistro.idaYvuelta == true}">
	<br><spring:message code="show.vueltas"/>
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
	<c:forEach items="${vueltas}" var="horarioVuelta">
			<tr>
				<td><c:out value="${horarioVuelta.estacionSalidaNombre}"></c:out></td>
				<td><c:out value="${horarioVuelta.estacionLlegadaNombre}"></c:out></td>
				<td><c:out value="${horarioVuelta.fechaSalida}"></c:out></td>
				<td><c:out value="${horarioVuelta.horaSalida}"></c:out></td>
				<td><c:out value="${horarioVuelta.fechaLlegada}"></c:out></td>
				<td><c:out value="${horarioVuelta.horaLlegada}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
    </c:if>
	<br />
	
	
</body>
</html>

<script>
    window.print();
</script>