package com.chrs.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.chrs.dao.DoctorDAO;
import com.chrs.dto.DoctorDTO;
import com.chrs.entities.Doctor;
import com.chrs.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDAO doctorDAO;
	
	public DoctorDTO getDoctorDTO(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public DoctorDTO getAllDoctorDTOs() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer addDoctor(DoctorDTO doctorDTO) {
		
		Doctor doctor = new Doctor();
		BeanUtils.copyProperties(doctorDTO, doctor);
		
		return doctorDAO.addDoctor(doctor);
	}

	public DoctorDAO getDoctorDAO() {
		return doctorDAO;
	}

	public void setDoctorDAO(DoctorDAO doctorDAO) {
		this.doctorDAO = doctorDAO;
	}

}
