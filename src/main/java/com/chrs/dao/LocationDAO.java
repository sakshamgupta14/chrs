package com.chrs.dao;

import java.util.List;

import com.chrs.entities.Location;

/**
 * 
 * @author saksham
 *
 */

public interface LocationDAO {

	Location getLocation(String name);
	
	Integer addLocation(Location location);
	
	List<Location> getAllLocations();
}