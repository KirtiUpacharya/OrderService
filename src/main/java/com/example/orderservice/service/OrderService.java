package com.example.orderservice.service;

import com.example.orderservice.domain.Order;
import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.exception.OrderNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Long customerId, Double totalAmount) {
        Order order = new Order(customerId, totalAmount, "PENDING");
        return orderRepository.save(order);
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with ID: " + id));
    }
} 