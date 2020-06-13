package HomeWork2;

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
                stringList.sort(new StringComparator());
                System.out.println(stringList);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length())
            return 1;
        else if(o1.length() < o2.length())
            return -1;
        else
            return 0;
    }
}

