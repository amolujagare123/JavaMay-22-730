package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class RemoveIfDemo3 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(7);
        al.add(89);
        al.add(78);
        al.add(11);
        al.add(12);
        al.add(56);

        System.out.println(al);

        //  remove the elements which are greater than 20

        al.removeIf( a -> a > 20   );

        System.out.println(al);

    }
}
