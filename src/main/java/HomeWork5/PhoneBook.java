package HomeWork5;

import java.util.*;

public class PhoneBook {

    public static Map<String, ArrayList<String>> pBook = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ваш выбор:\n" +
                    "1 - добавить запись в справочник; \n" +
                    "2 - просмотреть все записи из справочника; \n" +
                    "3 - удалить запись из справочника\n" +
                    "4 - поиск записи по фамилии \n" +
                    "0 - выйти из программы; \n");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            if (num.equals("1")) {
                record();
            } else if (num.equals("2")) {
                top();
            } else if (num.equals("3")) {
                delete();
            } else if (num.equals("4")) {
                search();
            } else if (num.equals("0")) {
                System.out.println("До свидания");
                break;
            }
        }
    }


    private static String requestSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        return surname.toUpperCase();
    }


    private static ArrayList<String> record_numbers() {
        ArrayList<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер телефона или Q для выхода");
            String number = scanner.nextLine();
            if (number.toUpperCase().equals("Q")) {
                break;
            } else {
                numbers.add(number);
            }
        }
        return numbers;
    }


    private static void search() {
        String surname = requestSurname();
        if (pBook.containsKey(surname)) {
            System.out.printf("%s, телефоны: %s \n", surname, pBook.get(surname));
        } else {
            System.out.println("Запись не найдена!");
        }
    }

    private static void delete() {
        String surname = requestSurname();
        if (pBook.containsKey(surname)) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s, телефоны: %s \n", surname, pBook.get(surname));
            System.out.println("Удалить запись?, Y - да, нет-любая клавиша");
            String answer = scanner.nextLine();
            if (answer.toUpperCase().equals("Y")) {
                pBook.remove(surname);
                System.out.println("Запись успешно удалена");
            }
        } else {
            System.out.println("Запись не найдена!");
        }
    }


    private static void top() {
        for (var item : pBook.entrySet()) {
            System.out.printf("%s, телефоны: %s \n", item.getKey(), item.getValue());
        }
    }


    private static void record() {
        String surname = requestSurname();
        if (pBook.containsKey(surname)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("В справочнике уже есть запись с этой фамилией:");
            System.out.printf("%s, телефоны: %s \n", surname, pBook.get(surname));
            System.out.println("Добавить номер?, Y - да, нет-любая клавиша");
            String answer = scanner.nextLine();
            if (answer.toUpperCase().equals("Y")) {
                ArrayList<String> newnumbers = record_numbers();
                ArrayList<String> oldnumbers = pBook.get(surname);
                for (int i = 0; i < newnumbers.size(); i++) {
                    if (oldnumbers.contains(newnumbers.get(i))) {
                        System.out.printf(" %s номер уже есть в записи \n", newnumbers.get(i));
                    } else {
                        oldnumbers.add(newnumbers.get(i));
                    }
                }
            }
        } else {
            ArrayList<String> numbers = record_numbers();
            pBook.put(surname, numbers);
        }
    }
}
