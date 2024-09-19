package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.Product;

import java.util.List;

public class LambdasMain {

    public static void main(String... args) {
        // Implementación medinate una clase anónima
        Math subtract = new Math() {

            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }

            @Override
            public Double sum(Double a, Double b) {
                return a + b + 2;
            }
        };

        // Implementación medinate una función lambda
        Math multiply = (a, b) -> a * b;

        Math divide = (Double a, Double b) -> {
            System.out.println("Start Division");
            return a / b;
        };

        Math plus = (var a, var b) -> a + b;

        System.out.println(subtract.execute(5., 2.5));
        System.out.println(subtract.sum(5., 2.5));
        System.out.println(multiply.execute(10.0, 10.0));
        System.out.println(multiply.sum(10.0, 10.0));
        System.out.println(divide.execute(500., 5.));
        System.out.println(plus.execute(30.5, 10.2));

        Printer<String> stringPrinter = str -> System.out.println(str);
        Printer<Product> productPrinter = product -> System.out.println(product);

        stringPrinter.print("Hola Mundo");

        Product product = new Product();
        product.setId(100L);
        product.setName("Smartphone");
        product.setPrice(850.70);
        productPrinter.print(product);

        List<String> countries = List.of("Mexico", "Colombia", "España", "Alemania", "Argentina");

        for(String country: countries)
            System.out.println(country);

        countries.forEach(country -> System.out.println(country.toUpperCase()));
    }
}
