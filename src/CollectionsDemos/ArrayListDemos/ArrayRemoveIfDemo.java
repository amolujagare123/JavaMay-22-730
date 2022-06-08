package CollectionsDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayRemoveIfDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Amol");
        al.add("Ayushee");
        al.add("Jyoti");
        al.add("Pallavi");
        al.add("Paramesh");
        al.add("Priyanka");
        al.add("Puja");

        System.out.println(al);

        // 1. remove elements that starts with 'A'
        // str --> str.chatAt(0)== 'A' |

     //   al.removeIf(str ->  str.charAt(0)== 'A');

        al.removeIf(s ->  s.startsWith("A"));


        System.out.println(al);


    }
}
