package com.chrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chrs.dto.DoctorDTO;
import com.chrs.dto.FieldDTO;
import com.chrs.dto.LocationDTO;
import com.chrs.dto.RatingDTO;
import com.chrs.dto.SearchDTO;
import com.chrs.service.DoctorService;
import com.chrs.service.FieldService;
import com.chrs.service.LocationService;
import com.chrs.service.RatingService;

/**
 * 
 * @author saksham
 *
 */
@Controller
public class SearchController {

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private RatingService ratingService;

	@Autowired
	private LocationService locationService;

	@Autowired
	private FieldService fieldService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search(@ModelAttribute SearchDTO searchDTO) {

	/*	LocationDTO locationDTO = new LocationDTO();
		locationDTO.setName(searchDTO.getLocationName());

		List<DoctorDTO> doctorDTOs = doctorService.getDoctorDTOByLocation(locationDTO);
*/
		List<DoctorDTO> doctorDTOs = doctorService.getDoctorBySearchDTO(searchDTO);
		ModelAndView modelAndView = new ModelAndView("result");
		modelAndView.addObject("doctors", doctorDTOs);
		return modelAndView;
	}

	@RequestMapping(value = "/viewdoctor/{id}")
	public ModelAndView ratingUpdateOnClick(@PathVariable("id") Integer id) {

		DoctorDTO doctorDTO = doctorService.getDoctorDTO(id);
/*
		RatingDTO ratingDTO = ratingService.getRatingDTO(doctorDTO);
		ratingDTO.setDoctorDTO(doctorDTO);
		ModelAndView modelAndView = new ModelAndView("");

		modelAndView.addObject("doctor", doctorDTO);
		modelAndView.addObject("rating", ratingDTO);

		return modelAndView;*/
		RatingDTO ratingDTO = new RatingDTO();
		ratingDTO.setDoctorDTO(doctorDTO);
		
		ratingService.saveOrUpdateRating(ratingDTO);
		
		ModelAndView modelAndView = new ModelAndView("viewdoctor");
		
		modelAndView.addObject("doctors", doctorDTO);
		return modelAndView;
		

	}

	@RequestMapping(value = "/home")
	public ModelAndView home() {

		ModelAndView modelAndView = new ModelAndView("index");

		List<LocationDTO> locationDTOs = locationService.getAllLocationDTOs();
		List<FieldDTO> fieldDTOs = fieldService.getAllFields();

		modelAndView.addObject("fields", fieldDTOs);
		modelAndView.addObject("locations", locationDTOs);
		return modelAndView;

	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView modelAndView = new ModelAndView("contact_us");

		
		return modelAndView;
	}
	
	public DoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	public RatingService getRatingService() {
		return ratingService;
	}

	public void setRatingService(RatingService ratingService) {
		this.ratingService = ratingService;
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
