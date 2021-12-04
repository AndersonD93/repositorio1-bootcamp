package clase6y7_repjohao;

public class Articulo {

	//atributos
	String titulo;
	float precio;
	String imagen;
	boolean favorito;
	boolean enviogGratis;
	boolean tieneDescuento;
	boolean tieneCuotas;
	int cantidad;
	
	//Constructor
	public Articulo(String titulo, float precio, String imagen, boolean favorito, int cantidad, boolean tieneCuotas) {
		if (precio>20000) {
			this.enviogGratis = true;	
		}
		this.titulo = titulo;
		this.precio = precio;
		this.imagen = imagen;
		this.favorito = favorito;
		this.cantidad= cantidad;
		this.tieneCuotas= tieneCuotas;
	}
	
	public void agregarAFavorito() {
		this.favorito =! this.favorito;
	}

	void detalleArticulo() {
		System.out.println("Titulo"+ this.titulo);
		System.out.println("precio"+ this.precio);
	}
	 
	
}
