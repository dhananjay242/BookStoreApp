package com.jlcindia.booksearch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Repository
public interface BookRatingDAO extends JpaRepository<BookRating, Integer> {
}