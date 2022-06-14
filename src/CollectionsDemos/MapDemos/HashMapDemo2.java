package CollectionsDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(101,"amol");
        hm.put(201,"ashish");
        hm.put(211,"rajesh");
        hm.put(123,"ashish");
        hm.put(223,"manish");
        hm.put(212,"abcd");
        hm.put(221,"sandhya");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm2 = new HashMap<>();

        System.out.println("hm2="+hm2);

        hm2.putAll(hm);

        System.out.println("hm2="+hm2);



    }
}
