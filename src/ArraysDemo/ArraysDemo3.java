package ArraysDemo;

public class ArraysDemo3 {

    public static void main(String[] args) {

        char[] a = new char[5];

        a[0] = 'j';
        a[1] = 'a';
        a[2] = 's';
        a[3] = 'd';
        a[4] = 'f';

        System.out.println("size="+a.length);


        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
