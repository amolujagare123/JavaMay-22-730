package CollectionsDemos.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {


        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(11);
        ts.add(66);
        ts.add(45);
        ts.add(33);
        System.out.println(ts.add(11));
       // ts.add(null);

        System.out.println(ts);

    }
}
