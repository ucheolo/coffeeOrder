package com.example.coffeeorder.controller;

import com.example.coffeeorder.domain.CreateOrder;
import com.example.coffeeorder.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/orders")
    public Response<Void> newOrder(
            @RequestBody NewOrderRequest requset
    ) {
        orderService.newOrder(CreateOrder.builder()
                .customerId(requset.getCustomerId())
                .storeId(requset.getStoreId())
                .quantityByProduct(requset.getProducts())
                .build());
        return Response.success(null);
    }
}
