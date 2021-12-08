package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements ICrud{

	public Socios create(Socios socio) {
		
		return new Socios("Carlos", "loez","krlos@gmail.com","direccion",1l);
		
	}

	public Socios create() {
		// TODO Auto-generated method stub
		return null;
	}

}

