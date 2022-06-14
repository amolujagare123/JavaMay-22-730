package CollectionsDemos.MapDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDem {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();
        
        tm.put(101,"amol");
        tm.put(201,"ashish");
        tm.put(211,"rajesh");
        tm.put(123,"ashish");
        tm.put(223,"manish");
        tm.put(212,"abcd");
        tm.put(221,"sandhya");

        System.out.println("hm="+tm);



    }
}
