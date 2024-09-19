package com.debuggeando_ideas.method_references;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReferenceMain {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10);
        //IntStream.range(1, 11).forEach(n -> numbers.add(n));
        IntStream.range(1, 11).forEach(numbers::add);
        System.out.println(numbers);
    }
}
