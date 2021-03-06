package listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sun.org.apache.xpath.internal.Arg;

/**
 * Application Lifecycle Listener implementation class sesion_activa
 *
 */
@WebListener
public class sesion_activa implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public sesion_activa() {
        // TODO Auto-generated constructor stub
    }


    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	int contador;
    	ServletContext context =  arg0.getSession().getServletContext();
    	contador = (Integer) context.getAttribute("contadorSesionesActivas") + 1;
    	context.setAttribute("contadorSesionesActivas", contador );
    }


    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	int contador;
    	ServletContext context =  arg0.getSession().getServletContext();
    	contador = (Integer) context.getAttribute("contadorSesionesActivas") - 1;
    	context.setAttribute("contadorSesionesActivas", contador );    	
    }
	
}
