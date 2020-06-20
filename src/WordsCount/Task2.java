package WordsCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Задание 2: Выведите на экран список различных слов файла,
// отсортированный по возрастанию их длины (компаратор сначала по длине слова,
// потом по тексту).

public class Task2 {
    public static void main(String[] args) {
        File textFile = new File("src/HomeWork2/words.txt");
        try (Scanner scanner = new Scanner(textFile)) {
            String[] words = null;

            while (scanner.hasNext()){
                words = scanner.nextLine().split("\\s+");
                List<String> stringList = new ArrayList<>(Arrays.asList(words));

                stringList.sort((s1, s2) -> {
                    if(s1.length() != s2.length())
                        return s1.length() - s2.length();
                    else
                        return s1.compareTo(s2);
                });

                System.out.println(stringList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
