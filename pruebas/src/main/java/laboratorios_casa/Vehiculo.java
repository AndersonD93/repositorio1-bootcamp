package laboratorios_casa;

public class Vehiculo {

	private String marca;
	private String modelo;
	private int precio;
	
	//constructor
	public Vehiculo(String marca, String modelo, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return "Marca :"+marca+" Modelo: "+modelo+" Precio: $"+precio;
		
	}
	
	
	
	
	
}
