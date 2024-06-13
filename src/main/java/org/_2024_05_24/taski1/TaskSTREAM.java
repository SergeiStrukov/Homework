//package org._2024_05_24.taski1; //package PROF.streams.streams.taski1;
package org._2024_05_24.taski1;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//
//import java.util.*;
//import java.util.function.Function;
//import java.util.stream.Collectors;
////уровень 3
public class TaskSTREAM {
    /**
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     * -- Отфильтровать нв четные и не четные
     * -- Просуммировать все числа
     * -- Получить среднее значение
     * -- Найти суммы чисел кратных 3 и 5
     * <p>
     * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
     * -- Преобразовать список строк в список чисел
     * <p>
     * <p>
     * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi")
     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
     * -- Получить список слов которые содержат только уникальные символы
     * <p>
     * class Person {
     * String name
     * int age
     * }
     * <p>
     * -- Сделать из списка объектов список имен и отфильтровать по возрасту
     */
//
//    //Задание 1: Фильтрация списка целых чисел на нечетные числа
    public static void m1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers); // [1, 3, 5, 7, 9]
    }

    //
    //Задание 2: Преобразование списка строк в список чисел
    public static void m2() {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        List<Integer> numbers = strings.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        System.out.println(numbers); // [1, 2, 3, 4, 5]
    }

    //
//    //Задание 3: Суммирование списка чисел
    public static void m3() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce((acc, cur) -> acc + cur).get();
        System.out.println(sum); // 15
    }

    //
    //Задание 4: Определение максимального значения в списке
    private static void m4() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int max = numbers.stream()
                .max((a, b) -> a.compareTo(b)).get();
        System.out.println(max); // 5
    }

    //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
    private static void m5() {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        strings.stream()
                .filter(string -> string.startsWith("a"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
    }

    //
    //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
    private static void m6() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> result =
                words.stream()
                        .filter(el -> el.length() > 4)
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(result);
    }

    //
    //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    private static void m7() {
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        List<String> names =
                people.stream()
                        .sorted((a, b) -> a.getAge() - b.getAge())
                        .map(el -> el.getName())
                        .collect(Collectors.toList());
        System.out.println(names); // [Alice, John, Bob]
    }

    //
    //Задание 8:Нахождение суммы чисел, кратных 3 или 5, из списка чисел
    private static void m8() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum =
                numbers.stream()
                        .filter(number -> number % 3 == 0 || number % 5 == 0)
                        .mapToInt(number -> number)
                        .sum();
        System.out.println(sum); // 33 (3 + 5 + 6 + 9 + 10)
    }

    //
    //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
    private static void m9() {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "grape");
        List<String> result = words.stream()
                .filter(el -> el.chars().distinct().count() == el.length())
                .collect(Collectors.toList());
        System.out.println(result); // [kiwi, grape]
    }

    //
    //Задание 10:
    private static void m10(String[] strings) {
        Map<Character, Long> characterFrequency =
                Arrays.stream(strings)
                        .flatMapToInt(CharSequence::chars)
                        .mapToObj(el -> (char) el)
//                        .collect(Collectors.toList());
                        .peek(el -> System.out.println(el))
//                        .
//                .count();
                        .collect(Collectors.groupingBy(i -> i,
                                Collectors.counting()));
        characterFrequency.forEach((character, count) -> System.out.println(character + ":" + count));

    }

//                        .collect();
//                Напишите метод, который принимает массив строк и подсчитывает частоту встречаемости каждого символа
//        во всех строках массива. Результат подсчета должен быть представлен в виде карты (Map),
//                где ключами являются символы, а значениями -
//                количество их вхождений. Метод должен вывести каждый символ и его частоту на консоль.


    //
//
//
//
    public static void main(String[] args) {
//        m10(new String[]{"mama", "papa"});
//        m6();
//        m7();
//        m8();
//        m9();
        m10(new String[]{"apple", "banana", "apricot", "cherry", "kiwi", "grape"});
    }
    //    //Напишите метод, который принимает список объектов и возвращает новый список, содержащий
//    // только объекты, у которых определенное поле имеет заданное значение. // Дорозбираться с методом.
    public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value) throws NoSuchFieldException {
        if (objects.isEmpty()) {
            return List.of();
        }
        Field field = objects.get(0).getClass().getField(fieldName); // получение указанного поля из класса первого объекта в списке
        return objects.stream()
                .filter(object -> {
                            try {
                                Object fieldValue = field.get(object); // получаем значение поля (Любой тип).
                                return value == null ? fieldValue == null : value.equals(fieldValue);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                )
                .collect(Collectors.toList());
    }
}