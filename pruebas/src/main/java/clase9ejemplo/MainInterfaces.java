package clase9ejemplo;

public class MainInterfaces {

	public static void main(String[] args) {
		
		Avion a= new Avion();
		Helicoptero h= new Helicoptero();
		
		Volador[] voladores=new Volador[] {a,h};
		
		for (Volador v : voladores){
			if ( v instanceof Aterrizable) {
				Aterrizable atr= (Aterrizable)v;
				
				atr.aterrizar();
			}else {
				System.out.println( v + "No puede aterrizar, no cumple contrato");
			}
		}
		
		
	}

}
