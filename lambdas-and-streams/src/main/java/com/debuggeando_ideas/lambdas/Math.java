package com.debuggeando_ideas.lambdas;

// Nota: Indicar esta anotación es opcional en una interfaz funcional
@FunctionalInterface
public interface Math {
    Double execute(Double a, Double b);

    default Double sum(Double a, Double b) {
        return a + b;
    }
}
