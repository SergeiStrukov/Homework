package org._2024_04_17.taski;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FigureTasks {

    // ****************** Basic Tasks ******************

    /**
     * 1. Напишите метод для подсчета всех кругов заданного цвета в списке фигур.
     */
//    public static int countCirclesOfColor(List<Figure> figures, Color color) {
//        int sum = 0;
//        for (int i = 0; i < figures.size(); i++) {
//            if (figures.get(i) instanceof Circle && ((Circle) figures.get(i)).getColor().equals(color)) {
//                sum++;
//            }
//        }
//        System.out.println(figures);
//        return sum;
//        return figures.stream()
//                .filter(
//                        figure -> {
//                            if (figure instanceof Circle &&((Circle) figure).getColor().equals(color)){
//                            }
//                        }
//                )
//    }

    /**
     * 2. Напишите метод для нахождения прямоугольника с максимальной площадью.
     */
    public static Rectangle findRectangleWithMaxArea(List<Figure> figures) {
//        Rectangle maxRectangle = null;
//        int maxSquare = 0;
//        for (int i = 0; i < figures.size(); i++) {
//            if (figures.get(i) instanceof Rectangle) {
//                Rectangle rectangle = (Rectangle) figures.get(i);
//                int square = rectangle.getA() * rectangle.getB();
//                if (square > maxSquare) {
//                    maxSquare = square;
//                    maxRectangle = rectangle;
//                }
//            }
//        }
//        System.out.println(figures);
//        return maxRectangle;
        return (Rectangle) figures.stream()
                .filter(figure -> figure instanceof Rectangle)
                .max((figure1, figure2) -> (int) (((Rectangle) figure1).getA() * ((Rectangle) figure1).getB()) -
                        (((Rectangle) figure2).getA() * ((Rectangle) figure2).getB())
                )
                .get();
    }

    /**
     * 3. Напишите метод для вывода всех треугольников, у которых все стороны равны.
     */
    public static void printEquilateralTriangles(List<Figure> figures) {
        List<String> sameTriangles = new ArrayList<>();
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i) instanceof Triangle) {
                Triangle triangle = (Triangle) figures.get(i);
                if (triangle.getA() == triangle.getB() && triangle.getB() == triangle.getC()) {
                    sameTriangles.add(triangle.toString());
                }
            }
        }
        System.out.println(sameTriangles);
    }

    /**
     * 4. Напишите метод для нахождения суммы радиусов всех кругов определенного цвета.
     */
    public static int sumOfRadiiForColor(List<Figure> figures, Color color) {
        int sum = 0;
//        for (int i = 0; i < figures.size(); i++) {
//            if (figures.get(i) instanceof Circle) {
//                Circle circle = (Circle) figures.get(i);
//                if (circle.getColor().equals(color)) {
//                    sum += circle.getRadius();
//                }
//            }
//        }
//            System.out.println(figures);
        figures.stream()
                .filter(figure -> figure instanceof Circle && ((Circle) figure).getColor().equals(color))
                .mapToInt(figure -> ((Circle) figure).getRadius())
                .sum();
        return sum;
    }

    /**
     * 5. Напишите метод для определения, есть ли в списке фигур прямоугольник и треугольник одинакового цвета.
     */
    public static boolean findRectangleAndTriangleOfSameColor(List<Figure> figures) {
        List<Color> rectangle = new ArrayList<>();
//        for (int i = 0; i < figures.size(); i++) {
//            if (figures.get(i) instanceof Rectangle) {
//                rectangle.add((((Rectangle) figures.get(i)).getColor()));
//            }
//            if (figures.get(i) instanceof Triangle) {
//                Triangle triangle = (Triangle) figures.get(i);
//                if (rectangle.contains((triangle.getColor()))) {
//                    return true;
//                }
//            }
//        }
        Set<Color> rectangleColors =
                figures.stream()
                        .filter(figure -> figure instanceof Rectangle)
                        .map(el -> ((Rectangle) el).getColor())
                        .collect(Collectors.toSet());

        return figures.stream()
                .anyMatch(figure -> figure instanceof Triangle && rectangleColors.contains(((Triangle) figure).getColor()));
    }

    //
//    // ****************** Intermediate Tasks ******************
//
//    /**
//     * 6. Напишите метод для нахождения круга с минимальным радиусом среди кругов заданного цвета.
//     */
    public static Circle findCircleWithMinRadiusOfColor(List<Figure> figures, Color color) {
//        Circle minCircle = null;
//        int minRadius = 50;
//        for (Figure figure : figures) {
//            if (figure instanceof Circle) {
//                Circle circle = (Circle) figure;
//                if (circle.getColor().equals(color) && circle.getRadius() < minRadius) {
//                    minCircle = circle;
//                    minRadius = circle.getRadius();
//                }
//            }
//        }
//        return minCircle;
        Optional<Circle> minCircle = figures.stream()
                .filter(figure -> figure instanceof Circle && color.equals(((Circle) figure).getColor()))
                .map(el -> (Circle) el)
                .min((circle1, circle2) -> Double.compare(circle1.getRadius(), circle2.getRadius()));
        return minCircle.orElse(null);
    }

    //
//    /**
//     * 7. Напишите метод для подсчета треугольников, у которых хотя бы одна сторона больше заданного значения.
//     */
    public static int countTrianglesWithSideGreaterThan(List<Figure> figures, int length) {
//        int countTriangles = 0;
//        for (Figure figure : figures) {
//            if (figure instanceof Triangle) {
//                Triangle triangle = (Triangle) figure;
//                if (triangle.getA() > length || triangle.getB() > length || triangle.getC() > length) {
//                    countTriangles++;
//                }
//            }
//        }
////        System.out.println(figures);

        return
                (int) figures.stream()
                        .filter(figure -> figure instanceof Triangle && (((Triangle) figure).getC() > length || ((Triangle) figure).getB() > length
                                || ((Triangle) figure).getA() > length))
                        .peek(figure -> System.out.println(figure))
                        .count();
    }

    //
//    /**
//     * 9. Напишите метод для нахождения всех кругов, у которых радиус равен любой из сторон любого треугольника.
//     */
    public static List<Circle> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {
        List<Circle> circles = new ArrayList<>();
//        for (Figure figure1 : figures) {
//            if (figure1 instanceof Circle) {
//                Circle circle1 = (Circle) figure1;
//                for (Figure figure2 : figures) {
//                    if (figure2 instanceof Triangle) {
//                        Triangle triangle = (Triangle) figure2;
//                        if ((circle1.getRadius() == triangle.getC() || circle1.getRadius() == triangle.getB() || circle1.getRadius() == triangle.getA()) &&
//                                !circles.contains(circle1)) {
//                            circles.add(circle1);
//                        }
//                    }
//                }
//            }
//        }
        circles =
                figures.stream()
                        .filter(figure -> figure instanceof Circle)
                        .map(figure -> (Circle) figure)
                        .collect(Collectors.toList());
        List<Integer> triangleSides =
                figures.stream()
                        .filter(figure -> figure instanceof Triangle)
                        .flatMap(figure -> {
                            Triangle triangle = (Triangle) figure;
                            return List.of(triangle.getA(), triangle.getB(), triangle.getC()).stream();
                        })
                        .collect(Collectors.toList());

        // Находим круги, радиусы которых совпадают с любой стороной треугольников
        List<Circle> matchCircles = circles.stream()
                .filter(circle -> triangleSides.contains(circle.getRadius()))
                .collect(Collectors.toList());

        return matchCircles;
    }
//                .anyMatch(figure -> figure instanceof Triangle && rectangleColors.contains(((Triangle) figure).getColor()));


    //
//    // ****************** Upper Intermediate Tasks ******************
//
//    /**
//     * 11. Напишите метод для нахождения треугольника, у которого разница между
//     * максимальной и минимальной сторонами минимальна среди всех треугольников.
//     */
    public static Triangle findTriangleWithSmallestSideDifference(List<Figure> figures) {
        Triangle triangleSides = null;
        int sidesDiff = 100;
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i) instanceof Triangle) {
                Triangle triangle = (Triangle) figures.get(i);
                int diff1 = triangle.getA() - triangle.getB();
                int diff2 = triangle.getA() - triangle.getC();
                int diff3 = triangle.getB() - triangle.getC();
                if (Math.abs(diff1) < Math.abs(diff2) && Math.abs(diff1) < Math.abs(diff3) && Math.abs(diff1) < sidesDiff) {
                    triangleSides = triangle;
                    sidesDiff = Math.abs(diff1);
                } else if (Math.abs(diff2) < Math.abs(diff1) && Math.abs(diff2) < Math.abs(diff3) && Math.abs(diff2) < sidesDiff) {
                    triangleSides = triangle;
                    sidesDiff = Math.abs(diff2);
                } else if (Math.abs(diff3) < Math.abs(diff1) && Math.abs(diff3) < Math.abs(diff2) && Math.abs(diff3) < sidesDiff) {
                    triangleSides = triangle;
                    sidesDiff = Math.abs(diff3);
                }
            }
        }
        return triangleSides;
    }
//
//    /**
//     * 12. Напишите метод для вывода всех фигур, у которых хотя бы один параметр
//     * (цвет, радиус, сторона) совпадает с аналогичным параметром другой фигуры.
//     */
//    public static void printFiguresWithAtLeastOneMatchingParameter(List<Figure> figures) {
//    }
//
//    // Helper method to determine if two figures have at least one matching parameter
//    private static boolean figuresMatch(Figure a, Figure b) {
//        return false;
//    }
//
//    /**
//     * 13. Напишите метод для нахождения кругов, у которых радиус больше суммы сторон любого треугольника в списке.
//     */
//    public static List<Circle> findCirclesWithRadiusGreaterThanSumOfAnyTriangleSides(List<Figure> figures) {
//
//        return null;
//    }
//
//    // ****************** Advanced Tasks ******************
//
//    /**
//     * 16. Напишите метод для нахождения круга, который можно вписать в
//     * наибольшее количество треугольников, учитывая их углы и стороны.
//     */
//    public static Circle findCircleThatFitsMostTriangles(List<Figure> figures) {
//        return null;
//    }
//
//
//    /**
//     * 19. Напишите метод для определения треугольника с наименьшим углом, вписывающимся в заданный круг.
//     */
//    public static Triangle findSmallestAngleTriangleInCircle(Circle circle, List<Figure> figures) {
//        return null;
//    }
//
//    // ****************** Expert Tasks ******************
//
//    /**
//     * 21. Напишите метод для определения круга,
//     * у которого соотношение площади к радиусу является наименьшим среди всех кругов.
//     */
//    public static Circle findCircleWithSmallestAreaToRadiusRatio(List<Figure> figures) {
//        return null;
//    }
//
//    /**
//     * 23. Напишите метод для определения, можно ли составить
//     * из треугольников полигон без промежутков и наружных выступов.
//     */
//    public static boolean canFormClosedPolygonFromTriangles(List<Figure> figures) {
//        return true;
//    }
//
//    /**
//     * 24. Напишите метод для определения прямоугольника с наибольшим отношением диагонали к периметру.
//     */
//    public static Rectangle findRectangleWithLargestDiagonalToPerimeterRatio(List<Figure> figures) {
//        return null;
//    }
//
//    /**
//     * 25. Напишите метод для нахождения всех комбинаций фигур,
//     * которые могут быть соединены таким образом, чтобы их общая площадь была равна заданному значению.
//     */
//    public static List<List<Figure>> findFigureCombinationsMatchingArea(List<Figure> figures, int targetArea) {
//        return null;

}
