package ar.com.educacionit.generic;

import java.util.Collection;

import ar.com.educacionit.domain.Articulos;

public class TestXLSXParser {

	public static void main(String[] args) {

		
		String path = "./src/test/java/articulos.xlsx";
						///./src/test/java/articulos.xlsx
		IFileParser<Collection<Articulos>> xlsxParser = new XLSFileParser(path); 

		try {
			Collection<Articulos> articulos = xlsxParser.parse();			
			//System.out.println(articulos.size() == 1);
			System.out.println(articulos);
		} catch (ParseException e) {
			System.err.println(e);
		}
	}

}
