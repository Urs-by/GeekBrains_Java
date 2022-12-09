//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

package HomeWork1;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random= new Random();
        int a = random.nextInt(0, 20);
        int b = random.nextInt(0, 20);
        System.out.printf("Сумма 2х чисел %d + %d = %d \n", a, b, a + b);
        System.out.printf("Результат: %s", rangeVerif(a, b));
    }

    static boolean rangeVerif(int a, int b) {
        if (a + b >= 10 && a + b < 21) {
            return true;
        } else {
            return false;
        }
    }

}
