package ArraysDemo;

public class ArraysDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 25;
        a[1] = 15;
        a[2] = 45;
        a[3] = 35;
        a[4] = 55;

        System.out.println("size="+a.length);

        System.out.println(a[3]);

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        a[2] = 0;


        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
