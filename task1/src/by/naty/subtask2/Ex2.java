package by.naty.subtask2;

import java.util.Scanner;

/**
 * В молодом возрасте дракон каждый год отращивает по три головы, но после
 * того, как ему исполнится 200 лет – только по две, а после 300 лет – лишь по
 * одной. Предполагается, что дракон появляется на свет сразу с тремя головами.
 * Разработайте программу, которая высчитывала бы, сколько голов и глаз у
 * дракона, которому N лет?
 * */
public class Ex2 {

    public static void main(String[] args) {

        int head = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter age of dragon: ");
        int age = in.nextInt();

        for (int i = 0; i <= age; i++){

            if (i < 200){
                head += 3;
            }

            if (i >= 200 & i < 300){
                head += 2;
            }

            if (i >= 300){
                head += 1;
            }
        }

        System.out.printf("Dragon is %d years old. %n", age);
        System.out.printf("He has %d heads and %d eyes. %n", head, head+head);
    }
}
