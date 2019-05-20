package by.naty.exercises;

import by.naty.logic.Matrix;

public class Transposition {

    public static void transposeMatrix(Matrix matrix){
        int rows = matrix.getRows();
        int columns = matrix.getColumns();

        if (rows == columns){
            for (int i = 0; i < rows; i++){
                for (int j = i; j < columns; j++) {
                    double  elOne = matrix.getElement(i,j);

                    matrix.setElement(i, j, matrix.getElement(j,i));
                    matrix.setElement(j, i, elOne);
                }
            }
        } else {
            System.out.println("Matrix isn't square. Input the matrix, where N = M");
        }
    }
}
