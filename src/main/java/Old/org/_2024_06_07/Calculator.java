package Old.org._2024_06_07;

public class Calculator {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("*****Divide by zero*****");
        }
        return a / b;
    }

    public double sub(double a, double b) {
        return a - b;
    }
    public double sum(double a, double b) {
        return a + b;
    }
    public double mult(double a, double b){
        return a*b;
    }
}