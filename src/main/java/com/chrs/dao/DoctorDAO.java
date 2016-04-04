package com.chrs.dao;

import java.util.List;

import com.chrs.entities.Doctor;
import com.chrs.entities.Location;

public interface DoctorDAO {

	Integer addDoctor(Doctor doctor);
	
	Doctor getDoctor(String name);
	
	List<Doctor> getAllDoctors(Location location);
	
}
