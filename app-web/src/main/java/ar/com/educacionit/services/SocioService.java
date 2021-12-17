package ar.com.educacionit.services;

import ar.com.educacionit.domain.Socios;

public interface SocioService {
	
	public Socios getOne(Long id);

	public Socios save(Socios entity);
	
	public void delete(Long id);
	
	public void uptate (Socios entity);
	
	public Socios[] findAll();

}
