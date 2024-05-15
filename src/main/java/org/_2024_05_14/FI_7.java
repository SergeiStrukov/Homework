package org._2024_05_14;

public class FI_7 {
    //    Создайте функциональный интерфейс NumberFilter, который имеет один метод boolean filter(int number).
//    Реализуйте его с использованием лямбда-выражения для проверки, является ли число четным.
//    Примените фильтр к массиву чисел и выведите только четные числа.
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 8, 2};
        filterAndPrintEvenNumbers((number) -> number % 2 == 0, numbers);
    }

    public static void filterAndPrintEvenNumbers(NumberFilter numberFilter, int[] numbers) {
        for (int number : numbers) {
            if (numberFilter.filter(number)) {
                System.out.println(number);
            }
        }
    }
}

@FunctionalInterface
interface NumberFilter {
    boolean filter(int number);
}
