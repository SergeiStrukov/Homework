package org._2024_05_24.taski2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//уровень 7
public class TASKI2 {

    //Напишите метод, который принимает список чисел и возвращает сумму квадратов всех нечетных чисел в списке.
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
        int sumOfSquaresOfOddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> (int) Math.pow(number, 2))
                .mapToInt(number -> number)
                .sum();
        return sumOfSquaresOfOddNumbers;
    }

    //Напишите метод, который принимает список строк и возвращает список уникальных слов, отсортированных в лексикографическом порядке.
    public static List<String> uniqueSortedWords(List<String> strings) {
        List<String> uniqueSortedWords = strings.stream()
                .flatMap(string -> Arrays.stream(string.split("\\s+")))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return uniqueSortedWords;
    }

    //    //Напишите метод, который принимает список объектов и возвращает новый список, содержащий
//    // только объекты, у которых определенное поле имеет заданное значение.
    public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value) throws NoSuchFieldException {
        if (objects.isEmpty()) {
            return List.of();
        }
        Field field = objects.get(0).getClass().getField(fieldName);
        return objects.stream()
                .filter(object -> {
                            try {
                                Object fieldValue = field.get(object);
                                return value == null ? fieldValue == null : value.equals(fieldValue);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                )
                .collect(Collectors.toList());
        //    //Напишите метод, который принимает список строк и возвращает список строк, содержащих
//    // только уникальные символы (т.е. символы, которые не повторяются в строке).
//    public static List<String> uniqueChars(List<String> strings) {
//
//    }
//    //Напишите метод, который принимает список строк и возвращает самую длинную строку в списке.
//    public static String longestString(List<String> strings) {
//
//    }
//    //Напишите метод, который принимает список объектов и
//    // возвращает среднее значение заданного числового поля всех объектов в списке.
//    public static <T> double averageFieldValue(List<T> objects, String fieldName) throws NoSuchFieldException {
//
//    }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(sumOfSquaresOfOddNumbers(numbers));
        List<String> strings = List.of("banana", "apricot", "cherry", "kiwi", "grape", "apple");
        System.out.println(uniqueSortedWords(strings));
        List<MyObject> objects = List.of(
                new MyObject("Value1"),
                new MyObject("value2")
        );
    }

    static class MyObject {
        public String field;
        public MyObject(String field) {
            this.field = field;
        }
    }
}
