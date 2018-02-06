package chapter13;

import java.util.WeakHashMap;

/**
 * Created by Ian.Lu on 2018/2/6.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
        analyzeCode();
    }

    private static void analyzeCode() {
        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();

        weakHashMap.put("b", "value:b");
        weakHashMap.put("e", "value:e");
        weakHashMap.put("z", "value:z");
        weakHashMap.put("d", "value:d");
        weakHashMap.put("g", "value:g");
        weakHashMap.put("a", "value:a");
        weakHashMap.put("d", "value:d");
        weakHashMap.put("x", "value:x");
        weakHashMap.put("u", "value:u");
        weakHashMap.put("k", "value:k");
        weakHashMap.put("m", "value:m");
        weakHashMap.put("b", "value:b");
        weakHashMap.put("p", "value:p");

        weakHashMap.get("lol");

        System.out.println(weakHashMap);
    }
}
