package CollectionsDemos.stackDemos;

import java.util.Stack;

public class StackDemo3 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("java");//0 | 5
        s.push("c");//1 | 4
        s.push("c++");//2 | 3
        s.push("Cobol");//3 | 2
        s.push("python");//4 | 1

        System.out.println(s.search("c"));


    }
}
