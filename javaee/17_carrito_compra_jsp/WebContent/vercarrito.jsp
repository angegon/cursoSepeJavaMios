<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.ArrayList, javabeans.Producto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<Producto> carrito = (ArrayList<Producto>) session.getAttribute("carrito");

		if (carrito == null) {
	%>
	<jsp:forward page="sincarrito.jsp"></jsp:forward>
	<%
		} else {
	%>
	<table>
		<tr>
			<th>Eliminar</th>
			<th>Nombre</th>
			<th>Precio</th>
			<th>Ctegoria</th>
		</tr>
		<%
			int c = 0;
		%>
		<%
			for (Producto p : carrito) {
		%>
		<tr>
			<td><a href="Eliminar?code=<%=c%>">eliminar</a></td>
			<td><%=p.getNombre()%></td>
			<td><%=p.getPrecio()%></td>
			<td><%=p.getCategoria()%></td>
		</tr>
		<%
			c++;
		%>
		<%
			}
		%>

		<%
			}
		%>
	</table>

	<a href="inicio.html">Volver a Inicio</a>
</body>
</html>