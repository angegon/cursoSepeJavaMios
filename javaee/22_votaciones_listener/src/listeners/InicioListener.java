package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class InicioListener implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent arg0)  { 

    	
    }


    public void contextInitialized(ServletContextEvent arg0)  { 

		
		//ServletContext sc = this.getServletContext();//Esto dar�a null, porque todavia no esta el objeto disponible
		ServletContext sc = arg0.getServletContext();//Esto no
		
		int si=0;
		int no=0;
		//inicializamos el atributo global.
		sc.setAttribute("contadorVotosSi", si);	
		sc.setAttribute("contadorVotosNo", no);	    	
    }
	
}
