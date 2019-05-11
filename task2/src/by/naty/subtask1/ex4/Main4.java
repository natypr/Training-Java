package by.naty.subtask1.ex4;

import java.util.Scanner;

/**
 * Дру́жественные чи́сла — два различных натуральных числа , для которых
 * сумма всех собственных делителей первого числа равна второму числу и
 * наоборот, сумма всех собственных делителей второго числа равна первому
 * числу. Дружественные числа были открыты последователями Пифагора ,
 * которые, однако, знали только одну пару дружественных чисел – 220 и 284.
 * Найдите все дружественные числа в заданном диапазоне.
 */
public class Main4 {

    public static void main(String[] args) {

        int min, max;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers of diapason: ");
        min = scanner.nextInt();
        max = scanner.nextInt();

        FriendlyNumbers fNum = new FriendlyNumbers();

        System.out.println(fNum.numberIsFriendlyOrNot(min, max));
    }
}




