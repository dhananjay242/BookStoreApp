package com.jlcindia.userratings;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@CrossOrigin // CORS
@RestController
public class RatingController {

	static Logger log = LoggerFactory.getLogger(RatingController.class);

	@Autowired
	RatingService ratingService;

	@PutMapping("/addUserRating")
	public void addUserRating(@RequestBody UserRating userRating) {
		log.info("---RatingController---addUserRating()-----");

		ratingService.addUserRating(userRating);
	}

	@GetMapping("/userRatings/{userId}")
	public List<UserRating> getUserRatingByUserId(@PathVariable String userId) {
		log.info("---RatingController---getUserRatingByUserId()-----");

		return ratingService.getUserRatingByUserId(userId);
	}

	@GetMapping("/bookRatings/{bookId}")
	public BookRating getBookRatingByBookId(@PathVariable String bookId) {
		log.info("---RatingController---getBookRatingByBookId()-----");

		return ratingService.getBookRatingByBookId(Integer.parseInt(bookId));
	}
}
