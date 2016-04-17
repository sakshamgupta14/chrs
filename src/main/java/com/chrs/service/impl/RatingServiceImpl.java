package com.chrs.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.chrs.dao.DoctorDAO;
import com.chrs.dao.RatingDAO;
import com.chrs.dto.DoctorDTO;
import com.chrs.dto.RatingDTO;
import com.chrs.entities.Doctor;
import com.chrs.entities.Rating;
import com.chrs.service.RatingService;

/**
 * 
 * @author saksham
 *
 */
public class RatingServiceImpl implements RatingService {

	@Autowired
	private DoctorDAO doctorDAO;

	@Autowired
	private RatingDAO ratingDAO;

	public void saveOrUpdateRating(RatingDTO ratingDTO) {

		Rating rating = new Rating();
		rating.setDoctor(doctorDAO.getDoctor(ratingDTO.getDoctorDTO().getId()));

		// rating.setNonSalaryRangeRecommendations(nonSalaryRangeRecommendations);
	}

	public DoctorDAO getDoctorDAO() {
		return doctorDAO;
	}

	public void setDoctorDAO(DoctorDAO doctorDAO) {
		this.doctorDAO = doctorDAO;
	}

	public RatingDAO getRatingDAO() {
		return ratingDAO;
	}

	public void setRatingDAO(RatingDAO ratingDAO) {
		this.ratingDAO = ratingDAO;
	}

	public RatingDTO getRatingDTO(DoctorDTO doctorDTO) {

		Doctor doctor = doctorDAO.getDoctor(doctorDTO.getId());

		Rating rating = ratingDAO.getRating(doctor);

		RatingDTO ratingDTO = new RatingDTO();
		BeanUtils.copyProperties(rating, ratingDTO);

		return ratingDTO;
	}

}
