package New._29_07_24;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
//    #### Задание 1: Проверка формата номера телефона
//
//**Описание:** Напишите программу, которая проверяет, соответствует ли строк формату номера телефона "`(999)145-67-89`".
    public static void main(String[] args) {
        String phoneNumber = "(99)145-00-11";
        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher("(999)145-67-89");
        Matcher matcher2 = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("Номер телефона соответствует формату.");
        } else {
            System.out.println("Номер телефона не соответствует формату.");
        }
        if (matcher2.matches()) {
            System.out.println("Номер телефона соответствует формату.");
        } else {
            System.out.println("Номер телефона не соответствует формату.");
        }
//        if (matcher2.matches()) {
//            MatchResult result = matcher2.toMatchResult();
//            System.out.println("Полное совпадение: " + result.group(1));
//        }
    }
}
