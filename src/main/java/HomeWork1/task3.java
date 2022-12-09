//Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
package HomeWork1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.println(plusMinusBool(num));
    }

    private static boolean plusMinusBool(int value) {
        if (value >= 0) return false;
        else return true;
    }
}
