package PolimorfismoVehiculos;

public class Vehiculos {
	
	protected String marca;
	protected int numPuertas;
	protected String tipoCombustible;
	
	
	public Vehiculos(String marca, int numPuertas, String tipoCombustible) {
		super();
		this.marca = marca;
		this.numPuertas = numPuertas;
		this.tipoCombustible = tipoCombustible;
	}


	public String getMarca() {
		return marca;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public String getTipoCombustible() {
		return tipoCombustible;
	}
	
	public String mostrarDatos() {
		return "marca : "+ marca + "numero de puertas :"+ numPuertas + "tipo de combustible "+tipoCombustible;
	}
	
	
	

}
