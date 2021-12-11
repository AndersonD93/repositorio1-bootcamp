package areaPoligonosOop;

public abstract class Poligonos {
	
	protected int numeroLados;
	

	public Poligonos(int numeroLados) {
		super();
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "Poligonos [Numero Lados =" + numeroLados + "]";
	}
	
	public abstract double areaPoligonos();

}
