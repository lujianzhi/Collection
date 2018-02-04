package chapter6;

import java.util.Vector;

/**
 * Created by Ian.Lu on 2018/1/29.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
//        test();

        analyzeCode();
    }

    private static void analyzeCode() {
        Vector<String> vector = new Vector<>();

        vector.add("第1");
        vector.add("第2");
        vector.add("第3");
        vector.add("第4");
        vector.add("第5");
        vector.add("第6");
        vector.add("第7");
        vector.add("第8");
        vector.add("第9");
        vector.add("第10");
        vector.add("第11");

        vector.remove(2);

        vector.get(2);

        vector.set(2, "将index=2的值替换");
    }

    private static void test() {
        Vector<String> vector = new Vector<>();

        vector.add("第1");
        vector.add("第2");
        vector.add("第3");
        vector.add("第4");
        vector.add("第5");

        //设置指定位置的元素
        vector.set(1, "将index==1的值替换掉");
        printAll(vector);

        //在指定位置添加元素
        vector.add(1, "在index==1的位置添加元素");
        printAll(vector);

        System.out.println("总容量:" + vector.capacity());
    }

    private static void printAll(Vector<String> vector) {
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i));
        }
        System.out.println();
    }

}
