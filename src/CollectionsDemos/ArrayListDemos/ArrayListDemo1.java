package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(12);
        al.add(32);
        al.add(72);
        al.add('9');
        al.add("amol");
        al.add(true);

        // If you want to restrict the arraylist
        // to accept only some particular types of elements

        ArrayList<String> al1 = new ArrayList<>();

     /*   al1.add(12);
        al1.add(32);
        al1.add(72);
        al1.add('9');
        al1.add("amol");
        al1.add(true);*/
        al1.add("ayushee");

        // integers
        ArrayList<Boolean> al2 = new ArrayList<>();

    }
}
