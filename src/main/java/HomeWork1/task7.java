//Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
package HomeWork1;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int[] newArr = new int[100];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = i + 1;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
