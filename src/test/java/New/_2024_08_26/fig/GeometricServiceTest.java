package New._2024_08_26.fig;

import New.unit.example1.ShippingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GeometricServiceTest {

    @Test
    void findPerfectSquares() {
        Square square = new Square(1, 1);
        Square rectangle = new Square(1, 1);
        Triangle triangle = GeometricFactory.generateValidTriangle();
        Line line = new Line(5);

        List<Geometric> geometrics = new ArrayList<>();
        geometrics.add(square);
        geometrics.add(rectangle);
        geometrics.add(triangle);
        geometrics.add(line);

        Square actualSq = new GeometricService().findPerfectSquares(geometrics).get(0);
        Assertions.assertEquals(square, actualSq);
    }

    @DisplayName("Test findCirclesInMinMaxRadiusRange with @ValueSource")
    @ParameterizedTest
    @ValueSource(doubles = {1.0, 3, 26})
    void findCirclesInMinMaxRadiusRange(double minRadius) {
        double maxRadius = 25.0;
        Circle circle1 = new Circle(22);
        Circle circle2 = new Circle(21);
        Circle circle4 = new Circle(29);
        Square rectangle = new Square(1, 1);

        List<Geometric> geometrics = new ArrayList<>();
        geometrics.add(circle1);
        geometrics.add(circle2);
        geometrics.add(circle4);
        geometrics.add(rectangle);

        List<Circle> circles = new GeometricService().findCirclesInMinMaxRadiusRange(geometrics, minRadius, maxRadius);

        // Проверяем результаты
        for (Circle circle : circles) {
            Assertions.assertTrue(circle.getRadius() >= minRadius && circle.getRadius() <= maxRadius);
        }
    }

    @DisplayName("Test calculateShippingCost with @CsvSource")
    @ParameterizedTest
    @CsvSource({
            "1.0",
            "12"
    })
    void findLinesLongerThanLength(double length) {
        Line line = new Line(3);
        Line line2 = new Line(5);
        Line line3 = new Line(9);

        List<Geometric> geometrics = new ArrayList<>();
        geometrics.add(line);
        geometrics.add(line2);
        geometrics.add(line3);

        List<Line> lines = new GeometricService().findLinesLongerThanLength(geometrics, length);

        for (Line value : lines) {
            Assertions.assertTrue(value.getLengthL() > length);
        }

    }
}