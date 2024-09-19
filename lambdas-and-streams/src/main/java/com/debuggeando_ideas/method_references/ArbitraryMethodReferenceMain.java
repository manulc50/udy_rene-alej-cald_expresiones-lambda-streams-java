package com.debuggeando_ideas.method_references;

import java.util.function.BiPredicate;

public class ArbitraryMethodReferenceMain {

    public static void main(String... args) {
        // BiPredicate es una interfaz funcional que recibe dos argumentos de entrada y devuelve un dato booleano
        //BiPredicate<String, String> equalsPredicate = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> equalsPredicate = String::equals;
        System.out.println(equalsPredicate.test("a", "a"));
    }
}
