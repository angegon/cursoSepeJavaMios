package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/comprobarPassword")
public class comprobarPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	
		String password = request.getParameter("password");
		RequestDispatcher rd;
		HttpSession hs = request.getSession();
		
		String usuario= request.getParameter("usuario");
		 
		String [] cb= null;
		cb= request.getParameterValues("cookie");
		
		if (cb!=null){
			
				crearCookie(response, usuario);	
			
				
		} else{
			crearCookie(response, "");	
		}
		
		if (password.equals("curso")){
			
			hs.setAttribute("usuarioSesion", usuario);
			
			rd = request.getRequestDispatcher("bienvenida.jsp");
			//la contraseņa ya va en el requesto, no hace falta ponerla
		} else{
			rd = request.getRequestDispatcher("error.jsp");
			//la contraseņa ya va en el requesto, no hace falta ponerla, pero la ponemos...
		}
		
		
		
		//instanciamos al nuevo servlet llamando a su service, pasando los parametros request y response.
		rd.forward(request, response);
		
	}
	
	private void crearCookie(HttpServletResponse response, String us){
		
		Cookie ck = new Cookie("usuario", us);
		ck.setMaxAge(200000);
		response.addCookie(ck);
	}
}
