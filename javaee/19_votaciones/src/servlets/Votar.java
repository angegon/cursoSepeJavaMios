package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Votar")
public class Votar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		super.init(config);
		
		//ServletContext sc = this.getServletContext();//Esto dar�a null, porque todavia no esta el objeto disponible
		ServletContext sc = config.getServletContext();//Esto no
		
		int contador[] = new int[2];
		//inicializamos el atributo global.
		sc.setAttribute("contadorVotacion", contador);		
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext sc = this.getServletContext();
		
		int contadorVoto[];
		int recuperarvoto = Integer.parseInt(request.getParameter("votacion"));

		
		
		//Esto no es thread segure, para ello usaremos bloques sincronizados
		//Para que un hilo complete la tarea, antes de que lo coja otro(hilo corresponder�a a usuario)
		synchronized(sc){
			contadorVoto = (int[])sc.getAttribute("contadorVotacion");
			
			if(recuperarvoto==0)
				contadorVoto[0]++;
			else
				contadorVoto[1]++;
			
			sc.setAttribute("contadorVotacion", contadorVoto);	
		}		
		
		request.getRequestDispatcher("votacion.html").forward(request, response);
	}

}