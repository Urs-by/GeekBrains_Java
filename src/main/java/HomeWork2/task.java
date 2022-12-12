package HomeWork2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class task {
    static Logger logger = Logger.getLogger("FileNotFound");

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 чтобы решить первую задачу или 2 для решения второй: ");
        int number = scanner.nextInt();
        if (number == 1) {
            boolean result = task2_1();
            if (result) {
                System.out.printf("Введенная строка является палиндромом, результат: %s", result);
            } else {
                System.out.printf("Введенная строка не является палиндромом, результат: %s", result);
            }
        } else if (number == 2) {
            int count = 100;
            String word = "TEST";
            task2_2(count, word);
        } else {
            System.out.print("Вы ввели неверное число");
        }
    }

    //1. Напишите метод, который принимает на вход строку (String) и определяет
    // является ли строка палиндромом (возвращает boolean значение).
    private static boolean task2_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String palindrom = scanner.nextLine();
        palindrom = palindrom.replaceAll("\\s*", "");
        palindrom = palindrom.toLowerCase();

        StringBuilder sb = new StringBuilder(palindrom);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    // который запишет эту строку в простой текстовый файл, обработайте исключения.
    private static void task2_2(int count, String word) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        sb.append(word.repeat(count));

        String created_stroke = sb.toString();
        write_file(created_stroke);
        System.out.print("Данные успешно записаны в файл");
    }

    private static void write_file(String data) throws FileNotFoundException {
        logger.setLevel(Level.ALL);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        try (PrintWriter pw = new PrintWriter("src/main/resources/files/task22.txt")) {
            pw.print(data);
        } catch (FileNotFoundException e) {
            logger.severe("File not found" + e.getMessage());
        }
    }

}

