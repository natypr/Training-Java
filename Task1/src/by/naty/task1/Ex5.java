package by.naty.task1;

import java.util.Scanner;

/**
 * Написать программу, которая находит арифметическое и
 * геометрическое среднее цифр шестизначного числа N.
 */
public class Ex5 {

    public static void main(String[] args) {

        int digit;
        int sumOfDigit = 0;
        int mulOfDigit = 1;
        int count = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        while (number > 0){

            digit = number % 10;
            sumOfDigit += digit;
            mulOfDigit *= digit;
            number /= 10;

            count++;
        }

        double arithmeticMean = (double)sumOfDigit / count;
        double geometricAverage = Math.pow(mulOfDigit, 1.0/count);

        System.out.println("Arithmetic mean = " + arithmeticMean);
        System.out.println("Geometric average = " + geometricAverage);

    }
}
