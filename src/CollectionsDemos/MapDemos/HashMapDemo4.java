package CollectionsDemos.MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo4 {
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

        Set s = hm.keySet();
        System.out.println("Key Set = "+s);

        Collection c = hm.values();
        System.out.println("Values = "+c);

        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);


    }
}
