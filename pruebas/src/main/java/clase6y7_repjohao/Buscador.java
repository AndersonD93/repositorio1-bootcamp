package clase6y7_repjohao;

public class Buscador {

		 private String claveBusqueda;
		 private Articulo[]resultados;
		
		 private Integer CantidadDeResultados;
		
		 
		 //public Integer unAtributo; NOSE HACEN

		 //constructor
		 public Buscador(){
			 System.out.println("creando buscador..");
		 }
		 
		 void buscar () {
			 System.out.println("Buscando..."+this.claveBusqueda);
			 
			 //como mi buscador necesita usar un objeto de la clase DB 
			 //debe instanciar un objeto de dicha clase
			 
			 DB db=new DB();
			 /*Articulo[] resultadosQueHayEnDB = db.consultar(claveBusqueda);
			 this.resultados= resultadosQueHayEnDB;*/ //Opcion 1 o directamente :
			 
			 this.resultados = db.consultar(claveBusqueda);
			 
			 //invocamos a un metodo interno (privado) pasando el tamaño del vector como parametro
			 this.setCantidadDeResultados(this.resultados.length);
			 
		 } 
		 
		 public void setCantidadDeResultados(int cantidad) {
			 if(cantidad<0) {
				 this.CantidadDeResultados=0;
			 }else {
				 this.CantidadDeResultados=cantidad;
			 }
			 
		 
		}

		public Integer getCantidadDeResultados() {
			if(this.CantidadDeResultados==null) {
				// CantidadDeResultados=0;
				setCantidadDeResultados(0);
			}
			return this.CantidadDeResultados;
		}

		
		void mostrarResultados() {
			 if (this.resultados.length>0) {
				 for ( Articulo aux: this.resultados) {
					 aux.detalleArticulo();
				 }
			 }else {
					 System.out.println("No hay resultados para" + this.claveBusqueda);
				 }
			 }

		public String getClaveBusqueda() {
			return claveBusqueda;
		}

		public void setClaveBusqueda(String claveBusqueda) {
			this.claveBusqueda = claveBusqueda;
		}

		public Articulo[] getResultados() {
			return resultados;
		}
		 }
		 
		 
