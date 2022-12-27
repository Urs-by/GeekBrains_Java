package HomeWork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Laptops {
    public static void main(String[] args) {
        ArrayList<String> companys = new ArrayList<>(Arrays.asList("Apple", "HP", "Dell", "Asus", "Acer", "Lenovo"));
        ArrayList<String> appleProductList = new ArrayList<>(Arrays.asList("MacBook Air", "MacBook Pro"));
        ArrayList<String> appleInchestList = new ArrayList<>(Arrays.asList("13.3", "15.0"));
        ArrayList<String> appleCPUList = new ArrayList<>(Arrays.asList("Intel Core i5", "Intel Core i7", "M1"));
        ArrayList<Integer> appleRamList = new ArrayList<>(Arrays.asList(4, 8, 16, 32));
        ArrayList<String> appleWeighttList = new ArrayList<>(Arrays.asList("1.35", "1.37", "1.83"));


        Random random = new Random();
        String comp = companys.get(random.nextInt(companys.size()));
        String prod = appleProductList.get(random.nextInt(appleProductList.size()));
        String inc = appleInchestList.get(random.nextInt(appleInchestList.size()));
        String proc = appleCPUList.get(random.nextInt(appleCPUList.size()));
        int oz = appleRamList.get(random.nextInt(appleRamList.size()));
        String wes = appleWeighttList.get(random.nextInt(appleWeighttList.size()));

        Laptop first = new Laptop(comp, "ultrabook",prod, inc, proc,oz, "MacOc", wes);

        System.out.println(first);
    }
}
