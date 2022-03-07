package ar.com.educacionit.generic;

public abstract class BaseFile {

	protected String filepath;//alt+shif+r

	public BaseFile(String path) {
		//hay logica
		
		if(path==null) {
			throw new IllegalArgumentException("archivo incorrecto")
;
			
		}
		this.filepath = path;
	}

	public String getFilepath() {
		return filepath;
	}
	
	
	
}
