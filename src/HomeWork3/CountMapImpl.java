package HomeWork3;

import java.util.*;

public class CountMapImpl<T> implements CountMap<T> {

    private int count = 0;
    private int size = 0;
    Map<Object, Integer> map = new HashMap<>();

    @Override
    public void add(Object ob) {


        map.put(ob, count);

    }

    @Override
    public int getCount(Object o) {

        if (!map.containsKey(o))
            map.put(o, 0);
        map.put(o, map.get(o) + 1);


        return 0;
    }

    @Override
    public int remove(Object o) {
        return 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void addAll(CountMap source) {

    }

    @Override
    public Map toMap() {
        return null;
    }

    @Override
    public void toMap(Map destination) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
