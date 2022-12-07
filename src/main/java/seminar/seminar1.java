package seminar;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class seminar1 {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }
    private static void task1() {
        Scanner scaner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = scaner.nextLine();
        System.out.printf("Привет, %s!", name);
        scaner.close();
    }

    private static void task2() {
        int counter = 0;
        int result = 0;
        Random random = new Random();
        int[] binaryArray = new int[1000];
        for (int i = 0; i < binaryArray.length - 1; i++) {
            binaryArray[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(binaryArray));
        for (int i : binaryArray) {
            if (i == 1) {
                counter += 1;
            } else {
                result = Math.max(result, counter);
                counter = 0;
            }
        }
        System.out.println(Math.max(result, counter));
    }

    private static void task3() {
        Random random = new Random();
        int[] arr = new int[20];
        final int VAL = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(1, 6);
        }
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[right] == VAL) {
                right--;
            } else if(arr[left] == VAL) {
                arr[left] = arr[right];
                arr[right] = VAL;
                right--;
                left++;
            } else if (arr[left] != VAL) {
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
