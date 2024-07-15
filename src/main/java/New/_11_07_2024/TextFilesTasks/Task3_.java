package New._11_07_2024.TextFilesTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3_ {
    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int countWords = 0;
            while ((line = reader.readLine()) != null) {
                String[] arrayWords = line.split(" ");
                for (int i = 0; i < arrayWords.length; i++) {
                    if (!arrayWords[i].trim().equals(""))
                        countWords += 1;
                }
            }
            System.out.println("Number of words: " + countWords);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
