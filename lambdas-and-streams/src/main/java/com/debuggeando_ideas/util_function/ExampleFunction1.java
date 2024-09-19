package com.debuggeando_ideas.util_function;

import java.util.function.Function;

public class ExampleFunction1 {
    // Function es una interfaz funcional que recibe un argumento de entrada y devuelve un dato
    private static final Function<Integer, Integer> multiply = n -> n * 10;
    private static final Function<Integer, Integer> sum = n -> n + 10;
    // Aplica primero la función "multiply" y, después, aplica la función "sum" al resultado obtenido
    private static final Function<Integer, Integer> andThenMultiply = multiply.andThen(sum);
    // Aplica primero la función "sum" y, después, aplica la función "multiply" al resultado obtenido
    private static final Function<Integer, Integer> composeMultiply = multiply.compose(sum);

    public static void main(String[] args) {
        System.out.println(multiply.apply(5));
        System.out.println(sum.apply(5));
        System.out.println(andThenMultiply.apply(5));
        System.out.println(composeMultiply.apply(5));
    }
}
