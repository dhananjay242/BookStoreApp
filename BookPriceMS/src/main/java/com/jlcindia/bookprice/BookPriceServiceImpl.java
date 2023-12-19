package com.jlcindia.bookprice;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Service
@Transactional
public class BookPriceServiceImpl implements BookPriceService {

	static Logger log = LoggerFactory.getLogger(BookPriceServiceImpl.class);
	
	@Autowired
	BookPriceDAO bookPriceDAO;

	@Override
	public double getOfferedPriceById(Integer bookId) {

		log.info("---BookPriceServiceImpl---getOfferedPriceById()-----");
		double offerPrice = 0.0;
		Optional<BookPrice> opt = bookPriceDAO.findById(bookId);
		if (opt.isPresent()) {
			BookPrice bookPrice = opt.get();
			double price = bookPrice.getPrice();
			double offer = bookPrice.getOffer();

			if (offer <= 0) {
				return price;
			}
			offerPrice = price - price * offer / 100;
		}
		return offerPrice;
	}

	@Override
	public BookPrice getBookPriceById(Integer bookId) {
		log.info("---BookPriceServiceImpl---getBookPriceById()-----");

		BookPrice bookPrice = null;
		Optional<BookPrice> opt = bookPriceDAO.findById(bookId);
		if (opt.isPresent()) {
			bookPrice = opt.get();
		}
		return bookPrice;
	}

	@Override
	public List<BookPrice> getAllBooks() {
		return bookPriceDAO.findAll();
	}
}