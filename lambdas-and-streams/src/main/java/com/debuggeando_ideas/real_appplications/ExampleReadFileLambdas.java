package com.debuggeando_ideas.real_appplications;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExampleReadFileLambdas {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/lambdas.txt");
        try(Stream<String> lines = Files.lines(path).onClose(() -> System.out.println("Closing reader"))) {
            // Versión simplificada de la expresión "line -> System.out.println(line)"
            lines.forEach(System.out::println);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
