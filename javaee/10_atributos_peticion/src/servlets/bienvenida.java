package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabeans.Ficha;


@WebServlet("/bienvenida")
public class bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Ficha ficha= (Ficha) request.getAttribute("nombreatributo");//devuelve un object, por eso el cast
		String usuario = ficha.getNombre()+"</br>"+ficha.getEmail()+"</br>"+ficha.getTelefono();
		
		try ( PrintWriter out = response.getWriter();){		//Entre los m�todos del response, parametro.
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Bienvenido  </h1>"+usuario+"///");
			out.println("</br><a href='login.html'>Volver</a>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}		
	}

}
