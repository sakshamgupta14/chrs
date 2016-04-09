package com.chrs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.chrs.dao.DoctorDAO;
import com.chrs.dao.LocationDAO;
import com.chrs.dto.DoctorDTO;
import com.chrs.dto.LocationDTO;
import com.chrs.entities.Doctor;
import com.chrs.entities.Location;
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
		
		if(doctor!=null) {
			DoctorDTO doctorDTO = new DoctorDTO();
			BeanUtils.copyProperties(doctor, doctorDTO);
			return doctorDTO;
		}
		return null;
	}

}
