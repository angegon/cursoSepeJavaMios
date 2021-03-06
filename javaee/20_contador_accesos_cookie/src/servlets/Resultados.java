package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Resultados")
public class Resultados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession hs=request.getSession();
		int valor = 0;
		if(hs.getAttribute("contadorValor")!=null){

			 valor = (Integer) hs.getAttribute("contadorValor");
		}		
		try ( PrintWriter out = response.getWriter();){		//Entre los m�todos del response, parametro.
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Has entrado "+valor+" veces</h1>");
			out.println("</body>");
			out.println("</html>");
		}		
		//Hay que desactivar la cache del navegador, sino no refresca
	}

}
