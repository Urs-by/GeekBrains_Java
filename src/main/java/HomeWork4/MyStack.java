package HomeWork4;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class MyStack {

    private static LinkedList<String> stackList = new LinkedList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ваш выбор:\n" +
                    "1- добавить элемент в стек; \n" +
                    "2- просмотреть верхний элемент в стеке; \n" +
                    "3 -извлечь верхний элемент из стека; \n" +
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
                stackList.add(value);
                System.out.println(stackList);
            } else {
                break;
            }
        }
        return stackList;
    }

    private static String top() {
        if (stackList.size() == 0) {
            System.out.println("В стеке нет элементов, сперва добавьте элементы в стек!");
            return null;
        } else {
            System.out.print("Верхний элемент в стеке: ");
            return stackList.get(stackList.size() - 1);
        }
    }


    private static LinkedList<String> poll() {
        if (top() != null) {
            System.out.println(stackList.get(stackList.size() - 1));
            System.out.println("После извлечения в стеке остались:");
            stackList.remove(stackList.get(stackList.size() - 1));
        }
        return stackList;
    }

}

