package coordinate.domain;

import coordinate.domain.figure.Figure;

import java.util.List;

public interface FigureCreator {
    Figure create(final List<Point> points);
}
