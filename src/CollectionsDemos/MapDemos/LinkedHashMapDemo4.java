package CollectionsDemos.MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo4 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(101,"amol");
        lhm.put(201,"ashish");
        lhm.put(211,"rajesh");
        lhm.put(123,"ashish");
        lhm.put(223,"manish");
        lhm.put(212,"abcd");
        lhm.put(221,"sandhya");

        System.out.println("hm="+lhm);



    }
}
