package ar.com.educacionit.generic;

import java.util.Collection;

import ar.com.educacionit.domain.Articulos;

public class FileParserMain2 {

	public static void main(String[] args) {

		String path ="./src/main/java/ar/com/educacionit/generic/articulo.csv";
		
		IFileParser<Collection<Articulos>> parser= new CSVFileParser(path);
		
		int cantidadRegistros=0;
		Double precioTotal=0d;
		try {
			Collection<Articulos> articulos=parser.parse();
			cantidadRegistros= articulos.size();
			
			for (Articulos art:articulos) {
				System.out.println(art);
				precioTotal=precioTotal + art.getPrecio();
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Cantidad procesados:"+ cantidadRegistros);
		System.out.println("Precio Total:"+ precioTotal);
	}	

}
