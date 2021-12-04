package laboratorios_casa;

public class AreaPerimetroCuadrilatero {
	
	private float lado1;
	private float lado2;
	
	
	// Constructor Cuadrilatero
	public AreaPerimetroCuadrilatero(float lado1, float lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	//Constructor cuadrado
	
	public AreaPerimetroCuadrilatero(float lado1) {		
		this.lado1 =this.lado2= lado1;
	}
	
	//metodos get y set
	
	public float getPerimetro() {
			float perimetro = (lado1+lado2)*2;
			return perimetro;
	}
	
	public float getArea() {
		float area = (lado1*lado2);
		return area;
}
	
	

}
