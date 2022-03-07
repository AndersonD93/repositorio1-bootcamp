package ar.com.educacionit.generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.domain.Articulos;

public class CSVFileParser extends BaseFile implements IFileParser<Collection<Articulos>> {
	
	public CSVFileParser(String path) {
		super(path);
	}

	//implementar el metodo generico, pero , dandole un tipo concreto
	
	public  Collection<Articulos> parse() throws ParseException{
		
		//lista vacia de articulos
		Collection<Articulos> articulos=new ArrayList<>();
		
		File file =new File(super.filepath);
		//verifico que el archivo existe
		if (!file.exists()) {
			throw new ParseException("No existe el archivo.. " + super.getFilepath());
		}
		
		//leo archivo
		
		//aca va la logica de lectura del file
		try (FileReader fileReader = new FileReader(file);){
		
			try(BufferedReader br = new BufferedReader(fileReader);){
			
			//leer la primera linea y la descarto pór tener los titulos
			
			String lineaLeida=br.readLine();
			// id;titulo;precio;
			
			//vuelvo a leer para tomar los "registros"
			lineaLeida = br.readLine();
			while (lineaLeida!=null) {
				//1;monitor;25000 lo separo por ; tengo un array con 3 posiciones String[]
				//logica del parseo
				
				String[] datos=lineaLeida.split(";");
				String id= datos[0];
				String titulo= datos[1];
				String precio= datos[2];
				
				//creo el articulo
				
				Articulos unArticulo =new Articulos(Long.parseLong(id),titulo,Double.parseDouble(precio));
				
				articulos.add(unArticulo);
				
				lineaLeida = br.readLine();
			}
			}
			
		} catch (IOException e) {
			throw new ParseException(e.getMessage(),e);
		}
		
		
		return articulos;
	}


}
