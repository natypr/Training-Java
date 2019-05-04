package by.naty.task1;

import java.util.Scanner;

/**
 * Написать программу, которая переворачивает (реверсирует) семизначное
 * число N (к примеру, число 1234567 реверсируется в число 7654321).
 */
public class Ex6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = in.nextLong();

        long numReverse = 0;

        while(num != 0){
            numReverse = numReverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse number " + numReverse);

    }
}
