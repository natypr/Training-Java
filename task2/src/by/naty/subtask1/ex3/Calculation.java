package by.naty.subtask1.ex3;

public class Calculation {

    public static String numberIsPerfectOrNot(int number){
        String line;
        int num;
        int sum = 0;

        num = number / 2 + 1;

        for (int i = 1; i < num; i++){
            if (number % i == 0){
                sum += i;
            }
        }

        if (sum == number){
            line = "perfect!";
        } else {
            line = "not perfect.";
        }

        return line;
    }
}
