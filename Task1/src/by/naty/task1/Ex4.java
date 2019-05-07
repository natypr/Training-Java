package by.naty.task1;

import java.util.Scanner;

/**
 * Разработайте программу, которая проверяет, что цифры четырёхзначного
 * числа N образуют возрастающую (убывающую) последовательность (к примеру,
 * число 1357 удовлетворяет условию, т.к. его цифры соответствуют следующему
 * неравенству: 1 < 3 < 5 < 7, т.е. идут в порядке возрастания).
 */
public class Ex4 {
    public static void main(String[] args) {

        Method1();
    //    Method2();

    }

    private static void Method1(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a four-digit number: ");
        int num = in.nextInt();

        if ((num / 1000 > 0) && (num < 10000) ) {
            boolean check1 = num/1000 < num/100%10 && num/100%10 < num/10%10 && num/10%10 < num%10;
            boolean check2 = num/1000 > num/100%10 && num/100%10 > num/10%10 && num/10%10 > num%10;

            if (check1){
                System.out.println("Increasing sequence");
            }else if (check2){
                System.out.println("Descending sequence");
            }else {
                System.out.println("Numbers don't form any sequence");}

        } else {
            System.out.println("It isn't a four-digit number");
        }
    }


    private static void Method2(){

        int num;
        boolean inc = false;
        boolean dec = false;
        int[] array = new int[4];

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a four-digit number: ");
        num = in.nextInt();

        for(int i = 3; i >= 0; i--){
            array[i] = num % 10;
            num /= 10;
        }

        for(int i = 1; i < array.length; i++){
            if(array[i] > array[i-1]){
                inc = true;
            }else {
                inc = false;
                break;
            }
        }

        for(int i = 1; i <array.length; i++){
            if(array[i] < array[i-1]){
                dec = true;
            }else {
                dec = false;
                break;
            }
        }

        if(inc){
            System.out.println("Increasing sequence");
        }else if(dec){
            System.out.println("Descending sequence");
        }else {
            System.out.println("Numbers don't form any sequence");
        }
    }

}
