package WordsCount;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Задание 4: Выведите на экран все строки файла в обратном порядке.
public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("src/HomeWork2/words.txt"))) {

            List<String> list = new ArrayList<>();
            while ( scanner.hasNext() ) {
                list.add(scanner.nextLine());
            }

            for (int i = list.size() - 1 ; i >= 0; i--) {
                System.out.println(list.get(i));
            }

        }
        catch ( FileNotFoundException e ) {
            e.printStackTrace();
            System.out.println("Файл не найден!");
        }


    }
}
