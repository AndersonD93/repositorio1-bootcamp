package ar.com.educacionit.domain;

public class Categorias {

	//atributos
	private Long id;
	private String descripcion;
	
	//Constructor 1
	public Categorias(Long id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	//Constructor 2
	public Categorias(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	//metodos get y set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//metodo to String[]
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
