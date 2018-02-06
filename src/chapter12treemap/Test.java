package chapter12treemap;

import java.util.TreeMap;

/**
 * Created by Ian.Lu on 2018/2/5.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
        analyzeCode();
    }

    private static void analyzeCode() {
        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("b", "value:b");
        treeMap.put("e", "value:e");
        treeMap.put("z", "value:z");
        treeMap.put("d", "value:d");
        treeMap.put("g", "value:g");
        treeMap.put("a", "value:a");
        treeMap.put("d", "value:d");
        treeMap.put("x", "value:x");
        treeMap.put("u", "value:u");
        treeMap.put("k", "value:k");
        treeMap.put("m", "value:m");
        treeMap.put("b", "value:b");
        treeMap.put("p", "value:p");

        System.out.println(treeMap);
    }
}
