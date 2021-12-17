package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.dao.impl.SociosDao;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.services.SocioService;

public class SocioServiceImpl implements SocioService {
	
	//atributos
	private SocioDaoImpl dao;
	
	
	//Constructores
	public void SociosServiceImpl() {
		//denino que implementacion usar de la interface SociosDao
		this.dao= new SocioDaoImpl();
	}
	

	public Socios getOne(Long id) {
		return null;
	}

	public Socios save(Socios entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void uptate(Socios entity) {
		// TODO Auto-generated method stub
		
	}

	public Socios[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
