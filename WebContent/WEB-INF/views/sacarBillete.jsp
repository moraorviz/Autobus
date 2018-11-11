

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Autobus</title>
</head>
<body>
	<h1 style="text-align: center;"><spring:message code="title"/></h1>
	<br>
	<h2 style="text-align: center;"><spring:message code="welcome"/></h2>
	<br> <spring:message code="show.infoviaje"/>
	<form:form modelAttribute="billeteRegistro">
		<spring:message code="select.estacionsalida"/>
		<form:select itemValue="estacionId" itemLabel="nombre"  path="estacionSalidaId" items="${listaEstaciones}" />
		<br />
		<spring:message code="select.estacionllegada"/>
		<form:select itemValue="estacionId" itemLabel="nombre"  path="estacionLlegadaId" items="${listaEstaciones}" />
		<br />
		<spring:message code="select.fechadesalida"/>
		<form:select itemValue="fechaSalida" itemLabel="fechaSalida"  path="horario.fechaSalida" items="${listaHorarios}" />
		<br />
		<spring:message code="select.tipodeviaje"/>
		<form:select itemValue="estado" itemLabel="descripcion"  path="idaYvuelta" items="${condiciones}" />
		<br />
		<spring:message code="select.numerodeviajeros"/>
		<form:select itemValue="id" itemLabel="description"  path="numeroPasajeros" items="${families}" />
		<br />
		<input type="submit"/>
	</form:form>
</body>
</html>