package com.example.coffeeorder.service;

import com.example.coffeeorder.domain.CreateOrder;
import com.example.coffeeorder.domain.Order;
import com.example.coffeeorder.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void newOrder(CreateOrder createOrder) {
        Order entity = Order.newOrder(createOrder);
        orderRepository.save(entity);
    }
}
