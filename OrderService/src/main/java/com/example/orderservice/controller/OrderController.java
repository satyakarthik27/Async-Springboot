package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import com.example.orderservice.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
	
	@Autowired
    private OrderService orderService;

    @GetMapping("/order-service")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
