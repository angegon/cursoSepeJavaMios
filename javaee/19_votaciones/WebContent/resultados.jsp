<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int resultadosSi = 0, resultadosNo = 0;

		if (application.getAttribute("contadorVotosSi") != null
				&& application.getAttribute("contadorVotosNo") != null) {
			resultadosSi = (int) application.getAttribute("contadorVotosSi");
			resultadosNo = (int) application.getAttribute("contadorVotosNo");

		}
	%>

	Mirar ejercicio Antonio, tiene otras condiciones.. por si le da a ver
	resultados sin votar previamente..

	<h1>
		Votos Si
		<%=resultadosSi * 100%></h1>
	</br>
	</br>
	<h1>
		Votos No
		<%=resultadosNo%></h1>

	</br>
	</br>
	<h1>
		Votos totales
		<%=resultadosSi + resultadosNo%></h1>
</body>
</html>