package _2024_06_12.taski;

import Old._2024_06_12.taski.TaxCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static Old._2024_06_12.taski.TaxCalculator.calculateTax;
import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    //    Проверка с использованием @ValueSource для дохода
//
//    Проверка, что метод возвращает положительное значение для
//    различных уровней дохода и фиксированного статуса налогоплательщика.
//    Значения для income: 30000, 60000, 100000
//    Фиксированные значения для status: "single"
//            ************************************************
    @DisplayName("return positive value:")
    @ParameterizedTest
    @ValueSource(doubles = {30000, 60000, 90000})
    void calculateTaxTest(double income) {
        double tax = calculateTax(income, "single");
        Assertions.assertTrue(tax > 0);
    }

    //    Проверка с использованием @CsvSource
//
//    Проверка, что метод возвращает правильное значение для
//    различных комбинаций дохода и статуса налогоплательщика.
//    Набор данных:
//    income: 30000, status: "single", ожидаемое значение: 6000
//    income: 60000, status: "single", ожидаемое значение: 15000
//    income: 90000, status: "married", ожидаемое значение: 18000
    @DisplayName("Проверка, что метод возвращает правильное значение для\n" +
            "//    различных комбинаций дохода и статуса налогоплательщика.")
    @ParameterizedTest
    @CsvSource({
            "30000 , single , 6000",
            "60000 , single, 15000",
            "90000, married, 18000"
    }
    )
    void calculateIncomeTax(double income, String status, double expected) {
        double actual = TaxCalculator.calculateTax(income, status);
        Assertions.assertEquals(expected, actual);
    }

    //    Проверка с использованием @MethodSource
//
//    Проверка, что метод возвращает правильное значение для
//    различных комбинаций дохода и статуса налогоплательщика.
//    Набор данных (метод должен возвращать Stream<Arguments>):
//    income: 30000, status: "single", ожидаемое значение: 6000
//    income: 60000, status: "single", ожидаемое значение: 15000
//    income: 90000, status: "married", ожидаемое значение: 18000
    @DisplayName("Проверка, что метод возвращает правильное значение для\n" +
            "//    различных комбинаций дохода и статуса налогоплательщика.")
    @ParameterizedTest
    @MethodSource("calculateIncomeTax")
    void calculateIncomeTaxWithMethodSource(double income, String status, double expected) {
        double actual = TaxCalculator.calculateTax(income, status);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> calculateIncomeTax() {
        return Stream.of(
                Arguments.of(30000, "single", 6000),
                Arguments.of(60000, "single", 15000),
                Arguments.of(90000, "married", 18000)
        );
    }

    //    Проверка с использованием @EnumSource
//
//    Создать перечисление, содержащее различные комбинации дохода,
//    статуса налогоплательщика и ожидаемого значения налога.
//    Значения в перечислении:
//    CASE1: income: 30000, status: "single", ожидаемое значение: 6000
//    CASE2: income: 60000, status: "single", ожидаемое значение: 15000
//    CASE3: income: 90000, status: "married", ожидаемое значение: 18000
    @DisplayName("Проверка с использованием @EnumSource")
    @ParameterizedTest
    @EnumSource(IncomeStatus.class)
    void calculateIncomeTaxEnumTest(IncomeStatus pair) {
        double actual = TaxCalculator.calculateTax(pair.income, pair.status);
        assertEquals(pair.expected, actual);

    }

    enum IncomeStatus {
        CASE1(30000, "single", 6000),
        CASE2(60000, "single", 15000),
        CASE3(90000, "married", 18000);
        double income;
        String status;
        double expected;

        IncomeStatus(double income, String status, double expected) {
            this.income = income;
            this.status = status;
            this.expected = expected;
        }
    }
//    Проверка с использованием @CsvFileSource
//
//    Создать CSV-файл с набором данных для проверки различных
//    комбинаций дохода и статуса налогоплательщика.
//    Пример содержимого файла:

    //    income,status,expectedTax
//30000,single,6000
//            60000,single,15000
//            90000,married,18000
    @DisplayName("Проверка с использованием @CsvFileSource")
    @ParameterizedTest
    @CsvFileSource(resources = "/incomeStatus.Csv", numLinesToSkip = 2)
    void calculateIncomeTaxCsvTest(double income, String status, double expected) {
        double actual = TaxCalculator.calculateTax(income, status);
        assertEquals(expected, actual);
    }

    //    Проверка с некорректными входными данными
//
//    Проверка, что метод выбрасывает исключение
//    IllegalArgumentException при передаче некорректных значений.
//    Некорректные значения:
//    income: -1, status: "single"
//    income: 30000, status: "divorced"
//    income: -50000, status: "married"
    @DisplayName("Проверка с некорректными входными данными IllegalArgumentException")
    @Test
    void calculateIncomeTaxExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> TaxCalculator.calculateTax(-1, "single"));
    }

    @DisplayName("Проверка с некорректными входными данными IllegalArgumentException")
    @ParameterizedTest
    @CsvFileSource(resources = "/IncomeArgException.csv", numLinesToSkip = 2)
    void calculateIncomeTaxExceptionParameterizedTest(double income, String status) {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> TaxCalculator.calculateTax(income, status));
    }
//
}