package com.chrs.service;

import java.util.List;

import com.chrs.dto.FieldDTO;
/**
 * 
 * @author saksham
 *
 */
public interface FieldService {

	FieldDTO getField(String name);
	
	List<FieldDTO> getAllFields();
	
	Integer addField(FieldDTO fieldDTO);
}
