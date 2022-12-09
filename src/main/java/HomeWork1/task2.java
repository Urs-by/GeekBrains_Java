//Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

package HomeWork1;
import java.util.Random;


public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(-10, 10);
        plusMinusVoid(value);
    }


    private static void plusMinusVoid(int value) {
        if (value >= 0) {
            System.out.printf("Число %d - положительное!", value);
        } else {
            System.out.printf("Число %d - отрицательное!", value);
        }
    }
}
