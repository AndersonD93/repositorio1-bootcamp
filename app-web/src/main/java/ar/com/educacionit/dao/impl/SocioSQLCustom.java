package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.impl.ICrud;
import ar.com.educacionit.domain.Socios;

public interface SocioSQLCustom extends ICrud {

	public Socios selectCustom();
}
