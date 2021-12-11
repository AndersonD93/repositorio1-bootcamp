package ar.com.educacionit.dao.impl;

import ar.com.educacionit.domain.Socios;

public interface ICrud {

	public Socios create(Socios socioACrear);
	
	public Socios findById(Long id);
	
	public Socios[] findAll();
	//despues completo los demas
}