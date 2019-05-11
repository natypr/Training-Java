package by.naty.subtask1.ex2;

public class Algorithms {

    //------------------------ 1 ------------------------
    public static int printMaxDigit(int number){
        int digit;
        int max = 0;

        while (number > 0){
            digit = number % 10;
            if (digit > max){
                max = digit;
            }
            number /= 10;
        }
        return max;
    }


    //------------------------ 2 ------------------------
    private static String isPalindrom(String str) {
        if (str.equals(new StringBuilder().append(str).reverse().toString())){
            return "palindrom";
        }
        return "not palindrom";
    }

    public static String checkPalindrom(int number){
        String str = String.valueOf(number);
        return isPalindrom(str);
    }


    //------------------------ 3 ------------------------
    public static boolean isPrime(int number) {
        double s = Math.sqrt(number);

        if (number < 2){
            return false;
        }
        for (int i = 2; i <= s; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static String checkPrime(int number){
        String line;

        if (Algorithms.isPrime(number)){
           line = "is prime";
        } else {
            line = "is not prime";
        }
        return line;
    }


    //------------------------ 4 ------------------------
    public static String checkSimpleDividers(int number){
        String line = "";
        for (int i = 1; i < number+1 ; i++){
            if ((number % i == 0) && isPrime(i)){
                line += i + " ";
            }
        }
        return line;
    }


    //------------------------ 5 ------------------------
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm (int a, int b){
        return a * b / gcd(a,b);
    }


    //------------------------ 6 ------------------------
    public static int countOfDifferentDigits(int number){

        int count = 0;
        int[] digitsCount = new int[10];

        while (number!=0)
        {
            digitsCount[(int)(number%10)]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++)
        {
            if (digitsCount[i] > 0) {
                count++;
            }
        }

        return count;
    }

}
