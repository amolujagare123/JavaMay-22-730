package CollectionsDemos.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue pq = new  PriorityQueue();

        pq.offer(12);
        pq.offer(1.2);
        pq.offer('j');
        pq.offer("Amol");
        pq.offer(true);

        System.out.println(pq);

    }
}
