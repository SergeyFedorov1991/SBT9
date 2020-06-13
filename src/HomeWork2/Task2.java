package HomeWork2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Задание 2: Выведите на экран список различных слов файла,
// отсортированный по возрастанию их длины (компаратор сначала по длине слова,
// потом по тексту).

public class Task2 {
    public static void main(String[] args) {
        File textFile = new File("src/HomeWork2/words.txt");
        try (Scanner scanner = new Scanner(textFile)) {
            String[] words = scanner.nextLine().split("\\s+");



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
