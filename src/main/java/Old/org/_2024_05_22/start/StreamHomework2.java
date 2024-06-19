package Old.org._2024_05_22.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamHomework2 {
    public static void main(String[] args) {
        List<String> list = List.of("Sergey", "Vanya", "Arseniy", "Lesya", "Maria");
        List<Integer> numbers = List.of(123, 144, 21);
//        System.out.println(countDistinctSquareRoots(numbers));
//        System.out.println(Arrays.toString(filterSortToArray(list)));
//        System.out.println(filterSortReverseAndJoin(list));
//        System.out.println(filterDoubleSort(numbers));
//        System.out.println(maxLengthGreaterThanThree(list));
//        System.out.println(filterNotStartingWithASortLimit(list));
//        System.out.println(mapDistinctSortAndJoin(numbers));
//        System.out.println(countDistinctDoubledGreaterThanTen(numbers));
//        System.out.println(filterGreaterThanFiveMapToCubes(numbers));
//        System.out.println(mapToLengthsFilterEvenSort(list));
//        System.out.println(mapToStringDistinctSortByLength(numbers));
        System.out.println(toLowerCaseDistinctSort(list));
    }

    //public class StreamTasksWithChaining {
//
// 1. Отфильтровать четные числа, отсортировать и вернуть первые 3
    public List<Integer> filterSortLimit(List<Integer> numbers) {
        return numbers.stream().filter(el -> el % 2 == 0).sorted().limit(3).collect(Collectors.toList());
    }

    //
    // 2. Преобразовать список строк в их длины, удалить дубликаты, отсортировать
    public List<Integer> mapDistinctSort(List<String> strings) {
        return strings.stream().map(el -> el.length()).distinct().sorted().collect(Collectors.toList());
    }

    //
    // 3. Отфильтровать строки, начинающиеся с "A", отсортировать по длине, вернуть первые 5
    public List<String> filterSortLimitStrings(List<String> strings) {
        return strings.stream().filter(el -> el.startsWith("A")).sorted((a, b) -> a.length() - b.length()).limit(5).collect(Collectors.toList());
    }

    //
    // 4. Найти сумму квадратов всех четных чисел
    public int sumOfSquaresOfEvenNumbers(List<Integer> numbers) {
        // решение
        return numbers.stream().filter(el -> el % 2 == 0).mapToInt(el -> (int) Math.pow(el, 2)).sum();
    }

    //
    // 5. Отфильтровать строки, отсортировать и вернуть как массив???
    public static String[] filterSortToArray(List<String> strings) {
        // решение
        return strings.stream().sorted().toArray(size -> new String[size]);
    }

    //
    // 6. Преобразовать список чисел в их квадратные корни, удалить дубликаты и посчитать количество
    public static long countDistinctSquareRoots(List<Integer> numbers) {
        long counter = numbers.stream()
                .map(el -> Math.sqrt(el))
                .distinct()
                .count();
        return counter;
    }

    //
//     7. Отфильтровать строки, отсортировать в обратном порядке и соединить в одну строку
    public static String filterSortReverseAndJoin(List<String> strings) {
        // решение
        return strings.stream()
                .filter(el -> el != null && !el.isEmpty())
                .sorted((el1, el2) -> el2.compareTo(el1))
                .collect(Collectors.joining());
    }

    //
    // 8. Отфильтровать нечетные числа, удвоить, отсортировать и вернуть как список
    public static List<Integer> filterDoubleSort(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * 2)
                .sorted()
                .collect(Collectors.toList());
    }

    //
    // 9. Преобразовать список строк в список их длин, отфильтровать длины больше 3 и найти максимум
    public static Optional<Integer> maxLengthGreaterThanThree(List<String> strings) {
        return strings.stream()
                .map(string -> string.length())
                .filter(length -> length > 3)
                .max(Integer::compareTo);
    }

    //
//    // 10. Отфильтровать строки, не начинающиеся с "A", отсортировать по алфавиту и вернуть первые 3
    public static List<String> filterNotStartingWithASortLimit(List<String> strings) {
        return strings.stream()
                .filter(string -> string != null && !string.isEmpty() && !string.startsWith("A"))
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
    }

    //
    // 11. Преобразовать список чисел в строки, удалить дубликаты, отсортировать и соединить через запятую
    public static String mapDistinctSortAndJoin(List<Integer> numbers) {
        return numbers.stream()
                .map(el -> el.toString())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    //
    // 12. Отфильтровать числа больше 10, удвоить их, посчитать количество уникальных
    public static long countDistinctDoubledGreaterThanTen(List<Integer> numbers) {
        return numbers.stream()
                .filter(el -> el > 10)
                .map(el -> el * 2)
                .distinct()
                .count();
    }

    //
    // 13. Преобразовать строки в верхний регистр, удалить дубликаты, отсортировать и вернуть как список
    public List<String> toUpperCaseDistinctSort(List<String> strings) {
        return strings.stream()
                .map(el -> el.toUpperCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    //
    // 14. Отфильтровать строки, длина которых больше 5, отсортировать по длине и найти первую
    public Optional<String> findFirstLongStringSorted(List<String> strings) {
        // решение
        return strings.stream()
                .filter(string -> string.length() > 5)
                .sorted()
                .findFirst();
    }

    //
    // 15. Преобразовать список чисел в их квадраты, отфильтровать те, что меньше 50, и найти минимум
    public Optional<Integer> minSquareLessThanFifty(List<Integer> numbers) {
        return numbers.stream()
                .map(el -> (int) Math.pow(el, 2))
                .filter(number -> number < 50)
                .min((el1, el2) -> el1.compareTo(el2));
    }

    //
    // 16. Отфильтровать строки, начинающиеся с "B", отсортировать и посчитать количество
    public long countStartingWithBSorted(List<String> strings) {
        return strings.stream()
                .filter(string -> string.startsWith("B"))
                .sorted()
                .count();
    }

    //
    // 17. Преобразовать числа в их строки, удалить дубликаты, отсортировать и найти любую строку
    public Optional<String> findAnyDistinctSortedString(List<Integer> numbers) {
        return numbers.stream()
                .map(el -> el.toString())
                .distinct()
                .sorted()
                .skip(2)
                .findFirst();
    }

    //
    // 18. Отфильтровать строки длиной больше 3, преобразовать в верхний регистр и вернуть как массив
    public String[] filterLengthGreaterThanThreeToUpperArray(List<String> strings) {
        return strings.stream()
                .filter(el -> el.length() > 3)
                .map(el -> el.toUpperCase())
                .toArray(String[]::new);
//        return strings.stream().toArray(size -> new String[size]);
    }

    //
    // 19. Отфильтровать числа больше 5, преобразовать в их кубы и вернуть как список
    public static List<Integer> filterGreaterThanFiveMapToCubes(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number > 5)
                .map(number -> (int) Math.pow(number, 3))
                .collect(Collectors.toList());
    }

    //
    // 20. Преобразовать строки в их длины, отфильтровать четные, отсортировать и вернуть как список
    public static List<Integer> mapToLengthsFilterEvenSort(List<String> strings) {
        return strings.stream()
                .map(string -> string.length())
                .filter(string -> string % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
    }

    //
//     21. Отфильтровать строки, начинающиеся с "C", отсортировать, пропустить первые 2 и вернуть остальные
    public List<String> filterStartingWithCSkipFirstTwo(List<String> strings) {
        return strings.stream()
                .filter(string -> string.startsWith("C"))
                .sorted()
                .skip(2)
                .collect(Collectors.toList());
    }

    //
    // 22. Преобразовать числа в строки, удалить дубликаты, отсортировать по длине и вернуть как список
    public static List<String> mapToStringDistinctSortByLength(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number.toString())
                .distinct()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
    }

    //
    // 23. Отфильтровать строки, длина которых больше 2, отсортировать и посчитать количество уникальных
    public long countDistinctLengthGreaterThanTwo(List<String> strings) {
        return strings.stream()
                .filter(string -> string.length() > 2)
                .sorted()
                .distinct()
                .count();
    }

    //
    // 24. Преобразовать строки в нижний регистр, удалить дубликаты, отсортировать и вернуть как список
    public static List<String> toLowerCaseDistinctSort(List<String> strings) {
        return strings.stream()
                .map(string -> string.toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        // решение
    }

    //
    // 25. Отфильтровать строки, начинающиеся с "D", преобразовать в их длины, удалить дубликаты и вернуть как список
    public List<Integer> filterStartingWithDMapToLengthsDistinct(List<String> strings) {
        // решение
        return strings.stream()
                .filter(string -> string.startsWith("D"))
                .map(string -> string.length())
                .distinct()
                .collect(Collectors.toList());

    }
}

