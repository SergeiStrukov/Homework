package New._03_07_24;

import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,2,15);
        System.out.println(task1(list));
        System.out.println("-------");
        System.out.println(task2(list));
        System.out.println("-------");
        System.out.println(task3(list));
        System.out.println("-------");
        System.out.println(task4(list));
        System.out.println("-------");
        System.out.println(task5(list));
        long count = list.stream().count();


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

    public static List<String> task2(List<Integer> list2){
        return list2.stream()
                .map(string -> String.valueOf(string))
                .collect(Collectors.toList());
    }
    public static List<Integer> task3(List<Integer> list){
        return list.stream()
                .max((el1,el2)->el1-el2)
                .stream()
                .collect(Collectors.toList());

    }
    public static List<Integer> task4(List<Integer> list){
        return list.stream()
                .min((el1,el2)->el1-el2)
                .stream()
                .collect(Collectors.toList());
    }
    public static List<Integer> task5(List<Integer> list){
        return list.stream()
                .reduce(((integer, integer2) -> integer+integer2))
                .stream()
                .collect(Collectors.toList());
    }
}
