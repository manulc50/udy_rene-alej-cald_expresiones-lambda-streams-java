package com.debuggeando_ideas.util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

    public static void main(String[] args) {
        BiFunction<String, String, String> myNormalizeFun1 = (s1, s2) -> s1.toUpperCase() + " - " +
                s2.toLowerCase();
        // BinaryOperator es una interfaz funcional que recibe 2 argumentos de entrada y devuelve un dato pero
        // los tipos de datos de los argumentos de entrada y del dato que se devuelve deben ser iguales.
        // BinaryOperator<T> = BiFunction<T, T, T>. BinaryOperator extiende de la interfaz funcional BiFunction.
        BinaryOperator<String> myNormalizeFun2 = (s1, s2) -> s1.toUpperCase() + " - " + s2.toLowerCase();
        System.out.println(myNormalizeFun1.apply("hola", "mundo"));
        System.out.println(myNormalizeFun2.apply("hola", "mundo"));
    }
}
