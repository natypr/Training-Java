package by.naty.subtask1;

import java.util.Scanner;

/**
 * Масса динозавра задаётся в килограммах. Разработайте программу,
 * которая вычисляет, сколько это миллиграмм, грамм и тонн.
 */
public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter dinosaur mass (kg): ");
        double weight = in.nextDouble();

        System.out.println(" = " + weight*1000_000_000 + " milligram");
        System.out.println(" = " + weight*1000 + " gram");
        System.out.println(" = " + weight*0.001 + " tons");

    }

}