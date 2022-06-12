package CollectionsDemos.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("Ayushee");
        ll.add("Jyoti");
        ll.add("Pallavi");
        ll.add("Paramesh");
        ll.add("Priyanka");
        ll.add("Puja");
        ll.add("Puja");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);



    }
}
