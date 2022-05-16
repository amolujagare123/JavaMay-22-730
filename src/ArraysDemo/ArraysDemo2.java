package ArraysDemo;

public class ArraysDemo2 {

    public static void main(String[] args) {

        double[] a = new double[5];

        a[0] = 25.45;
        a[1] = 15.11;
        a[2] = 45.32;
        a[3] = 35.45;
        a[4] = 55.10;

        System.out.println("size="+a.length);


        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
