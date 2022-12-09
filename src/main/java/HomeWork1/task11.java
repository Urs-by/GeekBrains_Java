//* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
package HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int inputLen = scanner.nextInt();
        int[] array = new int[inputLen];
        Random random = new Random();
        for (int i = 0; i < inputLen; i++) {
            array[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < inputLen; i++) {
            min = array[i] < min ? array[i] : min;
            max = array[i] > max ? array[i] : max;
        }
        System.out.printf("Минимальное значение = %d, максимальное значение = %d",min, max);
    }
}
