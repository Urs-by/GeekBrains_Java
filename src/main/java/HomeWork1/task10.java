// Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
package HomeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int inputLen = scanner.nextInt();
        System.out.print("Введите значение массива: ");
        int inputValue = scanner.nextInt();
        System.out.println(Arrays.toString(createArr(inputLen, inputValue)));
    }
    private static int[] createArr(int len, int initialValue) {
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            newArr[i] = initialValue;
        }
        return newArr;
    }
}
