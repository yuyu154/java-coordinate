package coordinate.domain;

import coordinate.domain.figure.Figure;
import coordinate.domain.figure.Line;

import java.util.List;

public class LineCreator implements FigureCreator {
    @Override
    public Figure create(List<Point> points) {
        return Line.of(points);
    }
}
