package by.naty.logic;

import by.naty.exercises.Average;
import by.naty.exercises.Extremes;
import by.naty.exercises.LocalNeighbors;
import by.naty.exercises.Transposition;

import static by.naty.logic.ConsoleInput.readPositiveInt;

/**
 * Задана матрица размера N x M. Необходимо выполнить следующие действия:
 * - найти экстремальные значения (минимальный и максимальный
 *   элементы) данной матрицы;
 * - найти среднее арифметическое и среднее геометрическое значения
 *   всех элементов матрицы;
 * - найти позицию первого встретившегося локального минимума(максимума),
 *   а если таких элементов нет, то возвратить -1
 *   (локальный минимум – это элемент, который меньше любого из своих соседей;
 *   локальный максимум – это элемент, который больше любого из своих соседей);
 * - транспонировать матрицу (при решении данного задания не
 *   рекомендуется задействовать дополнительную память).
 */
public class Main {

    public static void main(String[] args) {

        int n, m;

        System.out.print("Enter rows: N = ");
        n = readPositiveInt();
        System.out.print("Enter columns: M = ");
        m = readPositiveInt();

        Matrix matrix = new Matrix(n, m);

        //Check randomly generated matrix.
        MatrixCreator.initialize(matrix);

        //Check the matrix entered from the console.
        //MatrixCreator.initFromConsole(matrix);

        //Check on constant matrix.
        //Matrix matrix = new Matrix();

        System.out.println("Your matrix:");
        matrix.printMatrix();

        System.out.println("Minimal element = " + Extremes.minElement(matrix));
        System.out.println("Maximum element = " + Extremes.maxElement(matrix));

        System.out.println("Arithmetic mean  = " + Average.arithmeticMean(matrix));
        System.out.println("Geometric mean = " + Average.geometricMean(matrix));

        System.out.println("Position of the first local minimum = " + LocalNeighbors.findLocalMinimum(matrix));
        System.out.println("Position of the first local maximum = " + LocalNeighbors.findLocalMaximum(matrix));

        System.out.println("Transposed matrix:");
        Transposition.transposeMatrix(matrix);
        matrix.printMatrix();

    }
}
