package com.jlcindia.bookstoreweb;

import java.util.*;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
public interface BookStoreService {
	public List<String> getAuthorsList();

	public List<String> getCategoryList();

	public List<Book> getMyBooks(String author, String category);

	public Book getBookByBookId(Integer bookId);

	public BookInfo getBookInfoByBookId(Integer bookId);

	public void placeOrder(Map<Integer, Book> mycartMap);

	public List<Order> getMyOrders(String userId);

	public void addUserRating(UserRating userRating);

	public List<UserRating> getMyRatings(String userId);
}
