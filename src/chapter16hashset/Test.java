package chapter16hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Ian.Lu on 2018/2/6.
 * Project : Collection
 */
public class Test {
    public static void main(String[] args) {
        analyzeCode();
    }

    private static void analyzeCode() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("q");
        hashSet.add("w");
        hashSet.add("e");
        hashSet.add("r");
        hashSet.add("t");
        hashSet.add("y");
        hashSet.add("u");
        hashSet.add("i");
        hashSet.add("o");
        hashSet.add("p");
        hashSet.add("a");
        hashSet.add("s");
        hashSet.add("d");
        hashSet.add("f");
        hashSet.add("g");
        hashSet.add("h");
        hashSet.add("j");
        hashSet.add("k");
        hashSet.add("l");
        hashSet.add("z");
        hashSet.add("x");
        hashSet.add("c");
        hashSet.add("v");
        hashSet.add("b");
        hashSet.add("n");
        hashSet.add("m");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }

    }
}
