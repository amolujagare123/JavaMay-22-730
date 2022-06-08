package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListremoveAllDemo {

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

        ArrayList<String> al1 = new ArrayList<>();

        al1.add("amol1");
        al1.add("Ayushee1");
        al1.add("Jyoti1");
        al1.add("Pallavi");
        al1.add("Paramesh");

        System.out.println("Before remove ALL");
        System.out.println("al1="+al1);

        al1.removeAll(al);

        System.out.println("After remove ALL");
        System.out.println("al1="+al1);


    }
}
