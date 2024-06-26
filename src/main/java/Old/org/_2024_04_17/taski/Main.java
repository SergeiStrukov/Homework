package Old.org._2024_04_17.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static Old.org._2024_04_17.taski.FigureTasks.findCircleWithMinRadiusOfColor;

public class Main {
    public static void main(String[] args) {
//        System.out.println(FigureGenerator.generateFigures());
//        System.out.println(FigureTasks.countCirclesOfColor(FigureGenerator.generateFigures(),Color.RED));
//        System.out.println(FigureTasks.findRectangleWithMaxArea(FigureGenerator.generateFigures()));
//        FigureTasks.printEquilateralTriangles(FigureGenerator.generateFigures());
//        System.out.println(FigureTasks.sumOfRadiiForColor(FigureGenerator.generateFigures(), Color.RED));
//        System.out.println(FigureTasks.findRectangleAndTriangleOfSameColor(FigureGenerator.generateFigures()));
//        System.out.println(FigureTasks.findCircleWithMinRadiusOfColor(FigureGenerator.generateFigures(), Color.PINK));
//        System.out.println(FigureTasks.countTrianglesWithSideGreaterThan(FigureGenerator.generateFigures(), 99));
//        System.out.println(" ");
//        System.out.println(FigureTasks.findCirclesWithRadiusEqualToTriangleSide(FigureGenerator.generateFigures()));
//        System.out.println(FigureTasks.findTriangleWithSmallestSideDifference(FigureGenerator.generateFigures()));
//        System.out.println(MapTasks.countCirclesOfColor(FigureGenerator.generateFigures()));
//        System.out.println(MapTasks.sumOfRadiiForColor(FigureGenerator.generateFigures()));
//        System.out.println(MapTasks.findRectangleWithLargestDiagonalToPerimeterRatio(FigureGenerator.generateFigures()));
//        System.out.println("--------------");
//        System.out.println(MapTasks.findCirclesWithRadiusEqualToTriangleSide(FigureGenerator.generateFigures()));
//        System.out.println(MapTasks.hasRectangleAndTriangleOfSameColor(FigureGenerator.generateFigures()));
//        System.out.println(FigureTasks.countTrianglesWithSideGreaterThan(FigureGenerator.generateFigures(), 90));
        System.out.println(findCircleWithMinRadiusOfColor(FigureGenerator.generateFigures(), Color.RED));
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
