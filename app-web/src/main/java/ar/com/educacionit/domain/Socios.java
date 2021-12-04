package ar.com.educacionit.domain;

public class Socios {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String direccion;
	private Long paisesId;
	
	//Constructor1
	public Socios(Long id, String nombre, String apellido, String direccion, Long paisesId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}// Constructor 2
	public Socios(String nombre, String apellido, String direccion, Long paisesId) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.paisesId = paisesId;
	}
	//Get y Set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getPaisesId() {
		return paisesId;
	}
	public void setPaisesId(Long paisesId) {
		this.paisesId = paisesId;
	}
	//To String[]
	@Override
	public String toString() {
		return "Socios [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", paisesId=" + paisesId + "]";
	}
	
	
 		
	
}
