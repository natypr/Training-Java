package by.naty.subtask1.ex3;

import java.util.Scanner;

/**
 * Натуральное число называют совершенным, если оно равно сумме всех своих
 * делителей, не считая только его самого (например, 28=1+2+3+7+14 –
 * совершенное число). Напишите программу, которая проверяет, является ли
 * введённое натуральное число совершенным. Для проверки работоспособности
 * программы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.
 */
public class Main3 {

    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        System.out.println("This numbers " + number + " is " + Calculation.numberIsPerfectOrNot(number));
    }
}
