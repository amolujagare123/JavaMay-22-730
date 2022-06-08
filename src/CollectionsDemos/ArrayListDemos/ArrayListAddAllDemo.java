package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListAddAllDemo {

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
        al1.add("Ayushee1");
        al1.add("Ayushee2");

        System.out.println("Before addALL");
        System.out.println("al1="+al1);

        System.out.println("After addALL");

        al1.addAll(al);

        System.out.println("al1="+al1);



    }
}
