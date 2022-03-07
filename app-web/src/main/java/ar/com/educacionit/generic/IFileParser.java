package ar.com.educacionit.generic;

import java.util.Collection;

public interface IFileParser<T> {
	
	public T parse() throws ParseException;
	//public Collection<T>parseFile();

}
