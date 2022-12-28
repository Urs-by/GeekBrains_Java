package HomeWork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Laptops {
    public static void main(String[] args) {
        ArrayList<Laptop> laptopList = createLaptopList();
        while (true) {
            System.out.println("Ваш выбор:\n" +
                    "1 - просмотреть все записи ; \n" +
                    "2 - отфильтровать по производителю; \n" +
                    "3 - отфильтровать по диагонали;\n" +
                    "4 - отфильтровать по типу памяти; \n" +
                    "5 - отфильтровать по объему ОЗУ;\n" +
                    "6 - отфильтровать по объему жесткого диска;\n" +
                    "0 - выйти из программы \n");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            if (num.equals("1")) {
                readAll(laptopList);
            } else if (num.equals("2")) {
                productFilter(laptopList);
            } else if (num.equals("3")) {
                inchesFilter(laptopList);
            } else if (num.equals("4")) {
                typeMemoryFilter(laptopList);
            } else if (num.equals("5")) {
                ramFilter(laptopList);
            } else if (num.equals("6")) {
                romFilter(laptopList);
            } else if (num.equals("0")) {
                break;
            }
        }
    }


    private static void romFilter(ArrayList<Laptop> laptopList) {
        System.out.println("Введите минимальный объем памяти жесткого диска:");
        Scanner scanner = new Scanner(System.in);
        try {
            Integer ram = scanner.nextInt();
            for (int i = 0; i < laptopList.size(); i++) {
                Laptop temp = laptopList.get(i);
                temp.infoRomLaptop(ram);
            }
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
        }
    }


    private static void ramFilter(ArrayList<Laptop> laptopList) {
        System.out.println("Введите минимальный объем памяти ОЗУ:");
        Scanner scanner = new Scanner(System.in);
        try {
            Integer ram = scanner.nextInt();
            for (int i = 0; i < laptopList.size(); i++) {
                Laptop temp = laptopList.get(i);
                temp.infoRamLaptop(ram);
            }
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
        }
    }

    private static void inchesFilter(ArrayList<Laptop> laptopList) {
        System.out.println("Введите минимальный размер диагонали:");
        Scanner scanner = new Scanner(System.in);
        try {
            Float inch = scanner.nextFloat();
            for (int i = 0; i < laptopList.size(); i++) {
                Laptop temp = laptopList.get(i);
                temp.infoFloatLaptop(inch);
            }
        } catch (Exception e) {
            System.out.println("Вы ввели не правильный формат ");
        }
    }

    private static void typeMemoryFilter(ArrayList<Laptop> laptopList) {
        System.out.println("Выберите из 3х значений памяти: ");
        System.out.println("1-HDD, 2-SSD, 3-FlashStorage");
        Scanner scanner = new Scanner(System.in);
        String typeMemory = scanner.nextLine();
        String arg = "";
        if (typeMemory.equals("1")) {
            arg = "HDD";
        } else if (typeMemory.equals("2")) {
            arg = "SSD";
        } else if (typeMemory.equals("3")) {
            arg = "FlashStorage";
        } else {
            System.out.println("Вы ввели неверное число");
        }
        for (int i = 0; i < laptopList.size(); i++) {
            Laptop temp = laptopList.get(i);
            temp.InfoStringLaptop(arg);
        }
    }

    private static void productFilter(ArrayList<Laptop> laptopList) {
        ArrayList<String> companyList = new ArrayList<>(Arrays.asList("HP", "Dell", "Asus", "Acer", "Lenovo"));
        System.out.print("Введите название производителя: ");
        Scanner scanner = new Scanner(System.in);
        String prod = scanner.nextLine();
        if (companyList.contains(prod)) {
            for (int i = 0; i < laptopList.size(); i++) {
                Laptop temp = laptopList.get(i);
                temp.InfoStringLaptop(prod);
            }
        } else {
            System.out.println("Данного производителя нет в продаже");
        }
    }

    private static void readAll(ArrayList<Laptop> laptops) {
        System.out.println(laptops);
    }

    private static ArrayList<Laptop> createLaptopList() {
        // Из заданных списков параметров формируется рандомный список ноутбуков
        ArrayList<String> companyList = new ArrayList<>(Arrays.asList("HP", "Dell", "Asus", "Acer", "Lenovo"));
        ArrayList<Float> InchestList = new ArrayList<>(Arrays.asList(13.3f, 14.0f, 15.0f, 15.6f));
        ArrayList<String> CPUList = new ArrayList<>(Arrays.asList("Intel Core i3", "Intel Core i5", "Intel Core i7", "AMD A9-Series", "AMD Radeon 52"));
        ArrayList<Integer> RamList = new ArrayList<>(Arrays.asList(4, 8, 16, 32, 64));
        ArrayList<String> memoryTipeList = new ArrayList<>(Arrays.asList("HDD", "SSD", "FlashStorage"));
        ArrayList<Integer> RomList = new ArrayList<>(Arrays.asList(128, 256, 512, 1024));
        ArrayList<Float> WeightList = new ArrayList<>(Arrays.asList(1.35f, 1.37f, 1.83f, 2.13f, 2.4f));

        Random random = new Random();
        ArrayList<Laptop> LaptopList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String company = companyList.get(random.nextInt(companyList.size()));
            Float inches = InchestList.get(random.nextInt(InchestList.size()));
            String cpu = CPUList.get(random.nextInt(CPUList.size()));
            Integer ram = RamList.get(random.nextInt(RamList.size()));
            String memory = memoryTipeList.get(random.nextInt(memoryTipeList.size()));
            Integer rom = RomList.get(random.nextInt(RomList.size()));
            Float weight = WeightList.get(random.nextInt(WeightList.size()));
            Laptop notebook = new Laptop(company, inches, cpu, ram, memory, rom, weight);
            LaptopList.add(notebook);
        }
        return LaptopList;
    }
}



