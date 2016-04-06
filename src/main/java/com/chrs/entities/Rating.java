package com.chrs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * 
 * @author saksham
 *
 */
@Entity
@Table(name = "rating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;
	
	@Column
	private Integer salaryRangeVisitors;
	
	@Column
	private Integer nonSalaryRangeVisitors;
	
	@Column
	private Integer salaryRangeRecommendations;
	
	@Column
	private Integer nonSalaryRangeRecommendations;
	
	@Column
	private Double starRating;
	
	@Column
	private Integer noOfRating;

	@Column
	private Double totalRating;

	@OneToOne(fetch = FetchType.EAGER, targetEntity = Doctor.class)
	private Doctor doctor;
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Integer getSalaryRangeVisitors() {
		return salaryRangeVisitors;
	}

	public void setSalaryRangeVisitors(Integer salaryRangeVisitors) {
		this.salaryRangeVisitors = salaryRangeVisitors;
	}

	public Integer getNonSalaryRangeVisitors() {
		return nonSalaryRangeVisitors;
	}

	public void setNonSalaryRangeVisitors(Integer nonSalaryRangeVisitors) {
		this.nonSalaryRangeVisitors = nonSalaryRangeVisitors;
	}

	public Integer getSalaryRangeRecommendations() {
		return salaryRangeRecommendations;
	}

	public void setSalaryRangeRecommendations(Integer salaryRangeRecommendations) {
		this.salaryRangeRecommendations = salaryRangeRecommendations;
	}

	public Integer getNonSalaryRangeRecommendations() {
		return nonSalaryRangeRecommendations;
	}

	public void setNonSalaryRangeRecommendations(Integer nonSalaryRangeRecommendations) {
		this.nonSalaryRangeRecommendations = nonSalaryRangeRecommendations;
	}

	public Double getStarRating() {
		return starRating;
	}

	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}

	public Integer getNoOfRating() {
		return noOfRating;
	}

	public void setNoOfRating(Integer noOfRating) {
		this.noOfRating = noOfRating;
	}

	public Double getTotalRating() {
		return totalRating;
	}

	public void setTotalRating(Double totalRating) {
		this.totalRating = totalRating;
	}

}
