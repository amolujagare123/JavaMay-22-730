package CollectionsDemos.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo2 {

    public static void main(String[] args) {


        TreeSet<String> ts = new TreeSet<>();

        ts.add("amol");
        ts.add("rahul");
        ts.add("rohit");
        ts.add("pranav");
        ts.add("vaibhav");
        System.out.println(ts.add("vaibhav"));
       // ts.add(null);

        System.out.println(ts);

    }
}
