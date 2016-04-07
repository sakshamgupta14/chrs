package com.chrs.dao;

import com.chrs.entities.Location;

/**
 * 
 * @author saksham
 *
 */

public interface LocationDAO {

	Location getLocation(String name);
}