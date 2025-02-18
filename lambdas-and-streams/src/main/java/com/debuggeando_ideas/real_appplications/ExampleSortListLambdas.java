package com.debuggeando_ideas.real_appplications;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExampleSortListLambdas {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 3, 6, 8, 7, 5, 8, 10);
        // Este método sort recibe una implementación de la interfaz Comparator
        //numbers.sort((n1, n2) -> n1 - n2);
        // Versión simplificada de la expresión "(n1, n2) -> Integer.compare(n1, n2)"
        numbers.sort(Integer::compare);
        System.out.println(numbers);

        List<String> names = Arrays.asList("Max", "Alex", "Opal");
        // Versión simplificada de la expresión "(name1, name2) -> name1.compareTo(name2)"
        names.sort(String::compareTo);
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        List<Person> persons = Arrays.asList(
                new Person("Robert", 31),
                new Person("Andy", 32),
                new Person("Ben", 32),
                new Person("Peter", 27)
        );
        //persons.sort((p1, p2) -> p1.getAge() - p2.getAge());
        // Si tienen la misma edad, después se compara por el nombre
        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
        System.out.println(persons);
    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;
}
