package com.chrs.dao;

import java.util.List;

import com.chrs.entities.Field;
/**
 * 
 * @author saksham
 *
 */
public interface FieldDAO {

	Field getField(String name);
	
	Integer addField(Field field);
	
	List<Field> getAllFields();
}
