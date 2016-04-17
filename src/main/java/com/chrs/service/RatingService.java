package com.chrs.service;

import com.chrs.dto.DoctorDTO;
import com.chrs.dto.RatingDTO;

/**
 * 
 * @author saksham
 *
 */
public interface RatingService {

	void saveOrUpdateRating(RatingDTO ratingDTO);
	
	RatingDTO getRatingDTO(DoctorDTO doctorDTO);
}
