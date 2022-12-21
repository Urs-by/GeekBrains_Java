package HomeWork4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println(metod1());
        System.out.println(metod2());
        metod3();
    }

    private static LinkedList<Integer> createList() {
        LinkedList<Integer> ll = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            ll.add(random.nextInt(20));
        }
        System.out.println("Исходный числовой лист ");
        System.out.println(ll);
        return ll;
    }

    private static void metod3() {
        LinkedList<String> strList = new LinkedList<>();
        Collections.addAll(strList, "папа", "мама", "сын", "дочь", "кот");
        System.out.println("Исходный текстовый лист");
        System.out.println(strList);
        System.out.println("Реверсивный текстовый список ");
        Iterator iterator = strList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }


    private static LinkedList<Integer> metod2() {
        System.out.println("Второй метод ");
        LinkedList<Integer> ll = createList();
        for (int i = 0; i < ll.size(); i++) {
            ll.add(i, ll.getLast());
            ll.removeLast();
        }
        System.out.println("Реверсивный числовой лист ");
        return ll;
    }


    private static LinkedList<Integer> metod1() {
        System.out.println("Первый метод ");
        LinkedList<Integer> ll = createList();
        int temp = 0;
        int lenList = ll.size();
        for (int i = 0; i < (lenList / 2); i++) {
            temp = ll.get(lenList - 1 - i);
            ll.set(lenList - 1 - i, ll.get(i));
            ll.set(i, temp);
        }
        System.out.println("Реверсивный числовой лист ");
        return ll;
    }


}
