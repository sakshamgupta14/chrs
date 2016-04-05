package com.chrs.service;

import com.chrs.dto.DoctorDTO;
/**
 * 
 * @author saksham
 *
 */
public interface DoctorService {

	DoctorDTO getDoctorDTO(String name);

	DoctorDTO getAllDoctorDTOs();

	Integer addDoctor(DoctorDTO doctorDTO);

}
