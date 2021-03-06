package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javabeans.Producto;


@WebServlet("/Eliminar")
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		ArrayList<Producto> carrito = null;
		
		int code = Integer.parseInt(request.getParameter("code"));
		HttpSession hs = request.getSession();
		
		carrito = (ArrayList<Producto> )hs.getAttribute("carrito");
		carrito.remove(code);
		//hs.setAttribute("carrito", carrito);//no hace falta pues ya apunta la variable.
		
		RequestDispatcher rd = request.getRequestDispatcher("vercarrito.jsp");
		rd.forward(request, response);
		
		
	}

}
