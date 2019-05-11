package by.naty.subtask1;

import java.util.Scanner;

/**
 * Написать программу, которая находит арифметическое и
 * геометрическое среднее цифр шестизначного числа N.
 */
public class Ex5 {

    public static void main(String[] args) {

    //    Method1();
        Method2();

    }

    private static void Method1(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if ( (number / 100_000 > 0) && (number < 1000_000) ){
            int digit1 = number / 100_000;
            int digit2 = number / 10000 % 10;
            int digit3 = number / 1000 % 10;
            int digit4 = number / 100 % 10;
            int digit5 = number / 10 % 10;
            int digit6 = number % 10;

            double arithmeticMean = (digit1 + digit2 + digit3 + digit4 + digit5 + digit6) / 6.0;
            double geometricAverage = Math.pow((digit1 * digit2 * digit3 * digit4 * digit5 * digit6), 1 / 6.0);

            System.out.println("Arithmetic mean = " + arithmeticMean);
            System.out.println("Geometric average = " + geometricAverage);

        } else {
            System.out.println("It isn't a six-digit number");
        }
    }


    private static void Method2(){

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
