package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javabeans.Contacto;
import modelo.GestionContactos;


@WebServlet("/ListarContactos")
public class ListarContactos extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Contacto> Contactos = new ArrayList<>();
		GestionContactos gc = new GestionContactos();
		
		//Obtenemos los contactos de la BBDD
		Contactos = gc.ListarContactos();
		
		//Los pintamos en la web.//Meter esto en el jsp, todo lo que tenga que ver con la visualización
		response.setContentType("text/html");
		try ( PrintWriter out = response.getWriter();){		//Entre los métodos del response, parametro.
			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println("<th colspan='11' style='background-color: yellow;font-size:35px'>Contactos</th>");
			out.println("<tr>");
			out.println("<td>Nombre</td>");
			out.println("<td>Email</td>");
			out.println("<td>telefono</td>");
			out.println("</tr>");	
			
			for (Contacto c: Contactos){
				out.println("<tr>");
				out.println("<td>"+c.getNombre()+"</td>");
				out.println("<td>"+c.getEmail()+"</td>");
				out.println("<td>"+c.getTelefono()+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<h1><a href='inicio.html'>Volver</a></h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
