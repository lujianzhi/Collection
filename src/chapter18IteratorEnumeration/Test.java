package chapter18IteratorEnumeration;

import java.util.*;

/**
 * Created by Ian.Lu on 2018/2/6.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        Random random = new Random();
        for (int i = 0; i < 9000000; i++) {
            hashtable.put(String.valueOf(i), String.valueOf(random.nextInt(100)));
        }

        iterator(hashtable);

        enumeration(hashtable);
    }

    private static void iterator(Hashtable<String, String> hashtable) {
        long startTime = System.currentTimeMillis();
        Iterator<Map.Entry<String, String>> iterator = hashtable.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("iterator duration:" + duration);
    }

    private static void enumeration(Hashtable<String, String> hashtable) {
        long startTime = System.currentTimeMillis();
        Enumeration<String> enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("enumeration duration:" + duration);
    }
}
