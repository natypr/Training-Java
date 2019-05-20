package by.naty.exercises;

import by.naty.logic.Matrix;

public class Extremes {

    public static double minElement(Matrix matrix){
        double minElement = matrix.getElement(0, 0);
        double rows = matrix.getRows();
        double columns = matrix.getColumns();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (minElement > matrix.getElement(i, j)) {
                    minElement = matrix.getElement(i, j);
                }
            }
        }
        return minElement;
    }

    public static double maxElement(Matrix matrix){
        double maxElement = matrix.getElement(0, 0);
        double rows = matrix.getRows();
        double columns = matrix.getColumns();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (maxElement < matrix.getElement(i, j)) {
                    maxElement = matrix.getElement(i, j);
                }
            }
        }
        return maxElement;
    }
}
