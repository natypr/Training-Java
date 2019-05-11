package by.naty.subtask1.ex1;

import java.util.Scanner;

/**
 * Необходимо написать программу «Heads or Tails?» («Орёл или решка?»),
 * которая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
 * сколько раз выпал орёл, а сколько – решка.
 */
public class Main1 {

    public static void main(String[] args) {

        int numOfThrows;
        int heads;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of throws of coin: ");
        numOfThrows = scanner.nextInt();

        Coin coin = new Coin(numOfThrows);
        heads = coin.countOfHeads();

        System.out.printf("Coin tossed %d times. %n", numOfThrows);
        System.out.printf("Heads was %d times. Tails was %d times.", heads, numOfThrows - heads);
    }
}
