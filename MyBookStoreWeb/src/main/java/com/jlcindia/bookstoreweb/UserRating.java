package com.jlcindia.bookstoreweb;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
public class UserRating {
	private Integer ratingId;
	private String userId;
	private Integer bookId;
	private double rating;
	private String review;

	public UserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRating(Integer ratingId, String userId, Integer bookId, double rating, String review) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.bookId = bookId;
		this.rating = rating;
		this.review = review;
	}

	public Integer getRatingId() {
		return ratingId;
	}

	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
