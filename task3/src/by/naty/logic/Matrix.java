package by.naty.logic;

public class Matrix {

    private double[][] array;

    public Matrix(int rows, int columns) {
        array = new double[rows][columns];
    }

    public Matrix() {
        array = new double[][]{
                {3.0, 2.2, 1.8},
                {6.8, 3.0, 4.0},
                {5.0, 1.2, 7.0}
        };
    }

    public int getRows() {
        return array.length;
    }

    public int getColumns() {
        return array[0].length;
    }

    public void setElement(int i, int j, double element) {
        array[i][j] = element;
    }

    public double getElement(int i, int j) {
        return array[i][j];
    }

    public void printMatrix(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
