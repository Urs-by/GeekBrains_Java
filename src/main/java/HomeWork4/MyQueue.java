package HomeWork4;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class MyQueue {
    private static LinkedList<String> queueList = new LinkedList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ваш выбор:\n" +
                    "1- добавить элемент в очередь; \n" +
                    "2- просмотреть первый элемент в очереди; \n" +
                    "3 -извлечь первый элемент из очереди; \n" +
                    "0 - закончить программу; \n");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            if (num.equals("1")) {
                System.out.println(add());
            } else if (num.equals("2")) {
                System.out.println(top());
            } else if (num.equals("3")) {
                System.out.println(poll());
            } else if (num.equals("0")) {
                scanner.close();
                break;
            }
        }

    }

    private static LinkedList<String> add() {
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите значение или для выхода нажмите Q");
            String value = scanner1.nextLine();
            if (!Objects.equals(value, "Q")) {
                queueList.add(0,value);
                System.out.println(queueList);
            } else {
                break;
            }
        }
        return queueList;
    }


    private static String top() {
        if (queueList.size() == 0) {
            System.out.println("В очереди нет элементов, сперва добавьте элементы в очередь!");
            return null;
        } else {
            System.out.print("Первый элемент в очереди: ");
            return queueList.get(queueList.size()-1);
        }
    }

    private static LinkedList<String> poll() {
        if (top() != null) {
            System.out.println( queueList.get(queueList.size()-1));
            System.out.println("После извлечения в очереди остались:");
            queueList.remove(queueList.size()-1);
        }
        return queueList;
    }



}

