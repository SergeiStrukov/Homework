package New._29_07_24;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
//        Задание 2: Извлечение всех email адресов из текста
//        Описание: Напишите программу, которая извлекает все email адреса из заданного текста.
//        Пусть Email адреса имеют вид [nickname@домен_второго_уровня]
        String text = "Here are some emails: john.doe@example.com-ser-.ru, jane_doe123@domain.org, and invalid@address, not-an-email@.com, jane_doe123@domain.org";

        // Регулярное выражение для поиска email адресов
        Pattern pattern = Pattern.compile("\\b[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(text);

        // Список для хранения найденных email адресов
        ArrayList<String> emails = new ArrayList<>();

        // Поиск всех email адресов в тексте
        while (matcher.find()) {
            emails.add(matcher.group());
        }

        // Вывод всех найденных email адресов
        System.out.println("Найденные email адреса:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
