package CollectionsDemos.VectorDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(); // default initial capacity is 10

        v.add("amol");
        v.add("Ayushee");
        v.add("Jyoti");
        v.add("Pallavi");
        v.add("Paramesh");
        v.add("Priyanka");
        v.add("Puja");

        System.out.println("--- Using iterator ---");

        Iterator itr = v.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("--- Using Enumeration ---");

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
