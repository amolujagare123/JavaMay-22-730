package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("Ayushee");
        al.add("Jyoti");
        al.add("Pallavi");
        al.add("Paramesh");
        al.add("Priyanka");
        al.add("Puja");

        System.out.println("al="+al);
        al.remove("amol");

        System.out.println("al="+al);
        al.remove(3);

        System.out.println("al="+al);






    }
}
