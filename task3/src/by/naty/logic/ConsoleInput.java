package by.naty.logic;

import java.util.Scanner;

public class ConsoleInput {

    public static int readPositiveInt(){
        int input;
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            input = scanner.nextInt();
            if (input < 1){
                System.out.print("Input positive number: ");
                input = readPositiveInt();
            }
        }
        else {
            System.out.print("Input number (positive): ");
            scanner.next();
            input = readPositiveInt();
        }
        return input;
    }

    public static int readInt(){
        int input;
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            input = scanner.nextInt();
        }
        else {
            System.out.print("Input number: ");
            scanner.next();
            input = readInt();
        }
        return input;
    }

    public static double readDouble(){
        double input;
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextDouble()){
            input = scanner.nextDouble();
        }
        else {
            System.out.print("Input number (double): ");
            scanner.next();
            input = readDouble();
        }
        return input;
    }
}
