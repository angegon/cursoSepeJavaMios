package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/comprobarPassword")
public class comprobarPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String password = request.getParameter("password");
		
		if (password.equals("curso")){
			//redireccionamiento, no le llegan los parametros, hay que ponerselos.
			response.sendRedirect("bienvenida?usuario="+request.getParameter("usuario"));
		} else{
			//redireccionamiento, no le llegan los parametros, hay que ponerselos.
			response.sendRedirect("error?password="+request.getParameter("password"));
			
		}
		
		
		
	}

}
