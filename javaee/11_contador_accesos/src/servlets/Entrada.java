package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Entrada")
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Obtenemos el HttpSession que es una interface
		HttpSession hs = request.getSession();
		
		
		//la primera vez se crea, y valdr�a nulo. dar�a una excepci�n.
		//si le metieramos directamente el hs.getAttribute a contador
		int contador=0;
		
		//para evitar esa excepci�n anterior, solo recuperamos el
		//atributo sino es la primera llamada al servlet.
		if(hs.getAttribute("contadorValor")!=null){
		    //a partir de la segunda vez, coje el anterior ya creado,
			//no crea uno nuevo..
			contador = (Integer) hs.getAttribute("contadorValor");
		}
		
		contador++;
		
		//en la primera llamada se crearia
		hs.setAttribute("contadorValor", contador);
		
		//Transferencia de la petici�n a la p�gina inicio.html
		//puede ser de servlet a servlet, o de un servlet a un html
		request.getRequestDispatcher("inicio.html").forward(request, response);
		//la p�gina html, no usar� el request ni el response para nada.
		//pero la forma de hacer la transferencia de petici�n es esa.
		
	}

}
