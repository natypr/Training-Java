package by.naty.task1;

import java.util.Scanner;

/**
 * Разработайте программу, которая проверяет,
 * что числа a, b и c различны(одинаковы).
 */
public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number A: ");
        int a = in.nextInt();
        System.out.print("Enter a number B: ");
        int b = in.nextInt();
        System.out.print("Enter a number C: ");
        int c = in.nextInt();

        if(a==b & a==c & c==b){
            System.out.println("A, B, C are the same.");
        }else if(a==b){
            System.out.println("A, B are the same.");
        }else if(a==c){
            System.out.println("A, C are the same.");
        }else if(b==c){
            System.out.println("B, C are the same.");
        }else {
            System.out.println("All numbers are different.");
        }
    }
}