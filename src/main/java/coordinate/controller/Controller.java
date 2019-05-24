package coordinate.controller;

import coordinate.domain.board.CoordinateBoard;
import coordinate.domain.Point;
import coordinate.view.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private static final String REGEX = "-";
    private static final Pattern PATTERN = Pattern.compile("\\((.+),(.+)\\)");

    public Controller() {
    }

    public void proceedGame() {
        List<Point> points = assignCoordinates(InputView.inputCoordinate());
        System.out.println(points);
        CoordinateBoard cb = new CoordinateBoard(points);
    }

    private List<Point> assignCoordinates(final String input) {
        List<Point> points = new ArrayList<>();
        for (String coordinate : input.split(REGEX)) {
            points.add(parse(coordinate));
        }
        return points;
    }

    private Point parse(String coordinate) {
        Matcher matcher = PATTERN.matcher(coordinate);
        if (matcher.find()) {
//            System.out.println(matcher.group(1));
            return Point.of(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        }
        throw new IllegalArgumentException("Point 생성 실패");
    }
}
