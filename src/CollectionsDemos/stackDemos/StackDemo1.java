package CollectionsDemos.stackDemos;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("java");
        s.push("c");
        s.push("c++");
        s.push("Cobol");
        s.push("python");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);
    }
}
