package New._11_07_2024.TextFilesTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
//        3. Создайте программу, которая подсчитывает количество слов в текстовом файле.
    public static void main(String[] args) {
        String string = "Alex Kish 1980-11-21";
        System.out.println(countWords(string));

        String fileName = "patiens";
        System.out.println(countWordsInFile(fileName));

        String fileName2 = "Hello.txt";
        System.out.println(countWordsInFile(fileName2));
    }

    public static int countWords(String s) {
        if (s.isEmpty() || s == null) {
            return 0;
        }

        Pattern wordPattern = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]+");
        Matcher matcher = wordPattern.matcher(s);
        int count = 0;

        while (matcher.find()) {
            count++;
        }
        return count;
    }

    //        String[] words = s.split("\\s+");
////        int length = s.split("\\s+").length;
//        return words.length;
//    }
    public static int countWordsInFile(String fileName) {
        int countOfWords = 0;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                countOfWords += countWords(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return countOfWords;
    }
}
