package com.jlcindia.booksearch;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {
	public List<Book> getBooksByAuthorAndCategory(String author, String category);

	public List<Book> getBooksByAuthor(String author);

	public List<Book> getBooksByCategory(String category);
}
