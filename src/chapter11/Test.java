package chapter11;

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

        hashtable.put("asd", "value:asd");
        hashtable.put("qwe", "value:qwe");
        hashtable.put("qwe", "value:qwe * 2");
        hashtable.put("zxc", "value:zxc");

        hashtable.get("zxc");
    }

}
