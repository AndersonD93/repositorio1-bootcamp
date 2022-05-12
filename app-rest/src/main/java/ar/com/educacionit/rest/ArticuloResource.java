package ar.com.educacionit.rest;



import java.util.HashMap;
import java.util.Map;

import jakarta.annotation.Generated;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("productos")
public class ArticuloResource {
	//jersey
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response find() {
		//ArticulosServices articuloService = new ArticulosServicesImpl();
		Map<String,String> datos = new HashMap<>();
		datos.put("clave1", "valor1");
		datos.put("clave2", "valor2");
		return Response.ok(datos).build();
	}

	
}
