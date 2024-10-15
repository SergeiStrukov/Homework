package New.unit;

public class TestEx {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new MyByZeroException(ErrorMessage.ZERO);
        }
        return a / b;
    }

    /**
     * 10 2
     * 10 0
     * 0 10
     * -1 -9
     */
}
