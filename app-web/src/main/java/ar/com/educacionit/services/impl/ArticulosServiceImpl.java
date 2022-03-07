package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.impl.ArticulosDaoImpl;
import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.SociosService;

public class ArticulosServiceImpl extends AbstractBaseService<Articulos> implements ArticulosService {

	public ArticulosServiceImpl() {
		super(new ArticulosDaoImpl());
	}
	
}
