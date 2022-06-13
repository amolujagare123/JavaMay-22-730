package CollectionsDemos.stackDemos;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push("java");
        s.push("c");
        s.push("c++");
        s.push("Cobol");
        s.push("python");

        System.out.println(s.empty()); // false

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);


    }
}
