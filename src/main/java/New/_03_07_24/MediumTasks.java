package New._03_07_24;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

public class MediumTasks {
    //    ### Задачи средней сложности
//
//              11. **Поиск строки по длине**: Найти самую длинную строку в списке.
//            12. **Фильтрация по предикату**: Отфильтровать строки, которые начинаются с определенной буквы.
//            13. **Пропуск первых элементов**: Пропустить первые 5 элементов списка и вывести оставшиеся.
//              14. **Ограничение списка**: Ограничить количество элементов в списке до первых 10.
//            15. **Группировка по длине строк**: Сгруппировать строки по их длине.
//              16. **Собрать в Set**: Преобразовать список в Set.
//            17. **Создание Map из списка объектов**: Преобразовать список объектов в Map, используя одно из полей объектов как ключ.
//              18. **Сравнение элементов**: Проверить, все ли элементы списка больше определенного значения.
//              19. **Нахождение любых элементов**: Найти любой элемент списка, удовлетворяющий определенному условию.
//            20. **Подсчет строк, содержащих символ**: Подсчитать количество строк, содержащих определенный символ.
    public static void main(String[] args) {
        List<String> list = List.of("Sergei", "Ser", "Marie", "ram", "Ramiz", "r");
        List<String> list2 = List.of("Sergei", "Ser", "Marie", "ram", "Ramiz", "r", "Sergei", "Ser", "Marie", "ram", "Ramiz", "r");
        System.out.println(findLongestString(list));
        System.out.println(checkFiveElements(list));
        System.out.println("----");
        System.out.println(checkAfterTenElements(list2));
        System.out.println("----");
        System.out.println(groupLengthOfStrings(list));

        List<Students> listOfStudents = new ArrayList<>(List.of(
                new Students("Sergey", "Strukov", 30),
                new Students("And", "Petrov", 30),
                new Students("Andrew", "Sid", 20),
                new Students("Marie", "Sidorov", 10),
                new Students("Mashuk", "Zubkov", 10)
        ));
        System.out.println("----");
//        System.out.println(groupByAge(listOfStudents));
        Map<Integer, List<Students>> groupedByAge = groupByAge(listOfStudents);

        groupedByAge.forEach((age, students) -> {
            System.out.println("Age:" + age);
            students.forEach(System.out::println);
            System.out.println();
        });
        List<Integer> list3 = List.of(1, 2, 4, 66, 44);
        List<Integer> list4 = List.of(66, 44);
        System.out.println(compareElements(list3, 10));
        System.out.println(compareElements(list4, 10));
        System.out.println("----");
        System.out.println(findAnyEl(list3, 66));
        System.out.println("----");
        System.out.println(countStringsWithChar(list,"R"));
        System.out.println(countStringsWithChar(list,"a"));
    }

    //              11. **Поиск строки по длине**: Найти самую длинную строку в списке.
    public static String findLongestString(List<String> list) {
        return list.stream()
                .max((el1, el2) -> el1.length() - el2.length())
                .orElse("");
    }

    //            12. **Фильтрация по предикату**: Отфильтровать строки, которые начинаются с определенной буквы.
    public static List<String> filterPredicateStrings(List<String> list) {
        return list.stream()
                .filter(el -> el.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
    }

    //    13. **Пропуск первых элементов**: Пропустить первые 5 элементов списка и вывести оставшиеся.
    public static List<String> checkFiveElements(List<String> list) {
        return list.stream()
                .skip(5)
                .collect(Collectors.toList());
    }

    //        14. **Ограничение списка**: Ограничить количество элементов в списке до первых 10.
    public static List<String> checkAfterTenElements(List<String> list) {
        return list.stream()
                .limit(10)
                .collect(Collectors.toList());
    }

    //        15. **Группировка по длине строк**: Сгруппировать строки по их длине.
    public static Map<Integer, List<String>> groupLengthOfStrings(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(word -> word.length()));
    }

    //              16. **Собрать в Set**: Преобразовать список в Set.
    public static Set<String> compToSet(List<String> list) {
        return list.stream()
                .collect(Collectors.toSet());
    }

    //            17. **Создание Map из списка объектов**:
//            Преобразовать список объектов в Map, используя одно из полей объектов как ключ.
    public static Map<Integer, List<Students>> groupByAge(List<Students> list) {
        return list.stream()
                .collect(Collectors.groupingBy(students -> students.getAge()));
    }

    //              18. **Сравнение элементов**: Проверить, все ли элементы списка больше определенного значения.
    public static boolean compareElements(List<Integer> list, int value) {
        return list.stream()
                .allMatch(el -> el > value);

    }

    //              19. **Нахождение любых элементов**: Найти любой элемент списка, удовлетворяющий определенному условию.
    public static Optional<Integer> findAnyEl(List<Integer> list, int value) {
        return list.stream()
                .filter(el -> el == value)
                .findAny();
    }

    //            20. **Подсчет строк, содержащих символ**: Подсчитать количество строк, содержащих определенный символ.
    public static int countStringsWithChar(List<String> list, CharSequence ch) {
        return (int) list.stream()
                .filter(el -> el.contains(ch))
                .count();

    }
}

@AllArgsConstructor
@Getter
class Students {
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", age=" + age
                ;
    }
}