package New._03_07_24.HomeworkStreamTasks;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listStrings = List.of("ser", "kor", "Aba", "abaaah");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        showSquareOfNumbers(numbers, n -> System.out.println(n * n));
        int predicate = 5;
        System.out.println(filterStrings(listStrings, predicate));

        List<Integer> result = process(numbers, integer -> integer + 1);
        System.out.println(result);
    }

    //    #1 Напишите метод, который принимает список строк и предикат, и возвращает новый список, содержащий только те строки,
//    которые удовлетворяют условию предиката. Например, отфильтровать все строки длиннее 5 символов.
    public static List<String> filterStrings(List<String> list, int predicate) {
        return list.stream()
                .filter(el -> el.length() > predicate)
                .collect(Collectors.toList());
    }

    //    #2 Создайте метод, который принимает список чисел и void-метод, отвечающий за логику.
//    Метод должен применять переданный void-метод к каждому элементу списка.
//    Например, вывести на экран квадрат каждого числа.
    public static void showSquareOfNumbers(List<Integer> list, Consumer<Integer> action) {
        list.forEach(action);
    }

//    public static void process(List<Integer> list) {
//        list.stream()
//                .reduce((a, b) -> a * b)
//                .map(el -> el.intValue())
//                .orElseThrow();
//    }

    // №4 Реализуйте метод, который принимает список чисел и унарный оператор,
//    а возвращает новый список, где каждый элемент преобразован с помощью
//    переданного оператора. Например, увеличить каждое число на 1.
//    int[] process(int[] a, e -> e + 1);
    public static List<Integer> process(List<Integer> list, UnaryOperator<Integer> operator) {
        return list.stream()
                .map(operator)
                .collect(Collectors.toList());
    }
}
