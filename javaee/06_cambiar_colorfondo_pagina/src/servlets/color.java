package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/color")
public class color extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String color= request.getParameter("color");
		
		try (PrintWriter out = response.getWriter();){
			
			out.println("<html>");
			out.println("<body bgcolor='"+color+"'> <h1>El color de fondo es: "+color+"</h1>");
			out.println("</br><a href='color.html'>Volver</a>");
			out.println("</body>");
			out.println("</html>");			
			
		}
		
	}

}
