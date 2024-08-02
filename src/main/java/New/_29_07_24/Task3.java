package New._29_07_24;

public class Task3 {
    public static void main(String[] args) {
        // Задание 3: Проверка на наличие цифр в строке
        // Описание: Напишите программу, которая проверяет, содержит ли строка хотя бы одну цифру.

        String text = "Пример строки с цифрой 123";

        // Регулярное выражение для поиска цифр
        boolean containsDigit = text.matches(".*\\d.*");

        // Проверка и вывод результата
        if (containsDigit) {
            System.out.println("Строка содержит хотя бы одну цифру.");
        } else {
            System.out.println("Строка не содержит цифр.");
        }
    }
}
