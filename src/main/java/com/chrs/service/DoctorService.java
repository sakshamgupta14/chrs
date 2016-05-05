package com.chrs.service;

import java.util.List;

import com.chrs.dto.DoctorDTO;
import com.chrs.dto.LocationDTO;
import com.chrs.dto.SearchDTO;
/**
 * 
 * @author saksham
 *
 */
public interface DoctorService {

	DoctorDTO getDoctorDTO(String name);

	DoctorDTO getAllDoctorDTOs();

	Integer addDoctor(DoctorDTO doctorDTO);

	List<DoctorDTO> getDoctorDTOByLocation(LocationDTO locationDTO);
	
	DoctorDTO getDoctorDTO(Integer id);
	
	List<DoctorDTO> getDoctorBySearchDTO(SearchDTO searchDTO);
}
