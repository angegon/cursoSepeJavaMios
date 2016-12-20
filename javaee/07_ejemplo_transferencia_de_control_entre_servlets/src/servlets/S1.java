package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S1")
public class S1 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Transferir petición a servlet 2:
		
		//obtenemos RequestDispatcher, una implementación de la interface.
		RequestDispatcher rd = request.getRequestDispatcher("S2?otro=2");//obtiene e implementa un objeto RequestDispatcher, que implementa la interface
		//y gracias al polimorfismo lo meto en una variable de tipo RequestDispatcher
		
		//transferencia, hay que pasarle el request y el response del servlet, es como llamar
		//al services del nuevo servlet
		rd.forward(request, response);
	}

}
