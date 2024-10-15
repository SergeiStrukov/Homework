package New.unit.example1;

public class ShippingCalculator {

    /**
     * Метод calculateShippingCost предназначен для вычисления
     * стоимости доставки в зависимости от веса посылки и расстояния
     * до пункта назначения. Он использует базовую стоимость и коэффициенты
     * для веса и расстояния, чтобы рассчитать общую стоимость. Если вес или
     * расстояние меньше или равно нулю, метод выбрасывает исключение IllegalArgumentException.
     * @param weight
     * @param distance
     * @return
     */
    public static double calculateShippingCost(double weight, double distance) {
        if (weight <= 0 || distance <= 0) {
            throw new IllegalArgumentException("Weight and distance must be positive values.");
        }

        double baseCost = 5.0;
        double weightFactor = 1.2;
        double distanceFactor = 0.5;

        return baseCost + (weightFactor * weight) + (distanceFactor * distance);
    }
}
