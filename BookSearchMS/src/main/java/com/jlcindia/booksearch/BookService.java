package com.jlcindia.booksearch; 
import java.util.List; 
/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */ 
public interface BookService { 
 public List<Book> getBooks(String author,String category); 
 public BookInfo getBookInfo(Integer bookId); 
 public void updateBookRating(BookRating bookRating); 
 public void updateBookInventory(BookInventory bookInventory); 
}
