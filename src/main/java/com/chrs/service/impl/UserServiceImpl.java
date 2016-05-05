package com.chrs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chrs.dao.UserDAO;
import com.chrs.dto.UserDTO;
import com.chrs.entities.User;
import com.chrs.service.UserService;
import com.chrs.util.Converter;
/**
 * 
 * @author saksham
 *
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	Converter converter = new Converter();

	public Integer addUser(UserDTO userDTO) {

		User user = converter.UserDTOToUser(userDTO);

		return userDAO.saveUser(user);

	}

	public UserDTO getUser(String userName, String password) {

		User user = userDAO.getUser(userName, password);
		if (user != null) {
			UserDTO userDTO = new UserDTO();
			userDTO.setEmail(user.getEmail());
			userDTO.setGender(user.getSex());
			userDTO.setName(user.getName());
			userDTO.setPassword(password);
			userDTO.setUsername(userName);
			return userDTO;
		}
		return null;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
