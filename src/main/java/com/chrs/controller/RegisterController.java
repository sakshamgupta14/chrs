package com.chrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chrs.dto.DoctorDTO;
import com.chrs.dto.FieldDTO;
import com.chrs.dto.LocationDTO;
import com.chrs.dto.UserDTO;
import com.chrs.service.DoctorService;
import com.chrs.service.FieldService;
import com.chrs.service.LocationService;
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

	@Autowired
	private LocationService locationService;

	@Autowired
	private FieldService fieldService;
	
	@RequestMapping(value = "/register")
	public ModelAndView register() {

		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}

	@RequestMapping(value = "/registeruser")
	public ModelAndView registerUser(@ModelAttribute UserDTO userDTO) {

		userService.addUser(userDTO);

		ModelAndView modelAndView = new ModelAndView("index");

		List<LocationDTO> locationDTOs = getLocationService().getAllLocationDTOs();
		List<FieldDTO> fieldDTOs = fieldService.getAllFields();

		modelAndView.addObject("fields", fieldDTOs);
		modelAndView.addObject("locations", locationDTOs);
		return modelAndView;
	}

	@RequestMapping(value = "/registerdoc")
	public ModelAndView registerDoctor(@ModelAttribute DoctorDTO doctorDTO) {

		doctorService.addDoctor(doctorDTO);

		ModelAndView modelAndView = new ModelAndView("index");

		List<LocationDTO> locationDTOs = getLocationService().getAllLocationDTOs();
		List<FieldDTO> fieldDTOs = getFieldService().getAllFields();

		modelAndView.addObject("fields", fieldDTOs);
		modelAndView.addObject("locations", locationDTOs);
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

	public LocationService getLocationService() {
		return locationService;
	}

	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}

	public FieldService getFieldService() {
		return fieldService;
	}

	public void setFieldService(FieldService fieldService) {
		this.fieldService = fieldService;
	}

}
