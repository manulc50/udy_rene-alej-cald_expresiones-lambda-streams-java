package com.debuggeando_ideas.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ExampleBiFuntion {

    public static void main(String... args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        System.out.println(listCombiner(list1, list2, (item1, item2) -> item1 + item2));
    }

    // BiFuntion es una interfaz funcional que recibe 2 argumentos de entrada y devuelve un dato
    private static<T, U, R> List<R> listCombiner(List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {
        List<R> resultList = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++)
            resultList.add(combiner.apply(list1.get(i), list2.get(i)));
        return resultList;
    }
}
