package com.chrs.dao;

import com.chrs.entities.Doctor;
import com.chrs.entities.Rating;

/**
 * 
 * @author saksham
 *
 */
public interface RatingDAO {

	Rating getRating(Doctor doctor);
	
	void saveOrUpdateRating(Rating rating);

	Rating getRatingById(Integer id);
}
