package by.naty.task1;

import java.util.Scanner;

/**
 * Разработать небольшую цельную программу, которая меняет местами
 * содержимое двух целочисленных переменных a и b,
 * не используя для этого дополнительных переменных.
 */
public class Ex7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        System.out.println("Originally a=" + a + ", b=" + b);

        if (a==b) {
            System.out.println("The numbers a and b are equal");
        } else {
            a += b;
            b = a - b;
            a -= b;

            System.out.println("After permutation a=" + a + ", b=" + b);
        }
    }

}
