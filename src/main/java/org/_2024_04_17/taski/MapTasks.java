
package org._2024_04_17.taski;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MapTasks {
    //    //Count circles of a given color:
    public static Map<Color, Integer> countCirclesOfColor(List<Figure> figures) {
        Map<Color, Integer> colorCount = new HashMap<>();
        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                colorCount.put(circle.getColor(), colorCount.getOrDefault(circle.getColor(), 0) + 1);
            }
        }
        return colorCount;
    }

    //
    //Sum of radius for circles of a certain color:
    public static Map<Color, Integer> sumOfRadiiForColor(List<Figure> figures) {
        Map<Color, Integer> radiusSum = new HashMap<>();
        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                radiusSum.put(circle.getColor(), radiusSum.getOrDefault(circle.getColor(), 0) + circle.getRadius());
            }
        }
        return radiusSum;
    }
    //
//    //Find the rectangle with the largest diagonal to perimeter ratio:
    public static Map<Rectangle, Double> findRectangleWithLargestDiagonalToPerimeterRatio(List<Figure> figures) {
        Map<Rectangle, Double> rectangleRatios = new HashMap<>();
        double maxRectangleRatio = 0;
        Rectangle maxRectangle = null;
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i) instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figures.get(i);
                double rectangleDiagonal = Math.pow(Math.pow(rectangle.getA(), 2) + Math.pow(rectangle.getB(), 2), 0.5);
                double perimeter = (rectangle.getA() + rectangle.getB()) * 2;
                double rectangleRatio = rectangleDiagonal / perimeter;
                if (rectangleRatio >= maxRectangleRatio) {
                    maxRectangleRatio = rectangleRatio;
                    maxRectangle = rectangle;
                }
            }
        }
        if (maxRectangle != null) {
            rectangleRatios.put(maxRectangle, maxRectangleRatio);
        }
        return rectangleRatios;
    }

    //Find circles with radius equal to any triangle side:
    public static Map<Circle, Boolean> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {
        Map<Circle, Boolean> result = new HashMap<>();
        List<Circle> circles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();
        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                circles.add(circle);
            } else if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                triangles.add(triangle);
            }
        }
        for (Circle circle : circles) {
            for (Triangle triangle : triangles) {
                if (circle.getRadius() == triangle.getA() || circle.getRadius() == triangle.getB() || circle.getRadius() == triangle.getC()) {
                    result.put(circle, true);
                    break;
                }
            }
            if (!result.containsKey(circle)) {
                result.put(circle, false);
            }
        }
        return result;
    }

    //Determine if there's a rectangle and triangle of the same color:
    public static Map<Color, Boolean> hasRectangleAndTriangleOfSameColor(List<Figure> figures) {
        Map<Color, Boolean> result = new HashMap<>();
        List<Color> rectanglesColors = new ArrayList<>();
        List<Color> trianglesColors = new ArrayList<>();
        for (Figure figure : figures) {
            if (figure instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) figure;
                if (!rectanglesColors.contains(rectangle.getColor())) {
                    rectanglesColors.add(rectangle.getColor());
                }
            } else if (figure instanceof Triangle) {
                Triangle triangle = (Triangle) figure;
                if (!trianglesColors.contains(triangle.getColor())) {
                    trianglesColors.add(triangle.getColor());
                }
            }
        }
        for (Color rectangleColor : rectanglesColors) {
            for (Color triangleColor : trianglesColors) {
                if (rectangleColor.equals(triangleColor)) {
                    result.put(rectangleColor, true);
                    break;
                }
            }
            if (!result.containsKey(rectangleColor)) {
                result.put(rectangleColor, false);
            }
        }
        return result;
    }
}


//Calculate Average Radius of Circles Grouped by Color:
//public static Map<Color, Double> averageRadiusOfCirclesByColor(List<Figure> figures)


