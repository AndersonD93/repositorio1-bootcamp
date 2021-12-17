package ar.com.educacionit.dao.impl;

import ar.com.educacionit.domain.Socios;

public interface SociosDao {
	
	public Socios getOne(Long id);

	public Socios save(Socios entity);
	
	public void delete(Long id);
	
	public void uptate (Socios entity);
	
	public Socios[] findAll();

}
