package CollectionsDemos.VectorDemos;

import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(); // default initial capacity is 10

        System.out.println("Size="+v.size());// 0
        System.out.println("Capacity="+v.capacity());// 10

        v.add("amol");
        v.add("Ayushee");
        v.add("Jyoti");
        v.add("Pallavi");
        v.add("Paramesh");
        v.add("Priyanka");
        v.add("Puja");
        v.add("Puja");
        v.add(null);
        v.add("Priyanka");
        v.add("Priyanka");
        v.add("amol");
        v.add("Ayushee");
        v.add("Jyoti");
        v.add("Pallavi");
        v.add("Paramesh");
        v.add("Priyanka");
        v.add("Puja");
        v.add("Puja");
        v.add(null);
        v.add(null);


        System.out.println("Size="+v.size());// 21
     System.out.println("Capacity="+v.capacity());// 20

    }
}
