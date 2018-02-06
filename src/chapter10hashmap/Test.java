package chapter10hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Ian.Lu on 2018/1/30.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
        compare();

//        analyzeCode();
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
        HashMap<String, String> map = new HashMap<>();
//        map.put("b", "value:b");
//        map.put("e", "value:e");
//        map.put("z", "value:z");
//        map.put("d", "value:d");
//        map.put("g", "value:g");
//        map.put("a", "value:a");
//        map.put("d", "value:d");
//        map.put("x", "value:x");
//        map.put("u", "value:u");
//        map.put("k", "value:k");
//        map.put("m", "value:m");
//        map.put("b", "value:b");
//        map.put("p", "value:p");

        map.put("q", "value:q");
        map.put("w", "value:w");
        map.put("e", "value:e");
        map.put("r", "value:r");
        map.put("t", "value:t");
        map.put("y", "value:y");
        map.put("u", "value:u");
        map.put("i", "value:i");
        map.put("o", "value:o");
        map.put("p", "value:p");
        map.put("a", "value:a");
        map.put("s", "value:s");
        map.put("d", "value:d");
        map.put("f", "value:f");
        map.put("g", "value:g");
        map.put("h", "value:h");
        map.put("j", "value:j");
        map.put("k", "value:k");
        map.put("l", "value:l");
        map.put("z", "value:z");
        map.put("x", "value:x");
        map.put("c", "value:c");
        map.put("v", "value:v");
        map.put("b", "value:b");
        map.put("n", "value:n");
        map.put("m", "value:m");
        System.out.println(map);

        LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("b", "value:b");
        linkedMap.put("e", "value:e");
        linkedMap.put("z", "value:z");
        linkedMap.put("d", "value:d");
        linkedMap.put("g", "value:g");
        linkedMap.put("a", "value:a");
        linkedMap.put("d", "value:d");
        linkedMap.put("x", "value:x");
        linkedMap.put("u", "value:u");
        linkedMap.put("k", "value:k");
        linkedMap.put("m", "value:m");
        linkedMap.put("b", "value:b");
        linkedMap.put("p", "value:p");
        System.out.println(linkedMap);
    }
}
