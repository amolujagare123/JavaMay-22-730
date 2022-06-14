package CollectionsDemos.SetDemo;

import java.util.HashSet;

public class HashSetDemo2 {

    public static void main(String[] args) {


        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(11);
        hs.add(66);
        hs.add(45);
        hs.add(33);
        System.out.println(hs.add(11));
        hs.add(null);

        System.out.println(hs);

    }
}
