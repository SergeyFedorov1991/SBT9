package HomeWork2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке
public class Task6 {
    public static void main(String[] args) {
        File textFile = new File("src/HomeWork2/words.txt");
        try (Scanner scanner = new Scanner(textFile)) {

            List<String> lines = new ArrayList<>();

            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }

            int[] showLines = {1, 1, 3};

            for (int i : showLines) {
                System.out.println(lines.get(i - 1));
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
