package com.example.coffeeorder.repository;

import com.example.coffeeorder.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
