package by.naty.task2;

import java.util.Scanner;

/**
 * На прямоугольной декартовой системе координат на плоскости заданы три
 * точки с соответствующими координатами в виде пары значений (x,y).
 * Определить, являются ли данные точки вершинами треугольника. И если да, то
 * дополнительно определить, является ли данный треугольник прямоугольным.
 * */
public class Ex1 {

    public static void main(String[] args) {

        int xa,ya, xb,yb, xc,yc;
        double ab, ac, bc;
        double abSqr, acSqr, bcSqr;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter xa, ya, xb, yb, xc, yc");
        xa = in.nextInt();
        ya = in.nextInt();
        xb = in.nextInt();
        yb = in.nextInt();
        xc = in.nextInt();
        yc = in.nextInt();

        System.out.printf("A(%d,%d); B(%d,%d); C(%d,%d) %n", xa,ya, xb,yb, xc,yc);

        ab = Math.pow((xb-xa)*(xb-xa) + (yb-ya)*(yb-ya), 1.0/2);
        ac = Math.pow((xc-xa)*(xc-xa) + (yc-ya)*(yc-ya), 1.0/2);
        bc = Math.pow((xc-xb)*(xc-xb) + (yc-yb)*(yc-yb), 1.0/2);

        abSqr = ab * ab;
        acSqr = ac * ac;
        bcSqr = bc * bc;

        if (abSqr + acSqr == bcSqr){
            System.out.println("Angle A straight.");
        } else if (abSqr + bcSqr == acSqr){
            System.out.println("Angle B straight.");
        } else if (bcSqr + acSqr == abSqr){
            System.out.println("Angle C straight.");
        } else {
            System.out.println("Triangle is not rectangular!");
        }

    }
}
