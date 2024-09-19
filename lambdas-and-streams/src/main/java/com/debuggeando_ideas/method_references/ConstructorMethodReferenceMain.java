package com.debuggeando_ideas.method_references;

import lombok.ToString;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class ConstructorMethodReferenceMain {

    public static void main(String... args) {
        // Supplies es una interfaz funcional que no recibe ningún argumento de entrada y devuelve un dato específico
        //Supplier<MyObject> newMyObject = () -> new MyObject();
        Supplier<MyObject> newMyObject = MyObject::new;
        System.out.println(newMyObject.get());
    }
}

@ToString
class MyObject {
    private final String string;
    private final Integer num;

    public MyObject() {
        this.string = UUID.randomUUID().toString();
        this.num = new Random().nextInt(1000);
    }
}