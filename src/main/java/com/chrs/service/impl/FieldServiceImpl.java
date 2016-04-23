package com.chrs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chrs.dao.FieldDAO;
import com.chrs.dto.FieldDTO;
import com.chrs.entities.Field;
import com.chrs.service.FieldService;

public class FieldServiceImpl implements FieldService{

	@Autowired
	private FieldDAO fieldDAO;
	
	public FieldDTO getField(String name) {
		
		Field field = fieldDAO.getField(name);
		FieldDTO fieldDTO = new FieldDTO();
		fieldDTO.setName(field.getName());
		fieldDTO.setId(field.getId());
		
		return fieldDTO;
	}

	public List<FieldDTO> getAllFields() {
	
		List<Field> fields = fieldDAO.getAllFields();
		List<FieldDTO> fieldDTOs = new ArrayList<FieldDTO>();
		
		for(Field field : fields) {
			
			FieldDTO fieldDTO = new FieldDTO();
			fieldDTO.setName(field.getName());
			fieldDTO.setId(field.getId());
			
			fieldDTOs.add(fieldDTO);
		}
		
		return fieldDTOs;
	}

	public Integer addField(FieldDTO fieldDTO) {
		
		Field field = new Field();
		field.setName(fieldDTO.getName());
		return fieldDAO.addField(field);
	}

	public FieldDAO getFieldDAO() {
		return fieldDAO;
	}

	public void setFieldDAO(FieldDAO fieldDAO) {
		this.fieldDAO = fieldDAO;
	}

}
