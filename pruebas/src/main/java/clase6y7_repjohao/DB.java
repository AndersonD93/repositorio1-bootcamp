package clase6y7_repjohao;

public class DB {

	//No tiene atributos
	//No tiene contructor
	//solo tiene un metodo
	
	Articulo [] consultar (String claveConsultada){
		//simunlar datos
		
		Articulo res1= new Articulo("Spiderman tal", 35940, "http://imagen.jpg", true, 10, true);
		Articulo res2= new Articulo("Figura de acción", 34930, "http://imagen1.jpg", false, 2, true);
		
		Articulo []resultados= new Articulo[] {res1,res2};//length 2,0 y 1
		return resultados;
				
		
	}
	
}
