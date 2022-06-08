package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(12);
        al.add(32);
        al.add(72);
        al.add('9');
        al.add("amol");
        al.add(true);

        System.out.println(al);


        for (Object o :al)
            System.out.println(o);

    }
}
