package chapter5linkedlist;

import java.util.LinkedList;

/**
 * Created by Ian.Lu on 2018/1/29.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {

//        testLinkedListAPIs();

//        useLinkedListAsLIFO();

//        useLinkedListAsFIFO();

//        analyzeCodeAPIs();

//        analyzeCodeLIFO();

        analyzeCodeFIFO();
    }

    private static void analyzeCodeFIFO() {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("第一");
        queue.add("第二");
        queue.add("第三");
        queue.add("第四");

        queue.remove();

        queue.element();
    }

    private static void analyzeCodeLIFO() {
        LinkedList<String> stuck = new LinkedList<>();

        stuck.push("第一");
        stuck.push("第二");
        stuck.push("第三");
        stuck.push("第四");

        stuck.pop();

        stuck.peek();
    }

    private static void analyzeCodeAPIs() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("第1");
        linkedList.add("第2");
        linkedList.add("第3");

        linkedList.addFirst("将我addFirst到第一个位置");
        linkedList.offerFirst("将我offerFirst到第一个位置");

        linkedList.removeFirst();
        linkedList.pollFirst();

        linkedList.peekFirst();
    }

    /**
     * 将LinkedList当作 FIFO(先进先出)的队列
     */
    private static void useLinkedListAsFIFO() {
        System.out.println("将LinkedList当作 FIFO(先进先出)的队列");
        LinkedList<String> queue = new LinkedList<>();

        queue.add("第一");
        queue.add("第二");
        queue.add("第三");
        queue.add("第四");
        printAll(queue, "add");

        System.out.println("queue.remove() : " + queue.remove());
        printAll(queue, "queue.remove()");

        System.out.println("queue.element() : " + queue.element());
        System.out.println();

        System.out.println("直接打印 : " + queue);
    }

    /**
     * 将LinkedList当作LIFO(后进先出)的堆栈
     */
    private static void useLinkedListAsLIFO() {
        System.out.println("将LinkedList当作LIFO(后进先出)的堆栈");
        LinkedList<String> stuck = new LinkedList<>();

        stuck.push("第一");
        stuck.push("第二");
        stuck.push("第三");
        stuck.push("第四");
        printAll(stuck, "push");

        //删除栈顶元素
        System.out.println("stuck.pop() : " + stuck.pop());
        printAll(stuck, "stuck.pop()");

        //取出栈顶元素
        System.out.println("stuck.peek() : " + stuck.peek());
        System.out.println();

        //直接打印栈
        System.out.println(stuck);
    }

    /**
     * 基本操作
     */
    private static void testLinkedListAPIs() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("第1");
        linkedList.add("第2");
        linkedList.add("第3");
        //添加数据到指定位置
        linkedList.add(1, "我是插进来的,index=1");
        printAll(linkedList, "添加数据到指定位置");

        linkedList.addFirst("将我addFirst到第一个位置");
        printAll(linkedList, "addFirst");
        System.out.println("linkedList.removeFirst() 删除并返回: " + linkedList.removeFirst());
        printAll(linkedList, "removeFirst");
        System.out.println("linkedList.getFirst() : " + linkedList.getFirst());
        System.out.println();

        linkedList.offerFirst("将我offerFirst到第一个位置");
        printAll(linkedList, "offerFirst");
        //将第一个元素删除并返回。
        System.out.println("linkedList.pollFirst() 删除并返回: " + linkedList.pollFirst());
        printAll(linkedList, "linkedList.pollFirst()");
        //获取第一个元素
        System.out.println("linkedList.peekFirst() : " + linkedList.peekFirst());
        System.out.println();

        //将LinkedList转化为数组
        System.out.println("将LinkedList转化为数组");
        String[] arr = linkedList.toArray(new String[0]);
        for (String str : arr) {
            System.out.print(str + "、");
        }
    }

    private static void printAll(LinkedList<String> linkedList, String textStr) {
        System.out.println(textStr + " : ");

        int index = 0;
        for (String str : linkedList) {
            System.out.println(index++ + ":" + str);
        }

        System.out.println();
    }
}
