package by.naty.exercises;

import by.naty.logic.Matrix;

public class Average {

    private static final double ROUND_TO_000 = 1000;

    private static double sumOfElements(Matrix matrix, int rows, int columns){
        double sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix.getElement(i, j);
            }
        }
        return sum;
    }

    public static double arithmeticMean(Matrix matrix){
        int rows = matrix.getRows();
        int columns = matrix.getColumns();

        double sum = sumOfElements(matrix, rows, columns);
        double arithmetic = sum / (rows * columns);

        return Math.round(arithmetic * ROUND_TO_000) / ROUND_TO_000;
    }

    private static double mulOfElements(Matrix matrix, int rows, int columns){
        double multiple = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multiple *= matrix.getElement(i, j);
            }
        }
        return multiple;
    }

    public static double geometricMean(Matrix matrix){
        int rows = matrix.getRows();
        int columns = matrix.getColumns();

        double multiple = mulOfElements(matrix, rows, columns);
        double geometric = Math.pow(multiple, 1.0/ (rows * columns));

        return Math.round(geometric * ROUND_TO_000) / ROUND_TO_000;
    }

}
