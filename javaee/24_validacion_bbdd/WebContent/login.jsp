<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="comprobarPassword" method="post">
<div style="float:left; background-color: green; padding: 150px ; border: 5px solid navy">

	<%!private String obtenerCookie(HttpServletRequest request) {
		String valor = "";
		Cookie[] todas = request.getCookies();
		if (todas != null) {
			for (Cookie ck : todas) {
				if (ck.getName().equals("usuario")) {
					valor = ck.getValue();
					break;
				}
			}
		}
		return valor;
	}%>
	


	<div style="background-color: yellow; padding: 10px">
	<b>Nombre de usuario:</b> <input type="text" name="usuario" placeholder="Introduce tu nombre de usuario" value="<%=obtenerCookie(request)%>"/>
	</br></br>
	<b>Contraseņa de usuario: </b><input type="password" name="password" placeholder="Introduce tu contraseņa de usuario"/>
	</br></br>
	<input type="checkbox" name="cookie" value="cookie">Guardar Usuario
	</br></br>
	<input type="submit" value="Iniciar sesion"/>
	</div>
</div>	

</form>
</body>
</html>