package gestorAlumnos;

import java.util.ArrayList;

public interface IcrudGeneric<T> {

	public ArrayList<T> create();

	public void delete();

	public void read();

	public void update();

}
