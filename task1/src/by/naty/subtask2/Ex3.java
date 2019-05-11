package by.naty.subtask2;

import java.util.Scanner;

/**
 * Напишите программу, которая бы определяла, является ли введённая буква
 * (символ) гласной (постарайтесь сделать минимум четырьмя способами,
 * разрешается и больше).
 */
public class Ex3 {

    public static void main(String[] args) {

        System.out.println("- Enter english letter -");

//        Method1();
//        Method2();
//        Method3();
        Method4();

    }


    private static void Method1(){

        char letter;
        Scanner in = new Scanner(System.in);

        do {
            letter = in.nextLine().toLowerCase().charAt(0);

            if (letter == 'a' || letter =='e' || letter =='i' || letter =='o' || letter =='u'){
                System.out.println("Letter " + letter + " is vowel.");
            } else {
                System.out.println("Letter " + letter + " is consonant.");
            }

        } while(true);
    }


    private static void Method2(){

        char letter;
        Scanner in = new Scanner(System.in);

        do {
            letter = in.nextLine().toLowerCase().charAt(0);

            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Letter " + letter + " is vowel.");
                    break;
                default:
                    System.out.println("Letter " + letter + " is consonant.");
            }

        } while(true);
    }


    private static void Method3(){

        char letter;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] consonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
                            'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        Scanner in = new Scanner(System.in);

        do {
            boolean isVowel = false;
            boolean isConsonant = false;

            letter = in.nextLine().toLowerCase().toCharArray()[0];

            for(char c: vowels){
                if(letter == c){
                    isVowel = true;
                }
            }

            for(char c: consonant){
                if(letter == c){
                    isConsonant = true;
                }
            }

            if(isVowel){
                System.out.println("Letter " + letter + " is vowel.");
            }
            else if (isConsonant){
                System.out.println("Letter " + letter + " is consonant.");
            } else {
                System.out.println("It is undefined character " + letter);
            }

        } while(true);
    }


    private static void Method4() {

        char letter;
        Scanner in = new Scanner(System.in);

        do {
            letter = in.nextLine().toLowerCase().charAt(0);
            int codeOfLetter = (int) letter;

            if (letter == 'a' || letter =='e' || letter =='i' || letter =='o' || letter =='u'){
                System.out.println("Letter " + letter + " is vowel.");
            } else if ((codeOfLetter >= (int) 'a') && (codeOfLetter <= (int) 'z')) {
                System.out.println("Letter " + letter + " is consonant.");
            } else if ((codeOfLetter >= (int) '0') && (codeOfLetter <= (int) '9')) {
                System.out.println("This is a number " + letter);
            } else {
                System.out.println("It is undefined character " + letter);
            }

        } while (true) ;

    }

}
