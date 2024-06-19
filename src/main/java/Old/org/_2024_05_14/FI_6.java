package Old.org._2024_05_14;

public class FI_6 {
    //    Создайте функциональный интерфейс StringConverter, который имеет один метод String convert(String str).
//    Реализуйте его с использованием лямбда-выражения для преобразования строки в верхний регистр и вызовите метод.
    public static void main(String[] args) {
        m2(String::toUpperCase, "strukov");
        m2((String firstName) -> firstName.toUpperCase(), "sergei");
    }

    public static void m2(StringConverter stringConverter, String string) {
        String stringResult = stringConverter.convert(string);
        System.out.println("Result:" + stringResult);
    }
}

@FunctionalInterface
interface StringConverter {
    String convert(String str);
}
