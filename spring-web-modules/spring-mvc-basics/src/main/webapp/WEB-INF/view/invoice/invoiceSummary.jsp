<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Submitted Invoice Information</h2>
	<h3>${msg}</h3>
	<table>
		<tr>
			<td>Concepto :</td>
			<td>${concepto}</td>
		</tr>
		<tr>
			<td>Fecha inicio :</td>
			<td>${dateFrom}</td>
		</tr>
		<tr>
			<td>Fecha fin :</td>
			<td>${dateTo}</td>
		</tr>
		<tr>
			<td>Cantidad :</td>
			<td>${cantidad}</td>
		</tr>
		<tr>
			<td>Porcentaje de retencion :</td>
			<td>${retencion}</td>
		</tr>
		<tr>
        	<td>Total neto :</td>
        	<td>${totalNeto}</td>
        </tr>
	</table>
</body>
</html>