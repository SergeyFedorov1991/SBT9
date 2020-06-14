package HomeWork2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Задание 1: Подсчитайте количество различных слов в файле.
public class Task1 {
    public static void main(String[] args) {

        File textFile = new File("src/HomeWork2/words.txt");
        try (Scanner scanner = new Scanner(textFile)) {
            String[] words = null;
            words = scanner.nextLine().split("\\s+");
            wordsCount(words);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void wordsCount(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!map.containsKey(word))
                map.put(word, 0);
            map.put(word, map.get(word) + 1);
        }

        for (String word : map.keySet()) {
            System.out.println(word + " " + map.get(word));
        }
    }

}

