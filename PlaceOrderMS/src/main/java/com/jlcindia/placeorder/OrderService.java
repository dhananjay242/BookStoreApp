package com.jlcindia.placeorder; 
import java.util.List; 
/* 
* @Author : Srinivas Dande 
* @company : Java Learning Center 
* */ 
public interface OrderService { 
public void placeOrder(OrderInfo orderInfo) ; 
public List<Order> getOrdersByUserId(String userId);
public List<Order> getAllPlacedOrders(); 
} 