package by.naty.subtask1.ex4;

public class FriendlyNumbers {

    public int sumOfDividers(int number) {
        int sum = 0;
        int num = number / 2 + 1;

        for (int i = 1; i < num; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public String numberIsFriendlyOrNot(int min, int max){
        StringBuilder line = new StringBuilder();
        int num1, num2;
        int sum1, sum2;

        if (max < 220){
            System.out.println("There are no such numbers.");

        } else {
            for (num1 = min; num1 <= max; num1++) {
                sum1 = sumOfDividers(num1);

                for (num2 = num1 + 1; num2 <= max; num2++) {
                    sum2 = sumOfDividers(num2);
                    if ((sum1 == num2) && (sum2 == num1)) {
                        line.append(" -> ").append(num1).append(" and ").append(num2).append(" are friendly numbers!\n");
                    }

                }
            }
        }
        return line.toString();
    }

}