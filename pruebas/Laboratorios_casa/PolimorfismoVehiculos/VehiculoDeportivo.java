package PolimorfismoVehiculos;

public class VehiculoDeportivo extends Vehiculos {
	private int cantidadAsientos;
	
	
	public VehiculoDeportivo(String marca, int numPuertas, String tipoCombustible,int cantidadAsientos) {
		super(marca, numPuertas, tipoCombustible);
		this.cantidadAsientos=cantidadAsientos;
	}


	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	
	public String mostrarDatos() {
		return "marca : "+ marca + " numero de puertas :"+ numPuertas + " tipo de combustible "+tipoCombustible +" cantidad de Asientos: "+cantidadAsientos;
	}
	

}
