package by.naty.exercises;

import by.naty.logic.Matrix;

public class LocalNeighbors {

    public static String findLocalMinimum(Matrix matrix){
        String positionLocalMin = "-1";
        double rows = matrix.getRows();
        double columns = matrix.getColumns();

        mainLoop:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(isLocalMin(matrix, i, j)) {
                   // System.out.println("[" + i + ", " + j + "] = " + matrix.getElement(i,j));
                    positionLocalMin = "[" + i + ", " + j + "]";
                    break mainLoop;
                }
            }
        }
        return positionLocalMin;
    }

    private static boolean isLocalMin(Matrix matrix, int i, int j)
    {
        // row i-1
        if(i > 0 && checkIrowForMin(matrix, i, j, -1)){
            return false;
        }
        // row i
        if(checkIrowForMin(matrix, i, j, 0)){
            return false;
        }
        // row i+1
        if(i < matrix.getRows()-1 && checkIrowForMin(matrix, i, j, 1)){
            return false;
        }
        return true;
    }

    private static boolean checkIrowForMin(Matrix matrix, int i, int j, int iOffset)
    {
        double elementIJ = matrix.getElement(i,j);

        if(j > 0 && matrix.getElement(i+iOffset,j-1) < elementIJ){
            return true;
        }
        if(matrix.getElement(i+iOffset, j) < elementIJ){
            return true;
        }
        if(j < matrix.getColumns()-1 && matrix.getElement(i+iOffset, j+1) < elementIJ){
            return true;
        }
        return false;
    }



    public static String findLocalMaximum(Matrix matrix){
        String positionLocalMax = "-1";
        double rows = matrix.getRows();
        double columns = matrix.getColumns();

        mainLoop:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(isLocalMax(matrix, i, j)) {
                    positionLocalMax = "[" + i + ", " + j + "]";
                    break mainLoop;
                }
            }
        }
        return positionLocalMax;
    }

    private static boolean isLocalMax(Matrix matrix, int i, int j)
    {
        // row i-1
        if(i > 0 && checkIrowForMax(matrix, i, j, -1)){
            return false;
        }
        // row i
        if(checkIrowForMax(matrix, i, j, 0)){
            return false;
        }
        // row i+1
        if(i < matrix.getRows()-1 && checkIrowForMax(matrix, i, j, 1)){
            return false;
        }
        return true;
    }

    private static boolean checkIrowForMax(Matrix matrix, int i, int j, int iOffset)
    {
        double elementIJ = matrix.getElement(i,j);

        if(j > 0 && matrix.getElement(i+iOffset,j-1) > elementIJ){
            return true;
        }
        if(matrix.getElement(i+iOffset, j) > elementIJ){
            return true;
        }
        if(j < matrix.getColumns()-1 && matrix.getElement(i+iOffset, j+1) > elementIJ){
            return true;
        }
        return false;
    }
}

