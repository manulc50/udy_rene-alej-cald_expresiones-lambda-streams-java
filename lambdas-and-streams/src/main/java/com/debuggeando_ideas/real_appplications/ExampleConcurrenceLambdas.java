package com.debuggeando_ideas.real_appplications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleConcurrenceLambdas {
    // Runnable es una interfaz funcional que no recibe ningún argumento de entrada y no devuelve ningún dato
    private static final Runnable printSum = () -> {
        long total = 0;
        for(int i = 0; i < 1_000_000; i++)
            total += i;
        System.out.println(Thread.currentThread().getName() + " - Total: " + total);
    };

    // Callable es una interfaz funcional que no recibe ningún argumento de entrada y devuelve un dato
    private static final Callable<Long> getSum = () -> {
        long total = 0;
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 1_000_000; i++)
            total += i;
        return total;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // Este método submit recibe una implementación de la interfaz funcional Runnable o de la interfaz funcional
        // Callable
        executorService.submit(printSum);
        System.out.println("Total: " + executorService.submit(getSum).get());
        executorService.shutdown();
    }
}
