package New._02_0824.code;

public class Program {
    public double sum(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        runTest();
    }

    public static void runTest() {
        ProgramTest.runTest();
        UtilsTest.runTest();
    }
}
