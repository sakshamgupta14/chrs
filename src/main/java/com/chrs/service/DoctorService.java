package com.chrs.service;

import com.chrs.dto.DoctorDTO;

public interface DoctorService {

	DoctorDTO getDoctorDTO(String name);

	DoctorDTO getAllDoctorDTOs();

	Integer addDoctor(DoctorDTO doctorDTO);

}
