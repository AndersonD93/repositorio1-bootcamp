package ar.com.educacionit.generic;

import java.util.Collection;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.ArticulosServices;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServicesImpl;

public class TestXLSXParserAndInsert {

	public static void main(String[] args) throws ParseException {

		//obtener el parser
		String path = "./src/test/java/articulos.xlsx";
		IFileParser<Collection<Articulos>> xlsxParser = new XLSFileParser(path); 

		Collection<Articulos> articulos = xlsxParser.parse();	
		
		//insertarlo a base de datos
		
		//1- creo el service asociado a articulos
		ArticulosServices as = new ArticulosServicesImpl();
		
		for(Articulos unArticulo:articulos) {
			//2. ejecuto el metodo save:save
			try {
				as.save(unArticulo);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
			
		}
		
		
}
}