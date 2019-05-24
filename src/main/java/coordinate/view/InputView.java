package coordinate.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private InputView() {}

    public static String inputCoordinate() {
        System.out.println("좌표를 입력하세요.");
        return SCANNER.nextLine();
    }
}
