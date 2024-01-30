package com.jlcindia.placeorder;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin // CORS
@RestController
public class OrderController {
	static Logger log = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	OrderService orderService;

	@PostMapping("/placeOrder")
	public void placeOrder(@RequestBody OrderInfo orderInfo) {
		log.info("---OrderController---placeOrder()-----");
		orderService.placeOrder(orderInfo);
	}

	@GetMapping("/getAllPlacedOrders")
	public List<Order> getAllPlacedOrders() {
		log.info("---OrderController---getAllPlacedOrders()-----");
		return orderService.getAllPlacedOrders();
	}

	@GetMapping("/myorders/{userId}")
	public List<Order> getOrdersByUserId(@PathVariable String userId) {
		log.info("---OrderController---getOrdersByUserId()-----");
		List<Order> myoders = orderService.getOrdersByUserId(userId);
		return myoders;
	}
}
