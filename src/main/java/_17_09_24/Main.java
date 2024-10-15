package _17_09_24;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(125));

    }

    public static boolean isPrime(int number) {
        if (number % 2 == 0 && number != 2) return false;
        double sqrt = Math.sqrt(number);
        for (int i = 3; i <= sqrt; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}