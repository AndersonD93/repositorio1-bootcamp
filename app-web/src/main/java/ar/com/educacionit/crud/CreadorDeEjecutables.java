package ar.com.educacionit.crud;

import java.util.HashMap;
import java.util.Map;

public class CreadorDeEjecutables {
	
	private static Map<Integer, Ejecutable> crearOpciones(){
		// creo el mapa que asocia opcion > accion
		Map<Integer, Ejecutable> opciones = new HashMap<>();
		
		//cargo el mapa con las opciones
		opciones.put(1, new Alta());
		opciones.put(2, new Baja());
		opciones.put(3, new Modificar());
		opciones.put(4, new Eliminar());
		
		return opciones;
		
	}
	private static Map<Integer, Ejecutable> opcionesMap = crearOpciones();
	
	
	public static Ejecutable getEjecutable(Integer opcionBuscada) throws Exception {
		
		
		if (opcionesMap.containsKey(opcionBuscada)) {
			return opcionesMap.get(opcionBuscada);
		}
		throw new RuntimeException("No existe Ejecutable asociado a la clave : "+ opcionBuscada);
	}
}
