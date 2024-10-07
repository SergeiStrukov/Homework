package New.unit.example1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    /**
     * @ValueSource: Проверяет, что стоимость доставки всегда
     * положительная для заданного веса и фиксированного расстояния.
     * Это базовая проверка, которая удостоверяет,
     * что метод работает корректно и не возвращает отрицательные
     * значения или ноль для положительных входных данных.
     * @param weight
     */
    @DisplayName("Test calculateShippingCost with @ValueSource")
    @ParameterizedTest
    @ValueSource(doubles = {1.0, 2.5, 5.0})
    void testCalculateShippingCostWithWeight(double weight) {
        double distance = 10.0;
        double cost = ShippingCalculator.calculateShippingCost(weight, distance);
        assertTrue(cost > 0);
    }

    /**
     * @CsvSource: Проверяет точное соответствие вычисленной
     * стоимости доставки ожидаемому результату для различных весов и расстояний.
     * Это позволяет проверить правильность вычислений
     * для конкретных случаев и убедиться, что формула расчета
     * стоимости работает как ожидалось.
     * @param weight
     * @param distance
     * @param expectedCost
     */
    @DisplayName("Test calculateShippingCost with @CsvSource")
    @ParameterizedTest
    @CsvSource({
        "1.0, 10.0, 11.2",
        "2.5, 20.0, 22.0",
        "5.0, 5.0, 16.5"
    })
    void testCalculateShippingCostWithCsvSource(double weight, double distance, double expectedCost) {
        double cost = ShippingCalculator.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, cost);
    }

    /**
     * @MethodSource: Выполняет те же проверки, что и @CsvSource другим способом
     * @param weight
     * @param distance
     * @param expectedCost
     */
    @DisplayName("Test calculateShippingCost with @MethodSource")
    @ParameterizedTest
    @MethodSource("shippingCostProvider")
    void testCalculateShippingCostWithMethodSource(double weight, double distance, double expectedCost) {
        double cost = ShippingCalculator.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, cost);
    }

    static Stream<Arguments> shippingCostProvider() {
        return Stream.of(
            Arguments.of(1.0, 10.0, 16.0),
            Arguments.of(2.5, 20.0, 22.0),
            Arguments.of(5.0, 5.0, 16.5)
        );
    }

    /**
     * @EnumSource: Проверяет точное соответствие вычисленной
     * стоимости ожидаемому результату, используя значения
     * из перечисления WeightDistancePair.
     *
     * Это позволяет организовать тестовые данные в виде перечисления,
     * что делает код тестов более читаемым и организованным.
     * @param pair
     */
    @DisplayName("Test calculateShippingCost with @EnumSource")
    @ParameterizedTest
    @EnumSource(WeightDistancePair.class)
    void testCalculateShippingCostWithEnumSource(WeightDistancePair pair) {
        double cost = ShippingCalculator.calculateShippingCost(pair.getWeight(), pair.getDistance());
        assertEquals(pair.getExpectedCost(), cost);
    }

    enum WeightDistancePair {
        CASE1(1.0, 10.0, 16.0),
        CASE2(2.5, 20.0, 22.0),
        CASE3(5.0, 5.0, 16.5);

        private final double weight;
        private final double distance;
        private final double expectedCost;

        WeightDistancePair(double weight, double distance, double expectedCost) {
            this.weight = weight;
            this.distance = distance;
            this.expectedCost = expectedCost;
        }

        public double getWeight() {
            return weight;
        }

        public double getDistance() {
            return distance;
        }

        public double getExpectedCost() {
            return expectedCost;
        }
    }

    /**
     * @CsvFileSource: То же что и выше только из CSV-файла
     * Это позволяет удобно хранить и управлять большими
     * объемами тестовых данных в виде файлов, облегчая их редактирование и поддержание.
     * @param weight
     * @param distance
     * @param expectedCost
     */
    @DisplayName("Test calculateShippingCost with @CsvFileSource")
    @ParameterizedTest
    @CsvFileSource(resources = "/shipping_data.csv", numLinesToSkip = 1)
    void testCalculateShippingCostWithCsvFileSource(double weight, double distance, double expectedCost) {
        double cost = ShippingCalculator.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, cost);
    }



    /**
     * Проверяет, что метод выбрасывает исключение
     * IllegalArgumentException при передаче некорректных
     * (нулевых или отрицательных) значений веса или расстояния.
     */
    @Test
    @DisplayName("Test calculateShippingCost with invalid inputs")
    void testCalculateShippingCostWithInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(-1, 10));
        assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(1, -10));
        assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(0, 10));
        assertThrows(IllegalArgumentException.class, () -> ShippingCalculator.calculateShippingCost(1, 0));
    }
}