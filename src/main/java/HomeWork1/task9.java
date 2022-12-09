//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

package HomeWork1;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы-длину одной стороны: ");
        int lenArr = scanner.nextInt();
        int[] []myArray = new int[lenArr][lenArr];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i][i] = 1;
            myArray[i][myArray.length - 1 - i] = 1;
        }


        for (int[] line : myArray) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}
