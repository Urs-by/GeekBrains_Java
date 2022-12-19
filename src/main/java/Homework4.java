import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            ll.add(random.nextInt(20));
        }
        System.out.println("Исходный числовой лист ");
        System.out.println(ll);
        System.out.println("Реверсивный числовой лист ");
        System.out.println(metod1(ll));
//        System.out.println("Второй метод ");
//        System.out.println(metod2(ll));

        metod3();
    }

    private static void metod3() {
        LinkedList<String> strList = new LinkedList<>();
        Collections.addAll(strList,"папа","мама","сын","дочь","кот");
        System.out.println("Исходный текстовый лист");
        System.out.println(strList);
        System.out.println("Реверсивный текстовый список ");
        Iterator iterator = strList.descendingIterator();
        while (iterator.hasNext()) {
//            System.out.printf("%d, ",iterator.next());
            System.out.print(iterator.next() + " ");
        }

    }

//    private static LinkedList<Integer> metod2(LinkedList<Integer> ll) {
//
//        int temp =ll.size();
//        for (int i = 0; i < ll.size(); i++) {
//            temp = ll.get(i);
//            ll.set(i,ll.getLast());
//            ll.removeLast();
//        }
//        //ll.removeLast();
//
//        return ll;
//    }

    private static LinkedList<Integer> metod1(LinkedList<Integer> ll) {
        //1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

        int temp = 0;
        int lenList = ll.size();

        for (int i = 0; i < (lenList / 2); i++) {
            temp = ll.get(lenList - 1 - i);
            ll.set(lenList - 1 - i, ll.get(i));
            ll.set(i, temp);
        }
        return ll;
    }
}
