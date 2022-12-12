package HomeWork2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
public class task {
    public static void main(String[] args) throws FileNotFoundException {
        task2_2();


    }

    private static void task2_2() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        int count = 100;
        String word = "Test";
        sb.append(word.repeat(count));

        String created_stroke = sb.toString();
        System.out.printf(created_stroke);
        write_file(created_stroke);

    }

    private static void write_file(String data) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter("src/main/resources/files/task2_2.txt")){
            pw.print(data);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
