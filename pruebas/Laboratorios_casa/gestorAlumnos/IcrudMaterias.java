package gestorAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class IcrudMaterias implements IcrudGeneric<Materias> {

	static Scanner teclado = new Scanner(System.in);
	int cantidadCursos;
	Menu menu = new Menu();
	Integer materia = menu.getIdMatAValidar();
	String nombreMat1;
	ArrayList<Materias> arrayMat;

	public ArrayList<Materias> create() {

		try {
			System.out.println("ingrese la cantidad de cursos a crear :");
			cantidadCursos = teclado.nextInt();

		} catch (Exception e) {
			System.out.println("Error, valor ingresado debe ser Numerico Entero.");
		}

		Materias vector = null;
		int idMat = 0;
		String nombreMat = "";
		String turno = "";

		arrayMat = new ArrayList<Materias>();

		for (int i = 0; i < cantidadCursos; i++) {

			try {
				System.out.println("Digite los datos del curso No. " + (i + 1));
				System.out.print("Digite el id de la materia : ");
				idMat = teclado.nextInt();
				System.out.print("Digite el nombre de la materia: ");
				nombreMat = teclado.next();
				System.out.print("Digite el turno de la materia : ");
				turno = teclado.next();

				vector = new Materias(idMat, nombreMat, turno);
				arrayMat.add(vector);

			} catch (Exception e) {
				System.out.println(
						"\nError, Valide el tipo de dato ingresado: \n Id:Numerico Entero \n Nombre:Texto \n Turno:Texto \n ");
			}

			// System.out.println("--------------------------------------");
			// System.out.println("Materia agregada "+ vector);
		}
		System.out.println("--------------------------------------");
		// System.out.println("Los vectores agregados son: \n"+arrayMat);

		for (Materias arraymat : arrayMat) {
			System.out.println("ID: " + arraymat.getIdMateria() + " " + "Nombre: " + arraymat.getNombreMateria());

		}
		return arrayMat;

	}

	public void delete() {
		if (menu.existeMateria(materia) == true) {
			nombreMat1 = menu.getNombreMat();
			System.out.println("La Materia : " + nombreMat1 + " ha sido eliminada de la BD");

		} else {
			System.out.println("No existe Materia.");
		}

	}

	public void read() {
		if (menu.existeMateria(materia)) {
			nombreMat1 = menu.getNombreMat();
			System.out.println("Los datos encontrados en la BD son");
			System.out.println(arrayMat);
		}

	}

	public void update() {
		if (menu.existeMateria(materia) == true) {
			nombreMat1 = menu.getNombreMat();
			System.out.println("Asigne nuevo nombre a materia :");
			String nuevoNombreMat = teclado.next();
			menu.setNombreMat(nuevoNombreMat);
			System.out.println("Nuevo nombre actualizado a : " + menu.getNombreMat());
		} else {
			System.out.println("No existe materia");
		}

	}

}
