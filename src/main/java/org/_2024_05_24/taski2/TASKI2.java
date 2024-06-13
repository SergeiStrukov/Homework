package org._2024_05_24.taski2;

import org._2024_05_24.taski1.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//уровень 7
public class TASKI2 {

    //Напишите метод, который принимает список чисел и
    // возвращает сумму квадратов всех нечетных чисел в списке.
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
        int sumOfSquaresOfOddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> (int) Math.pow(number, 2))
                .mapToInt(number -> number)
                .sum();
        return sumOfSquaresOfOddNumbers;
    }

    // Напишите метод, который принимает список строк и
    // возвращает список уникальных слов, отсортированных
    // в лексикографическом порядке.
    public static List<String> uniqueSortedWords(List<String> strings) {
        List<String> uniqueSortedWords = strings.stream()
                .flatMap(string -> Arrays.stream(string.split("\\s+")))
                .distinct()
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        return uniqueSortedWords;
    }

    //    //Напишите метод, который принимает список объектов и возвращает новый список, содержащий
//    // только объекты, у которых определенное поле имеет заданное значение.
//    public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value) throws NoSuchFieldException {
//        return objects.stream()
//                .map(el->el.getClass().getDeclaredField())
//                .filter(field -> )
    public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value) throws NoSuchFieldException {

        return objects.stream()
                .filter(obj -> {
                    try {
                        Field field = obj.getClass().getDeclaredField(fieldName);
                        field.setAccessible(true);
                        Object fieldValue = field.get(obj);
                        return value.equals(fieldValue);
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());
    }
//    }

    //Напишите метод, который принимает список строк и возвращает список строк, содержащих
    // только уникальные символы (т.е. символы, которые не повторяются в строке).
    public static List<String> uniqueChars(List<String> strings) {
        return strings.stream()
                .filter(s -> (s.chars().distinct().count() == s.length()))
                .collect(Collectors.toList());
    }

    //    //Напишите метод, который принимает список строк и возвращает самую длинную строку в списке.
    public static String longestString(List<String> strings) {
        return strings.stream()
                .sorted((el1, el2) -> el2.length() - el1.length())
                .limit(1)
                .collect(Collectors.joining());
    }
//    //Напишите метод, который принимает список объектов и
//    // возвращает среднее значение заданного числового поля всех объектов в списке.
//    public static <T> double averageFieldValue(List<T> objects, String fieldName) throws NoSuchFieldException {
//
//    }

    public static void main(String[] args) throws NoSuchFieldException {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(sumOfSquaresOfOddNumbers(numbers));
        List<String> strings = List.of("banana", "apricot banana", "cherry", "kiwi kiwi", "grape", "apple");
        System.out.println(uniqueSortedWords(strings));
        List<MyObject> objects = List.of(
                new MyObject("Value1"),
                new MyObject("value2"),
                new MyObject("Value1")
        );
        List<MyObject> filteredObjects = filterByField(objects, "fieldName", "Value1");
        filteredObjects.forEach(obj -> System.out.println(obj.fieldName));
        System.out.println(uniqueChars(strings));
        System.out.println(longestString(strings));
    }

    static class MyObject {
        public String fieldName;

        public MyObject(String field) {
            this.fieldName = field;
        }
    }
}
