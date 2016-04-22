package com.chrs.util;

import com.chrs.dto.UserDTO;
import com.chrs.entities.User;

public class Converter {

	public User UserDTOToUser(UserDTO userDTO) {
		
		User user = new User();
		user.setEmail(userDTO.getEmail());
		user.setName(userDTO.getName());
		user.setPassword(userDTO.getPassword());
		user.setPassword(userDTO.getPassword());
		user.setSex(userDTO.getGender());
		user.setUsername(userDTO.getUsername());
		return user;
	}
	
}
