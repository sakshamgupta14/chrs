package com.chrs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.chrs.dao.DoctorDAO;
import com.chrs.dao.FieldDAO;
import com.chrs.dao.LocationDAO;
import com.chrs.dao.RatingDAO;
import com.chrs.dto.DoctorDTO;
import com.chrs.dto.LocationDTO;
import com.chrs.dto.SearchDTO;
import com.chrs.entities.Doctor;
import com.chrs.entities.Field;
import com.chrs.entities.Location;
import com.chrs.entities.Rating;
import com.chrs.service.DoctorService;

/**
 * 
 * @author saksham
 *
 */
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDAO doctorDAO;

	@Autowired
	private LocationDAO locationDAO;

	@Autowired
	private FieldDAO fieldDAO;

	@Autowired
	private RatingDAO ratingDAO;
	
	public DoctorDAO getDoctorDAO() {
		return doctorDAO;
	}

	public void setDoctorDAO(DoctorDAO doctorDAO) {
		this.doctorDAO = doctorDAO;
	}

	public LocationDAO getLocationDAO() {
		return locationDAO;
	}

	public void setLocationDAO(LocationDAO locationDAO) {
		this.locationDAO = locationDAO;
	}

	public DoctorDTO getDoctorDTO(String name) {

		Doctor doctor = doctorDAO.getDoctor(name);

		DoctorDTO doctorDTO = new DoctorDTO();
		BeanUtils.copyProperties(doctor, doctorDTO);

		return doctorDTO;
	}

	public DoctorDTO getAllDoctorDTOs() {

		return null;
	}

	public Integer addDoctor(DoctorDTO doctorDTO) {

		Doctor doctor = new Doctor();
		BeanUtils.copyProperties(doctorDTO, doctor);

		Location location = locationDAO.getLocation(doctorDTO.getLocation());
		if (location == null) {
			location = new Location();
			location.setName(doctorDTO.getLocation());
			locationDAO.addLocation(location);
		}
		
		
		Field field = fieldDAO.getField(doctorDTO.getField());

		if (field == null) {
			field = new Field();
			field.setName(doctorDTO.getField());
			fieldDAO.addField(field);
		}


		Rating rating = new Rating();
		rating.setDoctor(doctor);
		rating.setTotalRating(new Double(1));
		
		ratingDAO.saveOrUpdateRating(rating);
		doctor.setRating(rating);
		doctor.setField(field);
		doctor.setLocation(location);

		return doctorDAO.addDoctor(doctor);
	}

	public List<DoctorDTO> getDoctorDTOByLocation(LocationDTO locationDTO) {

		Location location = locationDAO.getLocation(locationDTO.getName());
		List<Doctor> doctors = doctorDAO.getAllDoctors(location);

		List<DoctorDTO> doctorDTOs = new ArrayList<DoctorDTO>();

		for (Doctor doctor : doctors) {

			DoctorDTO doctorDTO = new DoctorDTO();
			BeanUtils.copyProperties(doctor, doctorDTO);
			doctorDTOs.add(doctorDTO);
		}

		return doctorDTOs;
	}

	public DoctorDTO getDoctorDTO(Integer id) {

		Doctor doctor = doctorDAO.getDoctor(id);

		if (doctor != null) {
			DoctorDTO doctorDTO = new DoctorDTO();
			BeanUtils.copyProperties(doctor, doctorDTO);
			return doctorDTO;
		}
		return null;
	}

	public FieldDAO getFieldDAO() {
		return fieldDAO;
	}

	public void setFieldDAO(FieldDAO fieldDAO) {
		this.fieldDAO = fieldDAO;
	}

	public List<DoctorDTO> getDoctorBySearchDTO(SearchDTO searchDTO) {

		Field field = fieldDAO.getField(searchDTO.getService());
		Location location = locationDAO.getLocation(searchDTO.getLocationName());

		List<Doctor> doctors = doctorDAO.getAllDoctorsByType(field, location);

		List<DoctorDTO> doctorDTOs = new ArrayList<DoctorDTO>();

		for (Doctor doctor : doctors) {

			DoctorDTO doctorDTO = new DoctorDTO();
			BeanUtils.copyProperties(doctor, doctorDTO);
			doctorDTOs.add(doctorDTO);
		}

		return doctorDTOs;
	}

	public RatingDAO getRatingDAO() {
		return ratingDAO;
	}

	public void setRatingDAO(RatingDAO ratingDAO) {
		this.ratingDAO = ratingDAO;
	}

}
