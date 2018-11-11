

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
		<form:select itemValue="id" itemLabel="nombre"  path="estacionSalida" items="${listaEstaciones}" />
		<br />
		<input type="submit"/>
	</form:form>
</body>
</html>