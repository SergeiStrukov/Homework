package Old.org._2024_05_14;

//Создайте функциональный интерфейс Adder, который имеет один метод int add(int a, int b).
//Реализуйте этот интерфейс с использованием лямбда-выражения и вызовите метод.
public class FI_5 {
    public static void main(String[] args) {
        m1((a, b) -> a + b, 888, 111);
    }

    public static void m1(Adder adder, int a, int b) {
        int result = adder.add(a, b);
        System.out.println("Result: " + result);
    }
}

@FunctionalInterface
interface Adder {
    int add(int a, int b);
}
//public class FI_4 {
//    public static void main(String[] args) {
//        m2((str, i) -> str + i, "888", 888);
//    }
//
//    public static void m2(Inter77 inter77, String str, int i) {
//        inter77.add(str, i);
//    }
//}