package CollectionsDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101,"amol");
        hm.put(201,"ashish");
        hm.put(211,"rajesh");
        hm.put('f',111);
        hm.put("str","ashish");
        hm.put(true,11);
        hm.put(2.01,"ashish");

        System.out.println(  hm.put(211,"abcd"));

        hm.put(111,"ashish");
        hm.put(112,null);
        hm.put(113,null);
        hm.put(null,"aaa");
        hm.put(null,"bbb");

        System.out.println(hm);

    }
}
