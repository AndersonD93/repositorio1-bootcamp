package ar.com.educacionit.generic;

import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.ArticulosServiceImpl;

public class FileParserMain {

	public static void main(String[] args) {

		String path ="./src/main/java/ar/com/educacionit/generic/articulo.csv";
		
		IFileParser<Collection<Articulos>> parser = new CSVFileParser(path);
		
		Collection<Articulos> articulos = new ArrayList<>();
		try {
			articulos = parser.parse();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(!articulos.isEmpty()) {
			try {
				//grabar en la db
				ArticulosServiceImpl service = new ArticulosServiceImpl();
				for(Articulos unArticulo : articulos) {
					service.save(unArticulo);
				}
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
	}

}
