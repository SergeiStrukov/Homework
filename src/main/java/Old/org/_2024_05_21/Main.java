package Old.org._2024_05_21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 4, 5, 2, 5, 5);

        List<Integer> newList = list.stream()
                .distinct()
                .sorted((num1, num2) -> num2 - num1)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
