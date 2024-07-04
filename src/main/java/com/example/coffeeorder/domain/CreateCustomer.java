package com.example.coffeeorder.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateCustomer {
    private String name;
    private String address;
    private String phoneNumber;
}