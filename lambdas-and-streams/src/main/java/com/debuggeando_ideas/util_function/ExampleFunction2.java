package com.debuggeando_ideas.util_function;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class ExampleFunction2 {
    private final static Function<Person, ByteArrayOutputStream> serializer = person -> {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        try(ObjectOutputStream outputStream = new ObjectOutputStream(bytes)) {
            outputStream.writeObject(person);
            outputStream.flush();
            return bytes;
        }
        catch(IOException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    };

    private final static Function<ByteArrayInputStream, Person> deserializer = bytes -> {
        try(ObjectInputStream inputStream = new ObjectInputStream(bytes)) {
            return (Person) inputStream.readObject();
        }
        catch(IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    };

    public static void main(String[] args) {
        ByteArrayOutputStream serializedPerson = serializer.apply(new Person("Max", 26));
        System.out.println(Arrays.toString(serializedPerson.toByteArray()));
        Person person = deserializer.apply(new ByteArrayInputStream(serializedPerson.toByteArray()));
        System.out.println(person);
    }
}

@ToString
class Person implements Serializable {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
