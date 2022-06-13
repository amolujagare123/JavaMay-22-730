package CollectionsDemos.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo2 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new  PriorityQueue();

        pq.offer(12);
        pq.offer(43);
        pq.offer(7);
        pq.offer(9);
        pq.offer(8);
        pq.offer(111);

        System.out.println(pq);

        // 7,8,9,12,43,111

        // some operating systems does not support
        // priority queue so the displayed output
        // is random order
        // but internally they are stored in the
        // proper order only

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        System.out.println(pq);

    }
}
