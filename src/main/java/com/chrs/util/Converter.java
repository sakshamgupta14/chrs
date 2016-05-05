package com.chrs.util;

import com.chrs.dto.UserDTO;
import com.chrs.entities.User;
/**
 * 
 * @author saksham
 *
 */
public class Converter {

	public User UserDTOToUser(UserDTO userDTO) {

		User user = new User();
		user.setEmail(userDTO.getEmail());
		user.setName(userDTO.getName());
		user.setPassword(userDTO.getPassword());
		user.setPassword(userDTO.getPassword());
		user.setSex(userDTO.getGender());
		user.setUsername(userDTO.getUsername());

		Integer salaryRange = 1;
		Integer salary = userDTO.getIncome();

		if (salary < 200000)
			salaryRange = 1;
		else if (salary >= 200000 && salary < 500000)
			salaryRange = 2;
		else if (salary >= 500000 && salary < 1000000)
			salaryRange = 3;
		else
			salaryRange = 4;

		user.setSalaryRange(salaryRange);
		return user;
	}

}
