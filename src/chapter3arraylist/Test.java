package chapter3arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ian.Lu on 2018/1/24.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
//        cloneTest();

//        printTest();

        analyzeCode();


        String[] src = new String[]{"1-1", "2-1", "3-1", "4-1", "5-1", "6-1", "7-1", "8-1", "9-1", "10-1", "11-1"};
        String[] dest = new String[]{"1-2", "2-2", "3-2", "4-2", "5-2", "6-2", "7-2", "8-2", "9-2", "10-2", "11-2"};

        System.arraycopy(src, 4, dest, 9, 2);

        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }

    /**
     * 分析部分源码
     */
    private static void analyzeCode() {
        ArrayList<String> list = new ArrayList<>();
        list.add("第1");
        list.add("第2");
        list.add("第3");
        list.add("第4");
        list.add("第5");
        list.add("第6");
        list.add("第7");
        list.add("第8");
        list.add("第9");
        list.add("第10");
        list.add("第11");

        list.remove(6);

        list.get(6);

        list.set(6, "替换");
    }

    /**
     * 三种遍历方式对比
     */
    private static void printTest() {
        List<Integer> list = new ArrayList<>();
        int count = 9999999;
        System.out.println("开始添加 " + count + " 条数据");
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        System.out.println("添加完毕");

        long startTime;
        long endTime;
        long durationTime;

        //随机访问，通过索引值去遍历
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        durationTime = endTime - startTime;
        System.out.println("随机访问，通过索引值去遍历--list.get(i)--耗时:" + durationTime + "毫秒");

        //迭代器
        Iterator<Integer> iterator = list.iterator();
        startTime = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        endTime = System.currentTimeMillis();
        durationTime = endTime - startTime;
        System.out.println("迭代器--耗时:" + durationTime + "毫秒");

        //for-each
        startTime = System.currentTimeMillis();
        for (Integer value : list) {
        }
        endTime = System.currentTimeMillis();
        durationTime = endTime - startTime;
        System.out.println("for-each--耗时:" + durationTime + "毫秒");

    }

    /**
     * clone方法测试
     */
    private static void cloneTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        System.out.println("list开始遍历 : " + list.hashCode());
        for (String str : list) {
            System.out.println(str);
        }


        ArrayList<String> list2 = (ArrayList<String>) list.clone();
        //发生改变时，hashCode值发生改变，说明不会影响原始list数据
        list2.add("4");
        System.out.println("list2开始遍历 : " + list2.hashCode());
        for (String str : list2) {
            System.out.println(str);
        }

        System.out.println("list开始遍历 : " + list.hashCode());
        for (String str : list) {
            System.out.println(str);
        }
    }
}
