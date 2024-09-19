package com.debuggeando_ideas.util_function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {
    // Predicate es una interfaz funcional que recibe un argumento de entrada y devuelve un dato booleano
    private final static Predicate<Integer> isGreaterThan100 = n -> n > 100;
    private final static Predicate<Integer> isLessThan10 = n -> n < 10;
    private final static Predicate<Integer> isBetween10And100 = isGreaterThan100.or(isLessThan10);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 10, 50, 100, 150, 200));
        // El método removeIf recibe una implementación de la interfaz funcional Predicate
        //numbers.removeIf(isBetween10And100);
        numbers.removeIf(isBetween10And100.negate());
        System.out.println(numbers);
    }
}
