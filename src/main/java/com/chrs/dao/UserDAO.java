package com.chrs.dao;

import com.chrs.entities.User;
/**
 * 
 * @author saksham
 *
 */
public interface UserDAO {

	Integer saveUser(User user);
	
	User getUser(String username);
	
	User getUser(String username, String password);
	
}
