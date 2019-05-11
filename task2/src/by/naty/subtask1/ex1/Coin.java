package by.naty.subtask1.ex1;

import java.util.Random;

public class Coin {

    private int numOfThrows;

    public Coin(int numOfThrows) {
        this.numOfThrows = numOfThrows;
    }

    public int countOfHeads() {
        int heads = 0;
        int side;

        Random rand = new Random();

        for (int i = 1; i <= numOfThrows; i++) {
            side = rand.nextInt(2) + 1;
            if (side==1){
                heads += 1;
            }
        }

        return heads;
    }

}