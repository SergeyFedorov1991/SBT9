package WordsCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке
public class Task6 {
    public static void main(String[] args) {
        File textFile = new File("src/HomeWork2/words.txt");
        try (Scanner scanner = new Scanner(textFile);
             Scanner input   = new Scanner(System.in)) {

            System.out.println("Введите номера строк для вывода: ");
            String[] showLines = input.nextLine().split("\\s");

            List<String> lines = new ArrayList<>();

            while (scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }

            for (String i : showLines) {
                System.out.println(lines.get(Integer.parseInt(i) - 1));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
