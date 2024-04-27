package org.Classwork26_04_24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Words {
    //    2 Напишите метод, который принимает на вход строку и возвращает набор уникальных слов из этой строки.
    public static void main(String[] args) {

    }

    private static Set<String> getUniqueWords(String sentence) {
        return new HashSet<>(Arrays.asList(sentence.split(" ")));
    }

}
