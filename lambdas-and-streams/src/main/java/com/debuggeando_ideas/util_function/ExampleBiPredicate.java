package com.debuggeando_ideas.util_function;

import java.util.function.BiPredicate;

public class ExampleBiPredicate {
    // BiPredicate es una interfaz funcional que recibe 2 argumentos de entrada y devuelve un dato booleano
    private final static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equals("HelloWorld");

    public static void main(String... args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(myEquals.test(s1, s2));
    }
}
