package com.jlcindia.bookprice; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */ 
@Repository 
public interface BookPriceDAO extends JpaRepository<BookPrice,Integer> { 
}