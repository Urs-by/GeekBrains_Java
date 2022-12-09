//Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
package HomeWork1;

import java.util.Arrays;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length - 1; i++) {
            myArray[i] = random.nextInt(0, 2);
        }

        System.out.printf("Первоначальный массив: %s \n", Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
        System.out.printf("Измененный массив:     %s \n", Arrays.toString(myArray));
    }
}

