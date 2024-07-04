package com.example.coffeeorder.repository;

import com.example.coffeeorder.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
