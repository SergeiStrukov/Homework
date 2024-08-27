package New._2024_08_26.fig;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class GeometricService {

    public List<Square> findPerfectSquares(List<Geometric> geometries) {
        return geometries.stream()
                .filter(geometric -> geometric instanceof Square)
                .map(Square.class::cast)
                .filter(side -> side.getSideAB() == side.getSideBC())
                .toList();
    }

    public static List<Circle> findCirclesInMinMaxRadiusRange(List<Geometric> geometries, double minRadius, double maxRadius) {
        return geometries.stream()
                .filter(geometric -> geometric instanceof Circle)
                .map((el -> (Circle) el))
                .filter(circle -> circle.getRadius() >= minRadius && circle.getRadius() <= maxRadius)
                .collect(Collectors.toList());
    }

    public static List<Line> findLinesLongerThanLength(List<Geometric> geometries, double length) {

        return geometries.stream()
                .filter(geometric -> geometric instanceof Line)
                .map(el -> (Line) el)
                .filter(el -> el.getLengthL() > length)
                .collect(Collectors.toList());
    }

    //Метод возвращает список треугольников (класса Triangle), у которых радиус вписанного круга больше среднего радиуса всех кругов в коллекции.
    public static List<Triangle> findTrianglesWithLargerInscribedCircleThanAverage(List<Geometric> geometries) {
        double avgR = geometries.stream()
                .filter(geometric -> geometric instanceof Circle)
                .mapToDouble((el -> ((Circle) el).getRadius()))
                .average()
                .orElse(0.0);

        // Фильтруем треугольники с радиусом вписанного круга больше среднего
        return geometries.stream()
                .filter(geometric -> geometric instanceof Triangle)
                .map(geometric -> (Triangle) geometric)
                .filter(triangle -> {
                    double a = triangle.getSideAB();
                    double b = triangle.getSideBC();
                    double c = triangle.getSideCA();

                    double semiPerimeter = (a + b + c) / 2;

                    // Проверяем возможность существования треугольника
                    if (semiPerimeter <= a || semiPerimeter <= b || semiPerimeter <= c) {
                        return false; // Некорректный треугольник
                    }

                    double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

                    double inscribedCircleRadius = area / semiPerimeter;

                    return inscribedCircleRadius > avgR;
                })
                .collect(Collectors.toList());

    }

    public static long countByType(List<Geometric> geometries, Class<? extends Geometric> type) {
        return geometries.stream()
                .filter((type::isInstance))
                .count();
    }

    //Метод возвращает список всех квадратов и кругов, у которых стороны (для квадратов) или радиус (для кругов) находятся в заданном диапазоне.
    public static List<Geometric> findSquaresAndCirclesInRange(List<Geometric> geometries, double minValue, double maxValue) {
        return geometries.stream()
                .filter(el -> (el instanceof Circle || el instanceof Square))
                .filter(el -> {
                    if (el instanceof Circle) {
                        double radius = ((Circle) el).getRadius();
                        return radius >= minValue && radius <= maxValue;
                    } else if (el instanceof Square) {
                        double side = ((Square) el).getSideAB();
                        return side >= minValue && side <= maxValue;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}