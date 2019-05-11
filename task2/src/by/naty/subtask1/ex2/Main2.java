package by.naty.subtask1.ex2;

import java.util.Scanner;

/**
 * Разработать наиболее эффективные алгоритмы и написать код для решения
 * следующих задач:
 *   1- найти наибольшую цифру натурального числа;
 *   2- проверить, является ли заданное натуральное число палиндромом;
 *   3- определить является ли заданное натуральное число простым;
 *   4- найти все простые делители заданного натурального числа;
 *   5- найти НОД и НОК двух натуральных чисел a и b.
 *   6- найти количество различных цифр у заданного натурального числа.
 */
public class Main2 {

    public static void main(String[] args) {

        int userNumber1, userNumber2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        userNumber1 = scanner.nextInt();
        userNumber2 = scanner.nextInt();


        System.out.println("1) Find max digit. In " + userNumber1 + " it is " + Algorithms.printMaxDigit(userNumber1));
        System.out.println("2) Palindrome check. " + userNumber1 + " is " + Algorithms.checkPalindrom(userNumber1));
        System.out.println("3) Check prime. " + userNumber1 + " " + Algorithms.checkPrime(userNumber1));
        System.out.println("4) Simple dividers. " + userNumber1 + " is " + Algorithms.checkSimpleDividers(userNumber1));

        System.out.printf("5) GCD(%d; %d) = %d %n", userNumber1, userNumber2, Algorithms.gcd(userNumber1, userNumber2));
        System.out.printf("   LCM(%d; %d) = %d %n", userNumber1, userNumber2, Algorithms.lcm(userNumber1, userNumber2));

        System.out.println("6) Count of different digits in " + userNumber1 + " is " + Algorithms.countOfDifferentDigits(userNumber1));
    }
}