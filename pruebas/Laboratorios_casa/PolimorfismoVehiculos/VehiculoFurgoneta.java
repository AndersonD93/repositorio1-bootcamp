package PolimorfismoVehiculos;

public class VehiculoFurgoneta extends Vehiculos{
	private String modelo;

	public VehiculoFurgoneta(String marca, int numPuertas, String tipoCombustible,String modelo) {
		super(marca, numPuertas, tipoCombustible);
		this.modelo=modelo;
	}

	public String getModelo() {
		return modelo;
	}
	
	public String mostrarDatos() {
		return "marca : "+ marca + "numero de puertas :"+ numPuertas + "tipo de combustible "+tipoCombustible +"modelo: "+modelo;
	}
	

}
