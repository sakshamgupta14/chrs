package com.chrs.service;

import com.chrs.dto.UserDTO;
/**
 * 
 * @author saksham
 *
 */
public interface UserService {

	Integer addUser(UserDTO userDTO);
	
	UserDTO getUser(String userName, String password);
	
}
