package HomeWork2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
public class Task5 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("src/HomeWork2/words.txt"))) {


            List<String> list = new ArrayList<>();
            while ( scanner.hasNext() ) {
                list.add(scanner.nextLine());
            }

            for (String s : new ReverseIterator<>(list)) {
                System.out.println(s);
            }

        }
        catch ( FileNotFoundException e ) {
            e.printStackTrace();
            System.out.println("Файл не найден!");
        }

    }
}

class ReverseIterator<T> implements Iterator<T>, Iterable<T>{

    private final List<T> list;
    private int position;

    public ReverseIterator(List<T> list) {
        this.list = list;
        this.position = list.size() - 1;
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public T next() {
        return list.get(position--);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
