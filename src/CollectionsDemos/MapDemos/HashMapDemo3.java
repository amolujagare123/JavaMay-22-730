package CollectionsDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo3 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println("isEmpty = "+hm.isEmpty()); // true


        hm.put(101,"amol");
        hm.put(201,"ashish");
        hm.put(211,"rajesh");
        hm.put(123,"ashish");
        hm.put(223,"manish");
        hm.put(212,"abcd");
        hm.put(221,"sandhya");

        System.out.println("hm="+hm);

        System.out.println(hm.get(101));

        System.out.println(hm.containsKey(220));
        System.out.println(hm.containsValue("rajesh"));

        System.out.println("isEmpty = "+hm.isEmpty()); // false

        System.out.println(hm.size());

        hm.remove(101);

        System.out.println("hm="+hm);

        hm.clear();

        System.out.println("hm="+hm);


    }
}
