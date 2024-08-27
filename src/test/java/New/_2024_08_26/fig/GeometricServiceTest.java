package New._2024_08_26.fig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GeometricServiceTest {

    @Test
    void findPerfectSquares() {
        Square square = new Square(1,1);
        Square rectangle = new Square(1,1);
        Triangle triangle = GeometricFactory.generateValidTriangle();
        Line line = new Line(5);

        List<Geometric> geometrics = new ArrayList<>();
        geometrics.add(square);
        geometrics.add(rectangle);
        geometrics.add(triangle);
        geometrics.add(line);

        Square actualSq = new GeometricService().findPerfectSquares(geometrics).get(0);
        Assertions.assertEquals(square,actualSq);
    }
}