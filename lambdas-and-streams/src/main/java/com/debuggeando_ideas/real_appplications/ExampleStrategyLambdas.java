package com.debuggeando_ideas.real_appplications;

import lombok.Builder;
import lombok.Data;

import java.util.List;

public class ExampleStrategyLambdas {
    private static final DiscountStrategy basicDiscount = price -> price * 0.02;
    private static final DiscountStrategy plusDiscount = price -> price * 0.05;
    private static final DiscountStrategy primeDiscount = price -> price * 0.08;

    public static void main(String... args) {
        var product1 = Product.builder()
                .id(1L)
                .name("Beer")
                .price(150.)
                .userType("BASIC")
                .discountStrategy(basicDiscount)
                .build();
        var product2 = Product.builder()
                .id(1L)
                .name("Beer")
                .price(150.)
                .userType("PLUS")
                .discountStrategy(plusDiscount)
                .build();
        var product3 = Product.builder()
                .id(1L)
                .name("Beer")
                .price(150.)
                .userType("PRIME")
                .discountStrategy(primeDiscount)
                .build();

        List.of(product1, product2, product3)
                .forEach(p -> System.out.println("Price: " + p.getPrice() + ",User type: " + p.getUserType() +
                        ", Discount: " + p.getDiscountStrategy().get(p.getPrice())));
    }
}

@FunctionalInterface
interface DiscountStrategy {
    double get(double price);
}

@Data
@Builder
class Product {
    private long id;
    private String name;
    private String userType;
    private double price;
    private DiscountStrategy discountStrategy;
}