package ar.com.educacionit.domain;

import java.util.Date;

public class Articulos {
	private Long id;
	private String titulo;
	private Date fechaCreacion;
	private String codigo;
	private Double precio;
	private Integer stock;
	private Long marcaId;
	private Long cartegoriaId;
	
	//hacia la db
	public Articulos(String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock, Long marcaId,
			Long cartegoriaId) {
		super();
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.cartegoriaId = cartegoriaId;
	}
	
	//desde la db
	public Articulos(Long id, String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock,
			Long marcaId, Long cartegoriaId) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.cartegoriaId = cartegoriaId;
	}
	
	//constructor
	//alt+siht+s (crearlo field)
	
	public Double getprecio() {
		return this.precio;
	}
	
	public String getprecio(String pattern) {
		return this.precio.toString();
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getCartegoriaId() {
		return cartegoriaId;
	}

	public void setCartegoriaId(Long cartegoriaId) {
		this.cartegoriaId = cartegoriaId;
	}

	public Long getId() {
		return id;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public String getTitulo(boolean isUpperCase) {
		if(isUpperCase) {
			return this.titulo.toUpperCase();
		}else {
			return this.titulo;
		}
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcaId=" + marcaId + ", cartegoriaId=" + cartegoriaId
				+ "]";
	}
	
	
}
