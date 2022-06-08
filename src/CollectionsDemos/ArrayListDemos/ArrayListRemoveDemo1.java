package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(7);
        al.add(89);
        al.add(78);
        al.add(11);
        al.add(12);
        al.add(56);

        System.out.println("al="+al);

     //  al.remove(2); // 2 is primitive
        al.remove(89); // 89 as primitive
        //al.remove(11);

        Integer ii1 = new Integer(89); // wrapping / boxing
        al.remove(ii1);

        al.remove(new Integer(89));

        Integer ii = 11; // auto wrapping / autoboxing
        al.remove(ii);

        System.out.println("al="+al);







    }
}
