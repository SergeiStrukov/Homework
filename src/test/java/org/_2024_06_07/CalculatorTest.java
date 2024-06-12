package org._2024_06_07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();
    private final double a = 10;
    private final double b = 20;
    @Test
    void dividePositiveTest() {
        double actual = new Calculator().divide(a, b);
        Assertions.assertEquals(0.1, actual);
    }

    @Test
    void divideNegativeTest() {
        double a = 100;
        double bZero = 0;
        Assertions.assertThrows(ArithmeticException.class,() -> new Calculator().divide(a,bZero));
    }

    @Test
    void subTest(){
        double a = -10;
        double b = -1;
        double actual = new Calculator().sub(a,b);
        Assertions.assertEquals(-9,actual);
    }

    @Test
    void sumTest(){
        Calculator calculator = new Calculator();
        double result = calculator.sum(10,4);
        assertEquals(result,14);
    }
    @Test
    void multiTest(){
        double expectedMult = 200;
        Assertions.assertEquals(expectedMult,calculator.mult(a,b),0.001);
    }
}