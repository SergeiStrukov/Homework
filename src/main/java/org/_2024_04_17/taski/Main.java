package org._2024_04_17.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Main {
    public static void main(String[] args) {
//        System.out.println(FigureGenerator.generateFigures());
//        System.out.println(FigureTasks.countCirclesOfColor(FigureGenerator.generateFigures(),Color.RED));
//        System.out.println(FigureTasks.findRectangleWithMaxArea(FigureGenerator.generateFigures()));
//        FigureTasks.printEquilateralTriangles(FigureGenerator.generateFigures());
//        System.out.println(FigureTasks.sumOfRadiiForColor(FigureGenerator.generateFigures(), Color.RED));
        System.out.println(FigureTasks.hasRectangleAndTriangleOfSameColor(FigureGenerator.generateFigures()));
    }
}
@Setter
@Getter
@ToString
class Figure {

}
@Setter
@Getter
@ToString
@AllArgsConstructor
class Rectangle extends Figure {
    private Color color;
    private int a;
    private int b;
}
@Setter
@Getter
@ToString
@AllArgsConstructor
class Triangle extends Figure {
    private Color color;
    private int a;
    private int b;
    private int c;
}
@Setter
@Getter
@ToString
@AllArgsConstructor
class Circle extends Figure {
    private Color color;
    private int radius;
}

@ToString
enum Color {
    RED, BLACK, WHITE, BLUE, GREEN, YELLOW, ORANGE, PINK, PURPLE, MULTICOLOR
}
