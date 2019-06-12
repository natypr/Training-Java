package main.by.naty.util;

import java.util.Scanner;

public class ConsoleInput {

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
