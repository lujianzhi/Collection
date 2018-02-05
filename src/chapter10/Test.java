package chapter10;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Ian.Lu on 2018/1/30.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
//        compare();

        analyzeCode();
    }

    private static void analyzeCode() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "第4");
        map.put(2, "第2");
        map.put(2, "第1");
        map.put(3, "第3");

        map.get(2);

        map.keySet();

        map.entrySet();

        map.values();

        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(4, "第4");
        linkedMap.put(2, "第2");
    }

    /**
     * HashMap和LinkedHashMap区别
     */
    private static void compare() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "第4");
        map.put(2, "第2");
        map.put(1, "第1");
        map.put(3, "第3");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);

        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(4, "第4");
        linkedMap.put(2, "第2");
        linkedMap.put(1, "第1");
        linkedMap.put(3, "第3");
        System.out.println(linkedMap.keySet());
        System.out.println(linkedMap.values());
        System.out.println(linkedMap);
    }
}
