package com.debuggeando_ideas.util_function;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperator {
    // Versión simplificada de la expresión "s -> s.toUpperCase()"
    private static final Function<String, String> strToUpperCase1 = String::toUpperCase;
    // UnaryOperator es una interfaz funciona que recibe un argumento de entrada y devuelve un dato del mismo tipo
    // que ese argumento. UnaryOperator<T> = Function<T, T>. Esta interfaz extiende la interfaz funcional Function.
    // Versión simplificada de la expresión "s -> s.toUpperCase()"
    private static final UnaryOperator<String> strToUpperCase2 = String::toUpperCase;
    private static final UnaryOperator<Integer> intToSquare1 = n -> n * n;
    // IntUnaryOperator nos permite trabajar directamente con enteros primitivos. También hay interfaces
    // funcionales de este tipo para el resto de datos primtivos.
    private static final IntUnaryOperator intToSquare2 = n -> n * n;

    public static void main(String[] args) {
        String s = "hola";
        System.out.println(strToUpperCase1.apply(s));
        System.out.println(strToUpperCase2.apply(s));
        System.out.println(intToSquare1.apply(5));
        System.out.println(intToSquare2.applyAsInt(5));
    }
}
