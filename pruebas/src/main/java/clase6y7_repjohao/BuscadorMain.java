package clase6y7_repjohao;

public class BuscadorMain {

	public static void main(String[] args) {
		// simula que ingrese a Mercado libre 
		
		Buscador buscador = new Buscador();
		
	
		
		
		String ClaveDeBusqueda="Iron man";
		buscador.setClaveBusqueda(ClaveDeBusqueda);
		
		buscador.buscar();
		buscador.mostrarResultados();
		

	}

}
