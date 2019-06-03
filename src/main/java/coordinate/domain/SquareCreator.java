package coordinate.domain;

import coordinate.domain.figure.Figure;
import coordinate.domain.figure.Square;

import java.util.List;

public class SquareCreator implements FigureCreator {
    @Override
    public Figure create(final List<Point> points) {
        return Square.of(points);
    }
}
