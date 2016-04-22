package com.chrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chrs.dto.DoctorDTO;
import com.chrs.dto.UserDTO;
import com.chrs.service.DoctorService;
import com.chrs.service.UserService;

/**
 * 
 * @author saksham
 *
 */
@Controller
public class RegisterController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private DoctorService doctorService;
	@RequestMapping(value = "/register")
	public ModelAndView register() {
		
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}
	
	@RequestMapping(value = "/registeruser")
	public ModelAndView registerUser(@ModelAttribute UserDTO userDTO) {
		
		userService.addUser(userDTO);
		
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/registerdoc")
	public ModelAndView registerDoctor(@ModelAttribute DoctorDTO doctorDTO) {
		
		doctorService.addDoctor(doctorDTO);

		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/register/user")
	public ModelAndView registerUs() {
		
		ModelAndView modelAndView = new ModelAndView("register_user");
		return modelAndView;
	}
	
	@RequestMapping(value = "/register/doctor")
	public ModelAndView registerDoc() {
		
		ModelAndView modelAndView = new ModelAndView("register_doctor");
		return modelAndView;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public DoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

}
