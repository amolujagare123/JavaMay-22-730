package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayRemoveIfDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(7);
        al.add(89);
        al.add(78);
        al.add(11);
        al.add(12);
        al.add(56);

        // remove the elements which are even
        System.out.println(al);
        al.removeIf( a -> a%2 == 0 );

        System.out.println(al);


    }
}
