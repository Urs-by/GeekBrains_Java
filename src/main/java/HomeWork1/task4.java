//Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
package HomeWork1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String newStr = scanner.nextLine();
        System.out.print("Введите число: ");
        int numb = scanner.nextInt();
        inputTask4(newStr, numb);
    }

    public static void inputTask4(String myStr, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(myStr);
        }
    }
}
