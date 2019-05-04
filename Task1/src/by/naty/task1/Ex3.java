package by.naty.task1;

import java.util.Scanner;

/**
 * Разработайте программу нахождения площади кольца,
 * внешний радиус которого равен R1, а внутренний радиус равен R2.
 */
public class Ex3 {

    public static void main(String[] args) {

        double ringArea;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a radius r1 = ");
        double r1 = in.nextDouble();
        System.out.print("Enter a radius r2 = ");
        double r2 = in.nextDouble();

        double area1 = Math.PI * r1 * r1;
        double area2 = Math.PI * r2 * r2;

        if (r1 > r2){
            ringArea = area1 - area2;
        } else {
            ringArea = area2 - area1;
        }

        System.out.println("Ring area = " + ringArea);

    }
}
