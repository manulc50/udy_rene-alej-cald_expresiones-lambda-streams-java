package com.debuggeando_ideas.method_references;

import java.util.UUID;
import java.util.function.Supplier;

public class StaticMethodReferenceMain {

    public static void main(String[] args) {
        // Supplies es una interfaz funcional que no recibe ningún argumento de entrada y devuelve un dato específico
        //Supplier<UUID> uuid = () -> UUID.randomUUID();
        Supplier<UUID> uuid = UUID::randomUUID;
        System.out.println(uuid.get());
    }
}
