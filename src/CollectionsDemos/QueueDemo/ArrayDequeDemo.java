package CollectionsDemos.QueueDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("physics");
        adq.offer("chemistry");
        adq.offer("Maths");
        adq.offer("Electronics");
        adq.offer("Biology");
        adq.offer("IT");

        System.out.println(adq);

        adq.offerFirst("First");
        adq.offerLast("Last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
}
