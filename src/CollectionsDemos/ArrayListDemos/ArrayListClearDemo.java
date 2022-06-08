package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListClearDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty());// true

        al.add("amol");
        al.add("Ayushee");
        al.add("Jyoti");
        al.add("Pallavi");
        al.add("Paramesh");
        al.add("Priyanka");
        al.add("Puja");

        System.out.println(al.isEmpty());// false

        System.out.println("Before clear");
        System.out.println(al);

        al.clear();
        System.out.println("After clear");
        System.out.println(al);

        System.out.println(al.isEmpty());// true

    }
}
