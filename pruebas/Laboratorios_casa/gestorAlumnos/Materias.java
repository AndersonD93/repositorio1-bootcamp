package gestorAlumnos;

public class Materias {
	
	protected int idMateria;
	protected String NombreMateria;
	protected String turno;
	
	
	public Materias(int idMateria, String nombreMateria, String turno) {
		super();
		this.idMateria = idMateria;
		NombreMateria = nombreMateria;
		this.turno = turno;
	}


	public int getIdMateria() {
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
