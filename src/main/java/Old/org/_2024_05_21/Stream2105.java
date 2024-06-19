package Old.org._2024_05_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2105 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        getAVG(list);
    }

    public static void getAVG(List<Integer> list) {
        list.stream()
                .distinct()
                .sorted()
                .map(num -> {
                    if (num % 2 == 0) {
                        num = num * 10;
                    }
                    return num;
                })
                .forEach(System.out::println);
    }
}
