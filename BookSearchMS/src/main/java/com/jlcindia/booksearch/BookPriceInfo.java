package com.jlcindia.booksearch;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
public class BookPriceInfo {
	private Integer bookId;
	private double price;
	private double offer;

	public BookPriceInfo() {
		super();
	}

	public BookPriceInfo(Integer bookId, double price, double offer) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.offer = offer;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}

}
