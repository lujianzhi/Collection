package chapter17treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Ian.Lu on 2018/2/6.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
        analyzeCode();
    }

    private static void analyzeCode() {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("e");
        treeSet.add("c");
        treeSet.add("b");
        treeSet.add("f");
        treeSet.add("a");
        treeSet.add("d");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
    }
}
