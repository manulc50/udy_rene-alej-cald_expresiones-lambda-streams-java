package com.debuggeando_ideas.util_function;

import java.util.Map;

public class ExampleBiConsumer {

    public static void main(String[] args) {
        Map<Boolean, String> map = Map.ofEntries(Map.entry(true, "This is the truth"),
                Map.entry(false, "This is the lie"));
        // Este método forEach recibe una implementación de la interfaz BiConsumer
        // BiConsumer es una interfaz funcional que recibe 2 argumentos de entrada y no devuelve nada
        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
