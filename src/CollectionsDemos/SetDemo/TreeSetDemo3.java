package CollectionsDemos.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {


        TreeSet ts = new TreeSet();

        ts.add("amol");
        ts.add(1);
        ts.add("rohit");
        ts.add("pranav");
        ts.add("vaibhav");
        System.out.println(ts.add("vaibhav"));
       // ts.add(null);

        System.out.println(ts);

    }
}
