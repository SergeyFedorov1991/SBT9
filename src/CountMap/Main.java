package CountMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Map map1 = new HashMap();

        CountMap<Integer> map = new CountMapImpl<>();

        System.out.println(map.size());
        map.add(10);
        System.out.println(map.size());


/*
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        int count = 0;

        System.out.println(map.getCout(5));
        System.out.println(map.getCout(6));
        System.out.println(map.getCout(10));

 */




    }
}
