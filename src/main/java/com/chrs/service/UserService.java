package com.chrs.service;

import com.chrs.dto.UserDTO;

public interface UserService {

	Integer addUser(UserDTO userDTO);
	
	UserDTO getUser(String userName, String password);
	
}
