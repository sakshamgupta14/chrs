package com.chrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chrs.dto.DoctorDTO;
import com.chrs.dto.LocationDTO;
import com.chrs.dto.SearchDTO;
import com.chrs.service.DoctorService;

/**
 * 
 * @author saksham
 *
 */
@Controller
public class SearchController {

	@Autowired
	private DoctorService doctorService;
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search(@ModelAttribute SearchDTO searchDTO) {
		
		LocationDTO locationDTO = new LocationDTO();
		locationDTO.setName(searchDTO.getLocationName());
		
		List<DoctorDTO> doctorDTOs = doctorService.getDoctorDTOByLocation(locationDTO);
		
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("doctors", doctorDTOs);
		return modelAndView;
	}


	public DoctorService getDoctorService() {
		return doctorService;
	}


	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
}
