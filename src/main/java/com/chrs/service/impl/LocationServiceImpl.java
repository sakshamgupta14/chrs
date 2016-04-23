package com.chrs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chrs.dao.LocationDAO;
import com.chrs.dto.LocationDTO;
import com.chrs.entities.Location;
import com.chrs.service.LocationService;

public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationDAO locationDAO;
	
	public List<LocationDTO> getAllLocationDTOs() {
		
		List<Location> locations = locationDAO.getAllLocations();
		List<LocationDTO> locationDTOs = new ArrayList<LocationDTO>();
		
		for(Location location : locations) {
			LocationDTO locationDTO = new LocationDTO();
			locationDTO.setName(location.getName());
			locationDTOs.add(locationDTO);
		}
		return locationDTOs;
	}

	public LocationDAO getLocationDAO() {
		return locationDAO;
	}

	public void setLocationDAO(LocationDAO locationDAO) {
		this.locationDAO = locationDAO;
	}


}
