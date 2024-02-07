<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Invoice Form</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
    $(document).ready(function () {
        $("#dateFrom").datepicker();
        $("#dateTo").datepicker();
    });
</script>
</head>
<body>
    <h2>Invoice Management</h2>
    <form:form method="post" action="createInvoice" modelAttribute="invoice">
        <table>
            <tr>
                <td><label for="concepto">Concepto:</label></td>
                <td><form:input path="concepto" /></td>
            </tr>
            <tr>
                <td><label for="dateFrom">Fecha Inicio:</label></td>
                <td><form:input path="dateFrom" id="dateFrom" /></td>
            </tr>
            <tr>
                <td><label for="dateTo">Fecha Fin:</label></td>
                <td><form:input path="dateTo" id="dateTo" /></td>
            </tr>
            <tr>
                <td><label for="cantidad">Cantidad:</label></td>
                <td><form:input path="cantidad" /></td>
            </tr>
            <tr>
                <td><label for="retencion">Porcentaje de retención:</label></td>
                <td><form:input path="retencion" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Crear Factura"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>