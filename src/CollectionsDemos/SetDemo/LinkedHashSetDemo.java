package CollectionsDemos.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(11);
        lhs.add(66);
        lhs.add(45);
        lhs.add(33);
        System.out.println(lhs.add(11));
        lhs.add(null);

        System.out.println(lhs);

    }
}
