package by.naty.subtask1;

import java.util.Scanner;

/**
 * Написать программу, которая переворачивает (реверсирует) семизначное
 * число N (к примеру, число 1234567 реверсируется в число 7654321).
 */
public class Ex6 {

    public static void main(String[] args) {

    //    Method1();
        Method2();

    }

    private static void Method1(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = in.nextLong();

        if ((num / 1000_000 > 0) && (num < 10_000_000) ){
            long numReverse = num%10*1000_000 + num/10%10*100_000 + num/100%10*10_000 + num/1000%10*1000
                    + num/10_000%10*100 + num/100_000%10*10 + num/1000_000;

            System.out.println("Reverse number " + numReverse);

        } else {
            System.out.println("It isn't a seven-digit number");
        }
    }

    private static void Method2(){

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
