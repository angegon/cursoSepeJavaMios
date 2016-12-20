package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculoTabla")
public class CalculoTabla extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int numero = Integer.parseInt(request.getParameter("numero"));

		try (PrintWriter out = response.getWriter();) { // Entre los m�todos del
														// response, parametro.
			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println("<th colspan='11' style='background-color: yellow;font-size:25px'>Tabla de multiplicar del "
					+ numero + "</th>");
			for (int i = 1; i <= 10; i++) {
				out.println("<tr>");
				out.println("<td style='background-color: green; font-size:20px;font-weight:bold;text-align='center'> "
						+ i + " x " + numero + " = " + i * numero + " </td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</br>");
			out.println("<a href='tabla.html'>Volver</a>");
			out.println("</body>");
			out.println("</html>");
		}

	}

}
