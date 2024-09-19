package com.debuggeando_ideas.lambdas;

// Nota: Indicar esta anotación es opcional en una interfaz funcional
@FunctionalInterface
public interface Printer<T> {
    void print(T toPrint);
}
