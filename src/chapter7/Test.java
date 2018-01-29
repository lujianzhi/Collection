package chapter7;

import java.util.Stack;

/**
 * Created by Ian.Lu on 2018/1/29.
 * Project : Collection
 */
public class Test {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("第1");
        stack.push("第2");
        stack.push("第3");
        stack.push("第4");
        stack.push("第5");
        printAll(stack);

        int position = stack.search("第4");
        System.out.println("从栈顶往栈底搜索:stack.search(\"第4\") : " + position);
        System.out.println();

        System.out.println("stack.peek() : " + stack.peek());
        System.out.println();

        System.out.println("stack.pop() : " + stack.pop());
        printAll(stack);

    }

    private static void printAll(Stack<String> stack) {
        for (String str : stack) {
            System.out.println(str);
        }
        System.out.println();
    }
}
