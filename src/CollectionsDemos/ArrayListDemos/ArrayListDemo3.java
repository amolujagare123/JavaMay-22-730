package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

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
        System.out.println("size= "+al.size());

        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

     //   using for each
        System.out.println("------> using for each ");
        for (String str : al)
        {
            System.out.println(str);
        }

        // using iterator
        System.out.println("------> using iterator  ");

        Iterator itr = al.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
