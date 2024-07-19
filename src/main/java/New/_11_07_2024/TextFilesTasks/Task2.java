package New._11_07_2024.TextFilesTasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    //    2. Напишите программу, которая читает содержимое текстового файла и выводит его на экран.
    public static void main(String[] args) {
        String fileName = "Hello.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while (((line = reader.readLine()) != null)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
