package New._11_07_2024.TextFilesTasks;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Task {
    //    1. Создайте программу,
//    которая записывает строку "Привет, мир!" в текстовый файл.
    public static void main(String[] args) {
        String inputFile = "Hello.txt";
        createInputFile(inputFile);
    }

    public static void createInputFile(String filename) {
        List<String> lines = Arrays.asList(
                "Привет, мир!");
        try {
            Files.write(Paths.get(filename), lines);
            System.out.println("Исходный файл создан: " + filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
