//* Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
package HomeWork1;

import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int year = 2022;
        //int year = random.nextInt(0,4001);
        boolean ver_year = leapYear(year);
        if (ver_year){
            System.out.printf("Год %d - високосный, значение - %s", year, ver_year);
        } else{
            System.out.printf("Год %d - Не високосный, значение -  %s", year, ver_year);
        }
    }
    private static boolean leapYear(int year) {
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else return year % 4 == 0;
    }

}
