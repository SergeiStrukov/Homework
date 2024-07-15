package New._03_07_24;

import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 2, 15);
        List<Integer> list2 = List.of(1, 1, 2, 2,2, 15,16);
//        System.out.println(task1(list));
//        System.out.println("-------");
//        System.out.println(task2(list));
//        System.out.println("-------");
//        System.out.println(task3(list));
//        System.out.println("-------");
//        System.out.println(task4(list));
//        System.out.println("-------");
//        System.out.println(task5(list));
        System.out.println(countElements(list));
        System.out.println(sortList(list));
        List<String> listStrings = List.of("ser", "kor", "Aba", "abaaa");
        System.out.println(sortStrings(listStrings));
        System.out.println("-------");
        List<String> listStrings2 = List.of("serg", "kor2", "Aba1", "abaaas");
        List<String> listStrings3 = List.of();
        System.out.println("-------");
//        System.out.println(combStrings(listStrings3));
        System.out.println(removeDuplicate(list2));

//### Простые задачи
//
//        1. **Фильтрация чисел**: Отфильтровать и вывести числа которые делятся на 3 и на 5.
//        2. **Преобразование в строки**: Преобразовать список целых чисел в список строк.
//        3. **Поиск максимального числа**: Найти максимальное число в списке.
//        4. **Поиск минимального числа**: Найти минимальное число в списке.
//        5. **Суммирование чисел**: Найти сумму всех чисел в списке.
//        6. **Подсчет элементов**: Подсчитать количество элементов в списке.
//        7. **Сортировка списка**: Отсортировать список чисел в порядке возрастания.
//        8. **Сортировка строк**: Отсортировать список строк в алфавитном порядке.
//        9. **Конкатенация строк**: Объединить все строки из списка в одну строку, разделенную запятой.
//        10. **Удаление дубликатов**: Удалить дубликаты из списка чисел.

    }

    public static List<Integer> task1(List<Integer> list) {
        return list.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> task2(List<Integer> list2) {
        return list2.stream()
                .map(string -> String.valueOf(string))
                .collect(Collectors.toList());
    }

    public static List<Integer> task3(List<Integer> list) {
        return list.stream()
                .max((el1, el2) -> el1 - el2)
                .stream()
                .collect(Collectors.toList());

    }

    public static List<Integer> task4(List<Integer> list) {
        return list.stream()
                .min((el1, el2) -> el1 - el2)
                .stream()
                .collect(Collectors.toList());
    }

    public static List<Integer> task5(List<Integer> list) {
        return list.stream()
                .reduce(((integer, integer2) -> integer + integer2))
                .stream()
                .collect(Collectors.toList());
    }

    //
    // 6. **Подсчет элементов**: Подсчитать количество элементов в списке.
    public static long countElements(List<Integer> list) {
        return list.stream()
                .count();
    }

    //7. **Сортировка списка**: Отсортировать список чисел в порядке возрастания.
    public static List<Integer> sortList(List<Integer> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    //        8. **Сортировка строк**: Отсортировать список строк в алфавитном порядке.
    public static List<String> sortStrings(List<String> list) {
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedList;
    }

    //  9. **Конкатенация строк**: Объединить все строки из списка в одну строку, разделенную запятой.
    public static String combStrings(List<String> list) {
        String combStrings = list.stream()
                .reduce((str1, str2) -> str1 + "," + str2)
                .orElseThrow(() -> new IllegalArgumentException("Список строк пустой"));
//                .orElse("");
        return combStrings;
    }
    //  10. **Удаление дубликатов**: Удалить дубликаты из списка чисел.
    public static List<Integer> removeDuplicate(List<Integer> list){
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
