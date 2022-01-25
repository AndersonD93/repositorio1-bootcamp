package gestorAlumnos;

public class Materias {
	
	private int idMateria;
	private String NombreMateria;
	private String turno;
	
	
	public Materias(int idMateria, String nombreMateria, String turno) {
		this.idMateria = idMateria;
		NombreMateria = nombreMateria;
		this.turno = turno;
	}
	
	public Materias(int idMateria) {
		this.idMateria=idMateria;
	}


	public Integer getIdMateria() {
		return idMateria;
	}


	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}


	public String getNombreMateria() {
		return NombreMateria;
	}


	public void setNombreMateria(String nombreMateria) {
		NombreMateria = nombreMateria;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	@Override
	public String toString() {
		return "Materias [idMateria=" + idMateria + ", NombreMateria=" + NombreMateria + ", turno=" + turno + "]";
	}
	
	
	
	
	
}
