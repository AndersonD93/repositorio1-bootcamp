package aduran.ws;
import javax.xml.ws.Endpoint;

public class CalcluladoraPublish {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:1515/WS/Calculadora", new CalculadoraImpl());
	}

}
