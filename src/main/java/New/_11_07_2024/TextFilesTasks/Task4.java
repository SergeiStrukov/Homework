package New._11_07_2024.TextFilesTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    //4. Напишите программу, которая находит и выводит самое длинное слово в текстовом файле.
    public static void main(String[] args) {
        String fileName = "patiens";
        System.out.println(findMaxLengthWordInFile(fileName));
    }

    public static String findLongestWord(String s) {
        if (s.isEmpty() || s == null) {
            return "";
        }

        Pattern wordPattern = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]+");
        Matcher matcher = wordPattern.matcher(s);
        String longestWord = "";

        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    //        String[] words = s.split("\\s+");
////        int length = s.split("\\s+").length;
//        return words.length;
//    }
    public static String findMaxLengthWordInFile(String fileName) {
        String longestWord = "";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String longestWordInLine = findLongestWord(line);
                if (longestWordInLine.length() > longestWord.length()){
                    longestWord = longestWordInLine;
                }
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
        return longestWord;
    }
}
