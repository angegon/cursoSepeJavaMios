<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%int resultados[] = new int[2];
 resultados = (int[]) session.getAttribute("contadorVotacion"); %>


<h1>Votos Si <%=resultados[0]%></h1>
</br>
</br>
<h1>Votos No <%=resultados[1]%></h1>

</br>
</br>
<h1>Votos totales <%=resultados[0]+resultados[1] %></h1>
</body>
</html>