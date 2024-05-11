package org.Classwork26_04_24;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    //    Реализуйте метод, который принимает на вход строку и возвращает Map,
//    где ключ - это слово, а значение - количество его повторений в строке.
    public static void main(String[] args) {
        System.out.println(getWordRepetition(
                "We are riding riding in the house"
        ));
    }

    public static Map<String, Integer> getWordRepetition(String sentence) {
        Map<String, Integer> wordToCount = new HashMap<>();
        for (String word : sentence.split(" ")) {
            if (wordToCount.containsKey(word)) {
                int current = wordToCount.get(word);
                wordToCount.put(word, current + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }
        return wordToCount;
    }
}
