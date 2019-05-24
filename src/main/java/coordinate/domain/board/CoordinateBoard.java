package coordinate.domain.board;

import coordinate.Figure;
import coordinate.FigureFactory;
import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoordinateBoard {
    private static final FigureFactory FIGURE_FACTORY = FigureFactory.getInstance();

    private final List<Point> points;
    private final Figure figure;

    public CoordinateBoard(final List<Point> points) {
        validate(points);
        this.points = new ArrayList<>(points);
        if (points.size() == 1) {
            figure = null;
            return;
        }
        this.figure = FIGURE_FACTORY.create(points);
    }

    private void validate(final List<Point> points) {
        Set checkSet = new HashSet<>(points);
        if (checkSet.size() != points.size()) {
            throw new IllegalArgumentException("도형을 만들 수 없습니다");
        }
    }
}
