package ar.com.educacionit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.ArticulosServices;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServicesImpl;

/*
 * Los servlet no tienen metodo main, porque no son
 * tipo consoloa , sino web
 * */

@WebServlet("/ListadoServlet")
public class ListadoServlet extends HttpServlet {

	@Override
	//HACE LAS VECES DEL METODO MAIN EN CONSOLA
	protected void doPost(HttpServletRequest entrada, HttpServletResponse salida) throws ServletException, IOException {
	System.out.println("Llegue al servlet / listado que escucha atiendo por POST");
	salida.getWriter().print("Hola frontend, soy el back te escucho y respondo tu request");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// que hago : instacion ArticuloService
		ArticulosServices articuloService = new ArticulosServicesImpl();
		try {
			List<Articulos>articulos=articuloService.findAll();
		
			// guardar el listado en un lugar llamado "request de la otra pagina"
			request.setAttribute("LISTADO", articulos);
			
			// AHORA ANDE A LA OTRA PAGINA Y PASA LA LISTA DE ARTICULOS
			getServletContext().getRequestDispatcher("/listado.jsp").forward(request, response);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}

