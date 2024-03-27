package org.example._25_03_24;

import java.util.Arrays;

public class TestHomework1 {
    public static void main(String[] args) {
//        1: Найдите сумму всех нечетных элементов массива.
//        2: Найдите максимальный элемент в массиве.
//        3: Проверьте, содержит ли массив заданный элемент.
//        4: Посчитайте, сколько раз заданный элемент встречается в массиве.
//        5: элементы массива.
//        6: Найдите сумму всех нечетных элементов массива которые находятся на нечетных индексах.
//        7: Найдите сумму всех четных элементов массива которые находятся на нечетных индексах.
//        8: Найдите произведение всех нечетных элементов массива.
//        9: Найдите разность между максимальным и минимальным элементами массива.
//        10: Найдите сумму элементов массива, которые находятся между первым и последним положительными элементами.

//        11: Найдите самую длинную строку в массиве строк.
//        12: Подсчитайте, сколько раз в массиве встречается строка, равная заданной.
//        13: Проверьте, все ли строки в массиве имеют одинаковую длину.
//        14: Найдите строку в массиве, содержащую наибольшее количество гласных.
//        15: Сформируйте новую строку, повторяя каждую строку в массиве столько раз, какова ее длина.

        double[] array = {1, 3, 11, 5, 8, 12, 3, 44};
        String[] arrStrings = {"Sergei", "Cat", "Tiger", "Marie", "Football", "dog"};
        String[] animals = {"Ser", "Cat", "Dog"};

        String animal = "dog";

        System.out.println((getSumNotEven(array)));
        System.out.println((findMaxElement(array)));
        System.out.println("Содержит заданный элемент столько раз: " + findSameElement(array));
        System.out.println(Arrays.toString(reverseMassive(array)));
        System.out.println(sumNotEvenElementsIndexes(array));
        System.out.println(" ");
        System.out.println(sumEvenElementsIndexes(array));
        System.out.println(multiplyNotEvenElements(array));
        System.out.println(findMinusOfMaxAndMinElements(array));
        System.out.println(sumPositiveElements(array));
        System.out.println(getLongestString(arrStrings));
        System.out.println(getSameString(animal, arrStrings));
        System.out.println(getSameLength(arrStrings));
        System.out.println(getSameLength(animals));
    }

    //#1: Найдите сумму всех нечетных элементов массива.
    public static double getSumNotEven(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result += array[i];
            }
        }
        return result;
    }

    //    2: Найдите максимальный элемент в массиве.
    public static double findMaxElement(double[] array) {
        double max = 0;
        int i = 0;
        while (i <= array.length - 1) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }

    //        3: Проверьте, содержит ли массив заданный элемент. 4. Посчитайте, сколько раз заданный элемент встречается в массиве.
    public static int findSameElement(double[] array) {
        double element = 11;
        int i = 0;
        int quantity = 0;
        while (i <= array.length - 1) {
            if (array[i] == element) {
                quantity++;
            }
            i++;
        }
        return quantity;
    }

    // 5. элементы массива.
    public static double[] reverseMassive(double[] array) {
        double temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    //        6: Найдите сумму всех нечетных элементов массива которые находятся на нечетных индексах. {1, 3, 11, 5, 8, 12, 3, 44};
    public static double sumNotEvenElementsIndexes(double[] array) {
        double result = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 != 0 && i % 2 == 0) {
                result += array[i];
            }
        }
        return result;
    }

    // 7: Найдите сумму всех четных элементов массива которые находятся на нечетных индексах.{1, 3, 11, 5, 8, 12, 3, 44};
    public static double sumEvenElementsIndexes(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && i % 2 == 0) {
                result += array[i];
            }
        }
        return result;
    }

    //        8: Найдите произведение всех нечетных элементов массива.
    public static double multiplyNotEvenElements(double[] array) {
        double result = 1;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 != 0) {
                result *= array[i];
            }
        }
        return result;
    }

    //        9: Найдите разность между максимальным и минимальным элементами массива.
    public static double findMinusOfMaxAndMinElements(double[] array) { //{1, 3, 11, 5, 8, 12, 3, 44};
        int i = 0;
        double max = array[i];
        double min = array[i];
        double minus;
        while (i <= array.length - 1) {
            if (array[i] > max) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
            i++;
        }
        minus = max - min;
        return minus;
    }

    //10: Найдите сумму элементов массива, которые находятся между первым и последним положительными элементами.
    public static double sumPositiveElements(double[] array) {
        double result = 0;
        for (int i = 1; i <= array.length - 2; i++) {
            result += array[i];
        }
        return result;
    }

    //    11: Найдите самую длинную строку в массиве строк.
    public static String getLongestString(String[] arrStrings) {
        String longest = "";
        for (int i = 0; i <= arrStrings.length - 1; i++) {
            if (longest.length() < arrStrings[i].length()) {
                longest = arrStrings[i];
            }
        }
        return longest;
    }

    //        12: Подсчитайте, сколько раз в массиве встречается строка, равная заданной.
    public static int getSameString(String animal, String[] arrString) {
        int sum = 0;
        for (int i = 0; i <= arrString.length - 1; i++) {
            if (animal.length() == arrString[i].length()) {
                sum++;
            }
        }
        return sum;
    }

    //        13: Проверьте, все ли строки в массиве имеют одинаковую длину.
    public static boolean getSameLength(String[] arrStrings) {
        for (int i = 1; i <= arrStrings.length - 1; i++) {
            if (arrStrings[0].length() != arrStrings[i].length()) {
                return false;
            }
        }
        return true;
    }
}

//        14: Найдите строку в массиве, содержащую наибольшее количество гласных.
//    public static int countMaxVowels(String[] arrStrings) {
//        String vowels = "aoeiuyAOEIUY";
//
//        for (int i = 0; i <= arrStrings.length-1; i++) {
//


