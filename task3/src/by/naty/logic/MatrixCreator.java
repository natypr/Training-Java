package by.naty.logic;

import java.util.Random;

public class MatrixCreator {
    private static final double RANGE_MIN = 1;
    private static final double RANGE_MAX = 10;
    private static final double ROUND_TO_00 = 10.0;

    public static void initialize(Matrix matrix) {
        Random random = new Random();

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {

                double temp = RANGE_MIN + (random.nextDouble() * (RANGE_MAX - RANGE_MIN));
                double resultNum = Math.round(temp * ROUND_TO_00) / ROUND_TO_00;
                matrix.setElement(i, j, resultNum);
            }
        }
    }
    public static void initFromConsole(Matrix matrix) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {

                double resultNum = ConsoleInput.readDouble();
                matrix.setElement(i, j, resultNum);
            }
        }
    }
}
