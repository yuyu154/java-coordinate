package coordinate.domain;

import coordinate.AbstractFigure;
import coordinate.Figure;

import java.util.List;

public class TESTNOLINE extends AbstractFigure {

    private TESTNOLINE(final List<Point> points) {
        super(points);
    }

    public static TESTNOLINE of(final List<Point> points) {
        return new TESTNOLINE(points);
    }

    @Override
    public Double getArea() {
        return 0.0;
    }
}
