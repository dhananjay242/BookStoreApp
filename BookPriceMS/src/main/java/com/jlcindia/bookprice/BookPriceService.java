package com.jlcindia.bookprice;

import java.util.List;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */ 
public interface BookPriceService { 
public BookPrice getBookPriceById(Integer bookId); 
public double getOfferedPriceById(Integer bookId);
public List<BookPrice> getAllBooks(); 
}
