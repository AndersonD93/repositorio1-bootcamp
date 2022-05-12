package ar.com.educacionit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
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
import ar.com.educacionit.web.enums.ViewEnums;
import ar.com.educacionit.web.enums.ViewKeysEnum;

@WebServlet("/controllers/CargarProductosServlet")
public class CargarProductosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1- toma los datos de session (que esta dentro del req)
		
		@SuppressWarnings("unchecked")
		Collection<Articulos> articulosPreview = (Collection<Articulos>)req.getSession().getAttribute(ViewKeysEnum.UPLOAD_PREVIEW_KEY.getParam());
		
		//validaciones
		if (articulosPreview == null) {
			req.setAttribute(ViewKeysEnum.ERROR_GENERAL.getParam(),"No hay datos a procesar");
			redirect(ViewEnums.UPLOAD_PREVIEW,req,resp);
		}
		
		
		ArticulosServices service = new ArticulosServicesImpl();
		
		try {
			for (Articulos art: articulosPreview)
				service.save(art);
			
			
		} catch (ServiceException e) {
			
		}
	}

	
}
