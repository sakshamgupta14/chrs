package com.chrs.dto;
/**
 * 
 * @author saksham
 *
 */
public class RatingDTO {

	private Integer salaryRangeVisitors;
	private Integer nonSalaryRangeVisitors;
	private Integer salaryRangeRecommendations;
	private Integer nonSalaryRangeRecommendations;
	private Double starRating;
	private Integer noOfRating;
	private Double totalRating;

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
