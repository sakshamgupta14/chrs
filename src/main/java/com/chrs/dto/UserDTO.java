package com.chrs.dto;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author saksham
 *
 */
public class UserDTO {

	private String name;
	private String username;
	private String email;
	private String password;
	private String gender;
	private List<DoctorDTO> doctorDTOs = new ArrayList<DoctorDTO>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<DoctorDTO> getDoctorDTOs() {
		return doctorDTOs;
	}

	public void setDoctorDTOs(List<DoctorDTO> doctorDTOs) {
		this.doctorDTOs = doctorDTOs;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
