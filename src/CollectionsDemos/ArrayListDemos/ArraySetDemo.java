package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArraySetDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("Ayushee");
        al.add("Jyoti");
        al.add("Pallavi");
        al.add("Paramesh");
        al.add("Priyanka");
        al.add("Puja");

        System.out.println(al);

        al.set(5,"abcd");

        System.out.println(al);


    }
}
