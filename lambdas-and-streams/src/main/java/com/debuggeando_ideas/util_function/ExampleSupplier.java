package com.debuggeando_ideas.util_function;

import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleSupplier {
    private final static Random random = new Random();
    // Supplier es una interfaz funcional que no recibe ningún argumento de entrada y devuelve un dato
    private final static Supplier<Integer> randomInt = () -> random.nextInt(100);
    private final static Supplier<MyProduct> myProductSupplier = () -> new MyProduct(850, "Smartphone");

    public static void main(String[] args) {
        System.out.println(randomInt.get());
        System.out.println(randomInt.get());
        System.out.println(randomInt.get());
        System.out.println(myProductSupplier.get());
    }
}

@ToString
class MyProduct {
    private final Integer price;
    private final String name;

    public MyProduct(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
}
