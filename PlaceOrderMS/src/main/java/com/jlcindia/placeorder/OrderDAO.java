package com.jlcindia.placeorder;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */
@Repository
public interface OrderDAO extends JpaRepository<Order, Integer> {
	List<Order> findOrdersByUserId(String userId);
}