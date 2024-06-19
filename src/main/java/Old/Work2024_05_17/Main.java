package Old.Work2024_05_17;

import java.io.IOException;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //    Напишите программу, чтобы узнать, какое исключение будет брошено, если:
//            1 Распознать строку “12c” в число.
//            2 Создать массив из отрицательного количества элементов.
//            3 Обратиться к элементу массива, которого нет в массиве.
//4 Использовать метод valueOf() у одного из Enum, передав в него пустую строку.
//            5 Создать строковую переменную, не присваивая ей значения, и вызвать у неё метод получения длины.
//            6 В отдельном методе создать Scanner и указать в нём путь к файлу вместо System.in.
//    public static void main(String[] args) throws IOException {
//        1.
//        String string = "12c";
//        int test = Integer.parseInt("123c"); // NumberFormatException
//        System.out.println(test+1);
//        2.
//        int[] array = new int[-3];//.NegativeArraySizeException
//        System.out.println(Arrays.toString(array));
//        3.
//        int [] array = {1,2,3,4,5,6,7,8,9};
//        System.out.println(array[9]); // ArrayIndexOutOfBoundsException
//        4.
//        4 Использовать метод valueOf() у одного из Enum, передав в него пустую строку.
//        DayOfWeek dayOfWeek = DayOfWeek.valueOf("MAY");
//        System.out.println(dayOfWeek); //.IllegalArgumentException

//            5 Создать строковую переменную, не присваивая ей значения, и вызвать у неё метод получения длины.
//        String string = null; // .NullPointerException
//        System.out.println(string.length());
        //            6 В отдельном методе создать Scanner и указать в нём путь к файлу вместо System.in.
//        getDate();
//    }

//    public static void getDate() throws IOException {
//        Scanner scanner = new Scanner(Path.of("Sergey"));
//    }
}
