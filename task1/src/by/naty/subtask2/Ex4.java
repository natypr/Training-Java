package by.naty.subtask2;

import java.util.Scanner;

/**
 * Даны три целых числа, которые задают некоторую дату по Грегорианскому
 * календарю (https://ru.wikipedia.org/wiki/Григорианский_календарь). Определить
 * дату следующего дня. Запрещается использовать типы стандартной библиотеки
 * языка для работы с датой и временем. Также необходимо учесть то, что по
 * григорианскому календарю (используется в настоящий момент) високосный год
 * определяется следующим образом:
 *  + годы, кратные 4 – високосные (например, 2008, 2012, 2016);
 *  + годы, кратные 4 и 100 – невисокосные (например, 1700, 1800, 1900);
 *  + годы, кратные 4, 100 и 400 – високосные (например, 1600, 2000, 2400).
 */


public class Ex4 {
    public static void main(String[] args) {

        int [] daysOfMonthYear =     {31,28,31,30,31,30,31,31,30,31,30,31};
        int [] daysOfMonthLeapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day, month, year;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter data in format dd mm yyyy: ");
        String userDate = in.nextLine();

        day = Integer.valueOf(userDate.split(" ")[0]);
        month = Integer.valueOf(userDate.split(" ")[1]) - 1;
        year = Integer.valueOf(userDate.split(" ")[2]);


        if (isLeapYear(year)) {
            if (daysOfMonthLeapYear[month] >= day+1) {
                System.out.println((day + 1) + "." + (month + 1) + "." + year);
            } else {
                if (month + 1 < 12) {
                    System.out.println("01.0" + (month + 2) + "." + year);
                } else {
                    System.out.println("01.01." + (year + 1));
                }
            }
        }
        else {
            if (daysOfMonthYear[month] >= day+1) {
                System.out.println((day + 1) + "." + (month + 1) + "." + year);
            } else {
                if (month + 1 < 12) {
                    System.out.println("01.0" + (month + 2) + "." + year);
                } else {
                    System.out.println("01.01." + (year + 1));
                }
            }
        }
    }

    private static boolean isLeapYear(int year) {
        if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            return true;
        }
        return false;
    }
}