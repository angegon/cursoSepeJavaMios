<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = Integer.parseInt(request.getParameter("numero"));
	%>
	<table border='1'>
		<tr>
			<th colspan="11" style="background-color: yellow; font-size: 25px">Tabla
				de multiplicar del <%=num%>
			</th>
		</tr>
		<%
			for (int i = 1; i <= 10; i++) {
		%>
		<tr>
			<td
				style="background-color: green; font-size: 20px; font-weight: bold;text-align=center">
				<%=i%> x <%=num%> = <%=(i * num)%></td>
		</tr>
		<%
			}
		%>

	</table>
	</br>
    <%@include file="pie.html"%>
	<a href='tabla.html'>Volver</a>
</body>
</html>