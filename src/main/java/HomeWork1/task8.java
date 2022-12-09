//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
package HomeWork1;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        int[] hardArr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.printf("Первоначальный массив: %s \n", Arrays.toString(hardArr));
        for (int i = 0; i < hardArr.length; i++) {
            if (hardArr[i] < 6) {
                hardArr[i] = hardArr[i] * 6;
            }
        }
        System.out.printf("Измененный массив: %s \n", Arrays.toString(hardArr));
    }
}
