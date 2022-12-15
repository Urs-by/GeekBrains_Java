package homeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.Random;

public class HomeWork3 {


    private static Random random = new Random();


    public static void main(String[] args) {

        task3_1();
        task3_2();
    }

    private static void task3_2() {
        System.out.println("Задача 2");
        System.out.println("Задан целочисленный список ArrayList. " +
                "Найти минимальное, максимальное и среднее арифметическое из этого списка.");
        ArrayList<Integer> newList = createList();

        System.out.println(newList);
        float sum = 0;
        for (Integer i : newList) {
            sum  += i;
        }
        float avereg = (sum / newList.size());

        Optional<Integer> min = newList.stream().min(Integer::compare);
        Optional<Integer> max = newList.stream().max(Integer::compare);
        System.out.printf("минимальное число из списка: %d\n", min.get());
        System.out.printf("максимальное число из списка: %d\n", max.get());
        System.out.printf("cреднее арифметическое из этого списка: %f \n", avereg);
        System.out.printf("другим методом min= %d , max =%d", Collections.min(newList), Collections.max(newList));

    }

    private static void task3_1() {
        System.out.println("Задача 1");
        System.out.println("Дан произвольный список целых чисел, удалить из него четные числа");

        ArrayList<Integer> newList = createList();


        System.out.println(newList);
        newList.removeIf(i -> (i % 2) == 0);
        System.out.println("Измененный список:");
        System.out.println(newList);

    }

    private static ArrayList<Integer> createList(){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newList.add(random.nextInt(-10,10) );
        }
        return newList;
    }

}
