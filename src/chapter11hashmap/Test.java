package chapter11hashmap;

import java.util.Hashtable;

/**
 * Created by Ian.Lu on 2018/2/4.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {

        analyzeCode();
    }

    private static void analyzeCode() {
        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("b", "value:b");
        hashtable.put("e", "value:e");
        hashtable.put("z", "value:z");
        hashtable.put("d", "value:d");
        hashtable.put("g", "value:g");
        hashtable.put("a", "value:a");
        hashtable.put("d", "value:d");
        hashtable.put("x", "value:x");
        hashtable.put("u", "value:u");
        hashtable.put("k", "value:k");
        hashtable.put("m", "value:m");
        hashtable.put("b", "value:b");
        hashtable.put("p", "value:p");

        hashtable.get("zxc");

        System.out.println(hashtable);
    }

}
