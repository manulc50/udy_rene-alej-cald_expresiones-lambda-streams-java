package com.debuggeando_ideas.util_function;

import java.util.HashSet;
import java.util.Set;

public class ExampleConsumer {

    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);
        Set<Integer> squares = new HashSet<>();
        // El método forEach recibe una implementación de la interfaz funcional Consumer
        // Consumer es una interfaz funcional que recibe un argumento de entrada y no devuelve nada
        numbers.forEach(n -> squares.add(n * n));
        System.out.println(squares);
    }
}
