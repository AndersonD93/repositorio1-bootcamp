package ar.com.educacionit.dao;

import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.domain.Users;

public interface UserDao {
	
	public Users gerUserByUserName(String username ) throws GenericException ;

}
