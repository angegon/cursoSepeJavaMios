package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession hs=request.getSession();
		
		String usuario = "";
		String tema= request.getParameter("atributo");
		
		if(hs.getAttribute("usuarioSesion")!=null){

			 usuario = (String) hs.getAttribute("usuarioSesion");
		}		
		
		try ( PrintWriter out = response.getWriter();){		//Entre los m�todos del response, parametro.
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Ha entrado "+usuario+"</h1>");
			out.println("<h1>Tu tema es "+tema+"</h1>");	
			out.println("</br><a href='cerrarSesion'>Cerrar Sesion</a>");			
			out.println("</body>");
			out.println("</html>");
		}			

		
	}

}
